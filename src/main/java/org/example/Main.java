package org.example;

import static org.example.Compoundinterest.calculateCompoundInterest;
import static org.example.Fixedinterest.calculateFixedInterest;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double principal = 1000; // Principal amount
        double rate = 5; // Annual interest rate (in percentage)
        double time = 2; // Time period (in years)
        int n =1;

        // Call the function to calculate fixed interest
        double fixedInterest = calculateFixedInterest(principal, rate, time);

        // Print the result
        System.out.println("Fixed Interest: " + fixedInterest);
    }

    }
