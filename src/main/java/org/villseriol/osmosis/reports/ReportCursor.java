// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.reports;

public class ReportCursor {
    private int col;
    private int row;

    public ReportCursor(int col, int row) {
        this.col = col;
        this.row = row;
    }


    public ReportCursor() {
        this.col = 0;
        this.row = 0;
    }


    public ReportCursor(ReportCursor cursor) {
        this.col = cursor.col;
        this.row = cursor.row;
    }


    public int nextCol() {
        return ++col;
    }


    public int nextRow() {
        return ++row;
    }


    public int previousCol() {
        return --col;
    }


    public int previousRow() {
        return --row;
    }


    public int getCol() {
        return col;
    }


    public int getRow() {
        return row;
    }


    public void reset() {
        col = 0;
        row = 0;
    }


    public void resetRow() {
        row = 0;
    }


    public void resetCol() {
        col = 0;
    }

}
