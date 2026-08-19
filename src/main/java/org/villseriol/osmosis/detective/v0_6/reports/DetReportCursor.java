// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.reports;

public class DetReportCursor {
    private int row;
    private int col;

    public DetReportCursor(int x, int y) {
        this.row = x;
        this.col = y;
    }


    public DetReportCursor() {
        this.row = 0;
        this.col = 0;
    }


    public DetReportCursor(DetReportCursor cursor) {
        this.row = cursor.row;
        this.col = cursor.col;
    }


    public int nextCol() {
        return ++row;
    }


    public int nextRow() {
        return ++col;
    }


    public int previousCol() {
        return --row;
    }


    public int previousRow() {
        return --col;
    }


    public int getRow() {
        return row;
    }


    public int getCol() {
        return col;
    }


    public void reset() {
        row = 0;
        col = 0;
    }


    public void resetRow() {
        row = 0;
    }


    public void resetCol() {
        col = 0;
    }

}
