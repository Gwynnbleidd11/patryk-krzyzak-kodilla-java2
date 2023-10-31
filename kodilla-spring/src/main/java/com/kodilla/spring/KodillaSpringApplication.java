package com.kodilla.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodillaSpringApplication.class, args);

		MultiConstructorTest test = new MultiConstructorTest("test");
		MultiConstructorTest test2 = new MultiConstructorTest(2);

		int result = Fibonacci.calculateFibonacci(15);
		int result2 = Fibonacci.recursionFibonacci(15);
		System.out.println(result);
		System.out.println(result2);
	}





}
