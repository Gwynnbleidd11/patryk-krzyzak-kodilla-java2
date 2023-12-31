package com.remote.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<Figure> cols = new ArrayList<>();

    public BoardRow() {
        for (int n = 0; n < 8; n++) {
            cols.add(new None());
        }
    }

    public List<Figure> getCols() {
        return cols;
    }

    @Override
    public String toString() {
        String s = "|";
        for (int col = 0; col < cols.size(); col ++)
            s += cols.get(col).toString() + "|";
        s += "\n";
        return s;
    }
}
