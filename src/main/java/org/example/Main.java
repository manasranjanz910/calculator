package org.example;

import static org.example.Compoundinterest.calculateCompoundInterest;
import static org.example.Fixedinterest.calculateFixedInterest;
import static org.example.EffectiveInterest.calculateEffectiveInterest;

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
        double nominalRate = 5; // Nominal annual interest rate (in percentage)
        int compoundingFrequency = 12; // Compounding frequency (e.g., monthly)


        // Call the function to calculate compound interest
        double effectiveInterest = calculateEffectiveInterest(nominalRate, compoundingFrequency);
        // Print the result
        System.out.println("Fixed Interest: " + fixedInterest);
        System.out.println("effective Interest: " + effectiveInterest);
    }

    }
