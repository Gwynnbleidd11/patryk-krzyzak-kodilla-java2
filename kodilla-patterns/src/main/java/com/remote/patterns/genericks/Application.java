package com.remote.patterns.genericks;

public class Application {
    public static void main(String[] args) {
        int s = 10;
        Displayer<Integer> displayer = new Displayer();
        displayer.display(s);
    }
}
