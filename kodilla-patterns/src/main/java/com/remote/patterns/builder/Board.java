package com.remote.patterns.builder;

import com.kodilla.patterns.builder.checkers.FigureFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Board {
    private List<BoardRow> rows = new ArrayList<>();
    private FigureColor whoseMove;

    private Board() {
        for (int n = 0; n < 8; n++) {
            rows.add(new BoardRow());
        }
    }

    public Figure getFigure(int col, int row) {
        return rows.get(row).getCols().get(col);
    }

    public void setFigure(int col, int row, Figure figure) {
        rows.get(row).getCols().set(col, figure);
    }

    static class Builder {
        private List<FigureOnBoard> figures = new ArrayList<>();
        private FigureColor whoseMove;

        public Builder whoseMove(FigureColor color) {
            this.whoseMove = color;
            return this;
        }

        public Builder figure(int col, int row, FigureType figureType, FigureColor figureColor) {
            figures.add(new FigureOnBoard(col, row, figureType, figureColor));
            return this;
        }

        public Board build() {
            Board board = new Board();
            board.whoseMove = whoseMove;
            for (FigureOnBoard figure : figures) {
                Figure figureToPlace;
                if (figure.figureType == FigureType.PAWN)
                    figureToPlace = new Pawn(figure.figureColor);
                else
                    figureToPlace = new Queen(figure.figureColor);
                board.setFigure(figure.col, figure.row, figureToPlace);
            }
            return board;
        }
    }

    static class FigureOnBoard {
        private int col;
        private int row;
        private FigureType figureType;
        private FigureColor figureColor;

        public FigureOnBoard(int col, int row, FigureType figureType, FigureColor figureColor) {
            this.col = col;
            this.row = row;
            this.figureType = figureType;
            this.figureColor = figureColor;
        }

        public int getCol() {
            return col;
        }

        public int getRow() {
            return row;
        }

        public FigureType getFigureType() {
            return figureType;
        }

        public FigureColor getFigureColor() {
            return figureColor;
        }
    }

    @Override
    public String toString() {
        String s = "|-----------------------|\n";
        for (int row = 0; row < rows.size(); row ++)
            s += rows.get(row).toString();
        s += "|-----------------------|\n";
        return s;
    }
}
