// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.report;

import java.util.Collection;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.villseriol.osmosis.common.UnicodeRange;
import org.villseriol.osmosis.detective.v0_6.model.TlConfigCharacterMapRecord;


public class TlConfigCharacterMapReport extends DetReport {
    private Map<UnicodeRange, Collection<TlConfigCharacterMapRecord>> data;

    private DetReportCursor cursor = new DetReportCursor();

    private Font headerFont;
    private CellStyle headerStyle;

    public TlConfigCharacterMapReport(Map<UnicodeRange, Collection<TlConfigCharacterMapRecord>> data) {
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
        Row groupRow = sheet.createRow(cursor.getRow());

        int fromGroupCol = cursor.getCol();
        groupRow.createCell(fromGroupCol).setCellValue("From");
        groupRow.getCell(fromGroupCol).setCellStyle(headerStyle);

        int toGroupCol = fromGroupCol + 4;
        groupRow.createCell(toGroupCol).setCellValue("To");
        groupRow.getCell(toGroupCol).setCellStyle(headerStyle);

        sheet.addMergedRegion(new CellRangeAddress(cursor.getRow(), cursor.getRow(), fromGroupCol, fromGroupCol + 3));
        sheet.addMergedRegion(new CellRangeAddress(cursor.getRow(), cursor.getRow(), toGroupCol, toGroupCol + 3));

        cursor.nextRow();

        Row row = sheet.createRow(cursor.getRow());

        int fromCol = cursor.getCol();
        row.createCell(fromCol).setCellValue("From");
        sheet.setColumnWidth(fromCol, 32);
        int fromNameCol = cursor.nextCol();
        row.createCell(fromNameCol).setCellValue("From Name");
        sheet.setColumnWidth(fromNameCol, 128);
        int fromCodeCol = cursor.nextCol();
        row.createCell(fromCodeCol).setCellValue("From Code");
        sheet.setColumnWidth(fromCodeCol, 32);
        int fromReservedCol = cursor.nextCol();
        row.createCell(fromReservedCol).setCellValue("Reserved");
        sheet.setColumnWidth(fromReservedCol, 32);
        int toCol = cursor.nextCol();
        row.createCell(toCol).setCellValue("To");
        sheet.setColumnWidth(toCol, 32);
        int toNameCol = cursor.nextCol();
        row.createCell(toNameCol).setCellValue("To Name");
        sheet.setColumnWidth(toNameCol, 128);
        int toCodeCol = cursor.nextCol();
        row.createCell(toCodeCol).setCellValue("To Code");
        sheet.setColumnWidth(toCodeCol, 32);
        int toReservedCol = cursor.nextCol();
        row.createCell(toReservedCol).setCellValue("Reserved");
        sheet.setColumnWidth(toReservedCol, 32);

        row.getCell(fromCol).setCellStyle(headerStyle);
        row.getCell(fromNameCol).setCellStyle(headerStyle);
        row.getCell(fromCodeCol).setCellStyle(headerStyle);
        row.getCell(fromReservedCol).setCellStyle(headerStyle);
        row.getCell(toCol).setCellStyle(headerStyle);
        row.getCell(toNameCol).setCellStyle(headerStyle);
        row.getCell(toCodeCol).setCellStyle(headerStyle);
        row.getCell(toReservedCol).setCellStyle(headerStyle);

        cursor.resetCol();
        cursor.nextRow();
    }


    private void addDataRow(Sheet sheet, TlConfigCharacterMapRecord record) {
        Row row = sheet.createRow(cursor.getRow());

        int fromCol = cursor.getCol();
        row.createCell(fromCol).setCellValue(record.getFrom().toString());

        int fromNameCol = cursor.nextCol();
        row.createCell(fromNameCol).setCellValue(record.getFromName());

        int fromCodeCol = cursor.nextCol();
        row.createCell(fromCodeCol).setCellValue(record.getFromCodePoints());

        int fromReservedCol = cursor.nextCol();
        row.createCell(fromReservedCol).setCellValue(record.isFromReserved());

        int toCol = cursor.nextCol();
        row.createCell(toCol).setCellValue(record.getTo().toString());

        int toNameCol = cursor.nextCol();
        row.createCell(toNameCol).setCellValue(record.getToName());

        int toCodeCol = cursor.nextCol();
        row.createCell(toCodeCol).setCellValue(record.getToCodePoints());

        int toReservedCol = cursor.nextCol();
        row.createCell(toReservedCol).setCellValue(record.isToReserved());

        cursor.resetCol();
        cursor.nextRow();
    }


    public Map<UnicodeRange, Collection<TlConfigCharacterMapRecord>> getData() {
        return data;
    }


    public void setData(Map<UnicodeRange, Collection<TlConfigCharacterMapRecord>> data) {
        this.data = data;
    }


    @Override
    protected void generate(Workbook workbook) {
        for (Map.Entry<UnicodeRange, Collection<TlConfigCharacterMapRecord>> entry : data.entrySet()) {
            Sheet sheet = workbook.createSheet(entry.getKey().getAlias());

            addHeaderRow(sheet);

            for (TlConfigCharacterMapRecord record : entry.getValue()) {
                addDataRow(sheet, record);
            }

            cursor.reset();
        }
    }
}
