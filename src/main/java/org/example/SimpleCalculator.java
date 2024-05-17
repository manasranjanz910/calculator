package org.example;

public class SimpleCalculator {

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // Simple Interest formula: SI = (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;
        return simpleInterest;
    }

}
