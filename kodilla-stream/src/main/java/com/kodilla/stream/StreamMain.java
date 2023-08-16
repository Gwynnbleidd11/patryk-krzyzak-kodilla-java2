package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::subBFromA);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("This is a nice day", (text) -> "..." + text + "...");
        poemBeautifier.beautify("This is a nice day", (text) -> text.toUpperCase());
        poemBeautifier.beautify("This is a nice day", (text) -> "ABC " + text + " ABC");
        poemBeautifier.beautify("This is a nice day", (text) -> text.toLowerCase());
        poemBeautifier.beautify("This is a nice day", (text) -> "*** " + text + " @@@");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}