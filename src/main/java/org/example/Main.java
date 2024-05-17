package org.example;

import static org.example.SimpleCalculator.calculateSimpleInterest;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double principal = 5000; // Principal amount
        double rate = 5; // Annual interest rate (in percentage)
        double time = 2; // Time period (in years)

        // Call the function to calculate simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Print the result
        System.out.println("Simple Interest: " + simpleInterest);
    }

    }
