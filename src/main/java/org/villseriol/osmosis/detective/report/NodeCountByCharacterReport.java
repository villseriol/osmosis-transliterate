// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.report;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.villseriol.osmosis.common.UnicodeRange;
import org.villseriol.osmosis.detective.v0_6.model.NodeCountByCharacterRecord;


public class NodeCountByCharacterReport extends DetReport {
    private Map<UnicodeRange, List<NodeCountByCharacterRecord>> data;

    private Font headerFont;
    private CellStyle headerStyle;

    private DetReportCursor cursor = new DetReportCursor();

    public NodeCountByCharacterReport() {
        this.data = Collections.emptyMap();
    }


    public NodeCountByCharacterReport(final Map<Character, NodeCountByCharacterRecord> data) {
        this.data = data.values().stream()
                .collect(Collectors.groupingBy(record -> UnicodeRange.fromCharacter(record.getCharacter())));
    }


    @Override
    protected void setup(Workbook wb) {
        headerFont = wb.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 12);

        headerStyle = wb.createCellStyle();
        headerStyle.setFont(headerFont);
    }


    private void addHeaderRow(Sheet sheet) {
        Row row = sheet.createRow(cursor.getRow());

        int characterHeaderCol = cursor.getCol();
        row.createCell(characterHeaderCol).setCellValue("Character");
        sheet.setColumnWidth(characterHeaderCol, 3);
        int nameHeaderCol = cursor.nextCol();
        row.createCell(nameHeaderCol).setCellValue("Name");
        sheet.setColumnWidth(nameHeaderCol, 256);
        int occurrencesHeaderCol = cursor.nextCol();
        row.createCell(occurrencesHeaderCol).setCellValue("Occurrences");
        sheet.setColumnWidth(occurrencesHeaderCol, 64);
        int examplesHeaderCol = cursor.nextCol();
        row.createCell(examplesHeaderCol).setCellValue("Examples");
        sheet.setColumnWidth(examplesHeaderCol, 512);

        row.getCell(characterHeaderCol).setCellStyle(headerStyle);
        row.getCell(nameHeaderCol).setCellStyle(headerStyle);
        row.getCell(occurrencesHeaderCol).setCellStyle(headerStyle);
        row.getCell(examplesHeaderCol).setCellStyle(headerStyle);

        cursor.resetCol();
        cursor.nextRow();
    }


    private void addDataRow(Sheet sheet, NodeCountByCharacterRecord record) {
        Row row = sheet.createRow(cursor.getRow());

        int characterCol = cursor.getCol();
        row.createCell(characterCol).setCellValue(record.getCharacter().toString());

        int nameCol = cursor.nextCol();
        row.createCell(nameCol).setCellValue(Character.getName(record.getCharacter()));

        int occurrencesCol = cursor.nextCol();
        row.createCell(occurrencesCol).setCellValue(record.getOccurences());

        int examplesCol = cursor.nextCol();
        boolean firstExample = true;
        for (String example : record.getExamples()) {
            if (!firstExample) {
                cursor.nextRow();
                row = sheet.createRow(cursor.getRow());
            }

            row.createCell(examplesCol).setCellValue(example);
            firstExample = false;
        }

        cursor.resetCol();
        cursor.nextRow();
    }


    public Map<UnicodeRange, List<NodeCountByCharacterRecord>> getData() {
        return data;
    }


    public void setData(Map<UnicodeRange, List<NodeCountByCharacterRecord>> data) {
        this.data = data;
    }


    @Override
    protected void generate(Workbook wb) {
        for (Map.Entry<UnicodeRange, List<NodeCountByCharacterRecord>> entry : data.entrySet()) {
            Sheet sheet = wb.createSheet(entry.getKey().getAlias());

            addHeaderRow(sheet);

            for (NodeCountByCharacterRecord record : entry.getValue()) {
                addDataRow(sheet, record);
            }

            cursor.reset();
        }
    }
}
