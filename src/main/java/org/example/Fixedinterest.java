package org.example;

public class Fixedinterest {
    public static double calculateFixedInterest(double principal, double rate, double time) {
        // Fixed Interest formula: SI = (P * R * T) / 100
        double fixedInterest = (principal * rate * time) / 100;
        return fixedInterest;
    }

}
