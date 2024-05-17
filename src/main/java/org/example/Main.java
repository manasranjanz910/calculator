package org.example;

import static org.example.Compoundinterest.calculateCompoundInterest;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double principal = 5000; // Principal amount
        double rate = 5; // Annual interest rate (in percentage)
        double time = 2; // Time period (in years)
        int n =1;

       // Call the function to calculate compound interest
        double compoundInterest = calculateCompoundInterest(principal, rate, time, n);

        // Print the result
        System.out.println("Compound Interest: " + compoundInterest);
    }

    }
