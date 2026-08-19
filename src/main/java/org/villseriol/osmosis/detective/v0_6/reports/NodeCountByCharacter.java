// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.reports;

import java.util.Collection;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.villseriol.osmosis.detective.v0_6.reports.models.NodeCountByCharacterRecord;


public class NodeCountByCharacter extends DetReport {
    private final Collection<NodeCountByCharacterRecord> data;

    private Font headerFont;
    private CellStyle headerStyle;
    private Sheet sheet;

    private DetReportCursor cursor = new DetReportCursor();

    public NodeCountByCharacter(Collection<NodeCountByCharacterRecord> data) {
        this.data = data;
    }


    @Override
    protected void setup(Workbook workbook) {
        headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 12);

        headerStyle = workbook.createCellStyle();
        headerStyle.setFont(headerFont);

        sheet = workbook.createSheet();
    }


    private void addHeaderRow() {
        Row row = sheet.createRow(cursor.getRow());

        int characterHeaderCol = cursor.getCol();
        row.createCell(characterHeaderCol).setCellValue("Character");
        sheet.setColumnWidth(characterHeaderCol, 3);
        int nameHeaderCol = cursor.nextCol();
        row.createCell(nameHeaderCol).setCellValue("Name");
        sheet.setColumnWidth(nameHeaderCol, 256);
        int occurencesHeaderCol = cursor.nextCol();
        row.createCell(occurencesHeaderCol).setCellValue("Occurences");
        sheet.setColumnWidth(occurencesHeaderCol, 64);
        int examplesHeaderCol = cursor.nextCol();
        row.createCell(examplesHeaderCol).setCellValue("Examples");
        sheet.setColumnWidth(examplesHeaderCol, 512);

        row.getCell(characterHeaderCol).setCellStyle(headerStyle);
        row.getCell(nameHeaderCol).setCellStyle(headerStyle);
        row.getCell(occurencesHeaderCol).setCellStyle(headerStyle);
        row.getCell(examplesHeaderCol).setCellStyle(headerStyle);

        cursor.resetCol();
        cursor.nextRow();
    }


    private void addDataRow(NodeCountByCharacterRecord record) {
        Row row = sheet.createRow(cursor.getRow());

        int characterCol = cursor.getCol();
        row.createCell(characterCol).setCellValue(record.getCharacter().toString());

        int nameCol = cursor.nextCol();
        row.createCell(nameCol).setCellValue(Character.getName(record.getCharacter()));

        int occurencesCol = cursor.nextCol();
        row.createCell(occurencesCol).setCellValue(record.getOccurences());

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


    @Override
    protected void generate() {
        addHeaderRow();

        for (NodeCountByCharacterRecord record : data) {
            addDataRow(record);
        }

        cursor.reset();
    }
}
