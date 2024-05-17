package org.example;

public class EffectiveInterest {
    public static double calculateEffectiveInterest(double nominalRate, int compoundingFrequency) {
        // Convert nominal interest rate to decimal
        double decimalRate = nominalRate / 100;

        // Calculate effective interest rate
        double effectiveRate = Math.pow(1 + decimalRate / compoundingFrequency, compoundingFrequency) - 1;

        // Convert effective interest rate to percentage
        double effectiveInterest = effectiveRate * 100;

        return effectiveInterest;
    }

}
