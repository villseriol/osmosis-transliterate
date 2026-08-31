// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.reports;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ReportCursorTest {
    @Test
    public void testNextColIncrementsRowAndReturnsNewValue() {
        ReportCursor cursor = new ReportCursor();

        int result = cursor.nextCol();

        assertEquals(1, result);
        assertEquals(1, cursor.getCol());
        assertEquals(0, cursor.getRow());
    }


    @Test
    public void testNextColAccumulatesAcrossCalls() {
        ReportCursor cursor = new ReportCursor();

        cursor.nextCol();
        cursor.nextCol();
        int result = cursor.nextCol();

        assertEquals(3, result);
        assertEquals(3, cursor.getCol());
    }


    @Test
    public void testNextRowIncrementsColAndReturnsNewValue() {
        ReportCursor cursor = new ReportCursor();

        int result = cursor.nextRow();

        assertEquals(1, result);
        assertEquals(1, cursor.getRow());
        assertEquals(0, cursor.getCol());
    }


    @Test
    public void testNextRowAccumulatesAcrossCalls() {
        ReportCursor cursor = new ReportCursor();

        cursor.nextRow();
        cursor.nextRow();
        int result = cursor.nextRow();

        assertEquals(3, result);
        assertEquals(3, cursor.getRow());
    }


    @Test
    public void testNextColAndNextRowAreIndependent() {
        ReportCursor cursor = new ReportCursor();

        cursor.nextCol();
        cursor.nextCol();
        cursor.nextRow();

        assertEquals(2, cursor.getCol());
        assertEquals(1, cursor.getRow());
    }


    @Test
    public void testNextColAndNextRowStartFromInitialCursorValues() {
        ReportCursor cursor = new ReportCursor(5, 10);

        int rowResult = cursor.nextCol();
        int colResult = cursor.nextRow();

        assertEquals(6, rowResult);
        assertEquals(11, colResult);
        assertEquals(6, cursor.getCol());
        assertEquals(11, cursor.getRow());
    }


    @Test
    public void testCopyConstructorInheritsRowAndCol() {
        ReportCursor original = new ReportCursor(5, 10);

        ReportCursor copy = new ReportCursor(original);

        assertEquals(original.getCol(), copy.getCol());
        assertEquals(original.getRow(), copy.getRow());
    }


    @Test
    public void testNextColAndNextRowOnCopyDoNotAffectOriginal() {
        ReportCursor original = new ReportCursor(5, 10);
        ReportCursor copy = new ReportCursor(original);

        copy.nextCol();
        copy.nextRow();

        assertEquals(5, original.getCol());
        assertEquals(10, original.getRow());
        assertEquals(6, copy.getCol());
        assertEquals(11, copy.getRow());
    }
}
