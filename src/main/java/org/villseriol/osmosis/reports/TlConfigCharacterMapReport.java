// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.reports;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;


public class TlConfigCharacterMapReport extends Report {
    private Map<UnicodeRange, Collection<TlConfigCharacterMapRecord>> data;

    private ReportCursor cursor = new ReportCursor();

    private Font headerFont;
    private CellStyle headerStyle;
    private CellStyle yesNoStyle;

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

        DataFormat dataFormat = workbook.createDataFormat();
        yesNoStyle = workbook.createCellStyle();
        yesNoStyle.setDataFormat(dataFormat.getFormat("\"Yes\";\"No\";\"No\""));
    }


    private void addHeaderRow(Sheet sheet) {
        Row row = sheet.createRow(cursor.getRow());

        int fromCol = cursor.getCol();
        row.createCell(fromCol).setCellValue("From");
        sheet.setColumnWidth(fromCol, 8 * 256);
        int fromNameCol = cursor.nextCol();
        row.createCell(fromNameCol).setCellValue("From Name");
        sheet.setColumnWidth(fromNameCol, 32 * 256);
        int fromCodeCol = cursor.nextCol();
        row.createCell(fromCodeCol).setCellValue("From Code");
        sheet.setColumnWidth(fromCodeCol, 10 * 256);
        int fromReservedCol = cursor.nextCol();
        row.createCell(fromReservedCol).setCellValue("Reserved");
        sheet.setColumnWidth(fromReservedCol, 10 * 256);
        int toCol = cursor.nextCol();
        row.createCell(toCol).setCellValue("To");
        sheet.setColumnWidth(toCol, 8 * 256);
        int toNameCol = cursor.nextCol();
        row.createCell(toNameCol).setCellValue("To Name");
        sheet.setColumnWidth(toNameCol, 32 * 256);
        int toCodeCol = cursor.nextCol();
        row.createCell(toCodeCol).setCellValue("To Code");
        sheet.setColumnWidth(toCodeCol, 10 * 256);
        int toLatin1CompliantCol = cursor.nextCol();
        row.createCell(toLatin1CompliantCol).setCellValue("Latin1");
        sheet.setColumnWidth(toLatin1CompliantCol, 10 * 256);

        row.getCell(fromCol).setCellStyle(headerStyle);
        row.getCell(fromNameCol).setCellStyle(headerStyle);
        row.getCell(fromCodeCol).setCellStyle(headerStyle);
        row.getCell(fromReservedCol).setCellStyle(headerStyle);
        row.getCell(toCol).setCellStyle(headerStyle);
        row.getCell(toNameCol).setCellStyle(headerStyle);
        row.getCell(toCodeCol).setCellStyle(headerStyle);
        row.getCell(toLatin1CompliantCol).setCellStyle(headerStyle);

        cursor.resetCol();
        cursor.nextRow();
    }


    private void addDataRow(Sheet sheet, TlConfigCharacterMapRecord record) {
        Row row = sheet.createRow(cursor.getRow());

        int fromCol = cursor.getCol();
        row.createCell(fromCol).setCellValue(new String(Character.toChars(record.getFrom())));

        int fromNameCol = cursor.nextCol();
        row.createCell(fromNameCol).setCellValue(record.getFromName());

        int fromCodeCol = cursor.nextCol();
        row.createCell(fromCodeCol).setCellValue(record.getFromCodePoints());

        int fromReservedCol = cursor.nextCol();
        Cell fromReservedCell = row.createCell(fromReservedCol);
        fromReservedCell.setCellStyle(yesNoStyle);
        if (record.isFromReserved()) {
            fromReservedCell.setCellValue(1);
        } else {
            fromReservedCell.setCellValue(0);
        }

        int toCol = cursor.nextCol();
        row.createCell(toCol).setCellValue(record.getTo().toString());

        int toNameCol = cursor.nextCol();
        row.createCell(toNameCol).setCellValue(record.getToName());

        int toCodeCol = cursor.nextCol();
        row.createCell(toCodeCol).setCellValue(record.getToCodePoints());

        int toLatin1CompliantCol = cursor.nextCol();
        Cell toLatin1CompliantCell = row.createCell(toLatin1CompliantCol);
        toLatin1CompliantCell.setCellStyle(yesNoStyle);
        if (record.isToLatin1Compliant()) {
            toLatin1CompliantCell.setCellValue(1);
        } else {
            toLatin1CompliantCell.setCellValue(0);
        }

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
        List<Map.Entry<UnicodeRange, Collection<TlConfigCharacterMapRecord>>> sortedEntries = new ArrayList<>(
                data.entrySet());
        sortedEntries.sort(Map.Entry.comparingByKey());

        for (Map.Entry<UnicodeRange, Collection<TlConfigCharacterMapRecord>> entry : sortedEntries) {
            Sheet sheet = workbook.createSheet(entry.getKey().getAlias());

            addHeaderRow(sheet);

            for (TlConfigCharacterMapRecord record : entry.getValue()) {
                addDataRow(sheet, record);
            }

            cursor.reset();
        }
    }
}
