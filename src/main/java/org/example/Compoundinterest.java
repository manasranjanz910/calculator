package org.example;

public class Compoundinterest {
    public static double calculateCompoundInterest(double principal, double rate, double time, int n) {
        // Compound Interest formula: A = P * (1 + r/n)^(nt)
        double amount = principal * Math.pow(1 + (rate / (100 * n)), n * time);
        double compoundInterest = amount - principal;
        return compoundInterest;
    }
}
