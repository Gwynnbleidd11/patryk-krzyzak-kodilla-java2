package com.remote.patterns.singleton;

enum PrinterManager {
    INSTANCE;

    public void print() {
        System.out.println("test");
    }
}
