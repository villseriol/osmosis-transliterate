// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.report;

import java.util.Collection;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.villseriol.osmosis.common.UnicodeRange;
import org.villseriol.osmosis.detective.v0_6.model.PreProcessingCharacterMapRecord;


public class PreProcessingCharacterMapReport extends DetReport {
    private Map<UnicodeRange, Collection<PreProcessingCharacterMapRecord>> data;

    private DetReportCursor cursor = new DetReportCursor();

    private Font headerFont;
    private CellStyle headerStyle;

    public PreProcessingCharacterMapReport(Map<UnicodeRange, Collection<PreProcessingCharacterMapRecord>> data) {
        this.data = data;
    }


    @Override
    protected void setup(Workbook workbook) {
        headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 12);

        headerStyle = workbook.createCellStyle();
        headerStyle.setFont(headerFont);
    }


    private void addHeaderRow(Sheet sheet) {
        Row row = sheet.createRow(cursor.getRow());

        int fromHeaderCol = cursor.getCol();
        row.createCell(fromHeaderCol).setCellValue("From");
        sheet.setColumnWidth(fromHeaderCol, 32);
        int fromNameHeaderCol = cursor.nextCol();
        row.createCell(fromNameHeaderCol).setCellValue("From Name");
        sheet.setColumnWidth(fromNameHeaderCol, 128);
        int toHeaderCol = cursor.nextCol();
        row.createCell(toHeaderCol).setCellValue("To");
        sheet.setColumnWidth(toHeaderCol, 32);
        int toNameHeaderCol = cursor.nextCol();
        row.createCell(toNameHeaderCol).setCellValue("To Name");
        sheet.setColumnWidth(toNameHeaderCol, 128);
        int occurrencesHeaderCol = cursor.nextCol();
        row.createCell(occurrencesHeaderCol).setCellValue("Occurrences");
        sheet.setColumnWidth(occurrencesHeaderCol, 32);
        int reservedHeaderCol = cursor.nextCol();
        row.createCell(reservedHeaderCol).setCellValue("Reserved");
        sheet.setColumnWidth(reservedHeaderCol, 32);

        row.getCell(fromHeaderCol).setCellStyle(headerStyle);
        row.getCell(fromNameHeaderCol).setCellStyle(headerStyle);
        row.getCell(toHeaderCol).setCellStyle(headerStyle);
        row.getCell(toNameHeaderCol).setCellStyle(headerStyle);
        row.getCell(occurrencesHeaderCol).setCellStyle(headerStyle);
        row.getCell(reservedHeaderCol).setCellStyle(headerStyle);

        cursor.resetCol();
        cursor.nextRow();
    }


    private void addDataRow(Sheet sheet, PreProcessingCharacterMapRecord record) {
        Row row = sheet.createRow(cursor.getRow());

        int fromCol = cursor.getCol();
        row.createCell(fromCol).setCellValue(record.getFrom().toString());

        int fromNameCol = cursor.nextCol();
        row.createCell(fromNameCol).setCellValue(record.getFromName());

        int toCol = cursor.nextCol();
        row.createCell(toCol).setCellValue(record.getTo().toString());

        int toNameCol = cursor.nextCol();
        row.createCell(toNameCol).setCellValue(record.getToName());

        cursor.nextCol();

        int reservedCol = cursor.nextCol();
        row.createCell(reservedCol).setCellValue(record.isFromReserved());

        cursor.resetCol();
        cursor.nextRow();
    }


    public Map<UnicodeRange, Collection<PreProcessingCharacterMapRecord>> getData() {
        return data;
    }


    public void setData(Map<UnicodeRange, Collection<PreProcessingCharacterMapRecord>> data) {
        this.data = data;
    }


    @Override
    protected void generate(Workbook workbook) {
        for (Map.Entry<UnicodeRange, Collection<PreProcessingCharacterMapRecord>> entry : data.entrySet()) {
            Sheet sheet = workbook.createSheet(entry.getKey().getAlias());

            addHeaderRow(sheet);

            for (PreProcessingCharacterMapRecord record : entry.getValue()) {
                addDataRow(sheet, record);
            }

            cursor.reset();
        }
    }
}
