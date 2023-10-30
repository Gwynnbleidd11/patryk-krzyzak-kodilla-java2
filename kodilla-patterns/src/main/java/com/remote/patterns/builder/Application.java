package com.remote.patterns.builder;

public class Application {
    public static void main(String[] args) {

        Board board = new Board.Builder()
                .whoseMove(FigureColor.WHITE)
                .figure(2, 2, FigureType.PAWN, FigureColor.BLACK)
                .figure(1, 1, FigureType.PAWN, FigureColor.WHITE)
                .figure(2, 4, FigureType.PAWN, FigureColor.BLACK)
                .figure(5, 4, FigureType.QUEEN, FigureColor.BLACK)
                .build();

        System.out.println(board);

    }
}
