package com.example;

public class App {

    public double calculateSalary(double basicSalary) {

        double hra = basicSalary * 0.20;   // House Rent Allowance
        double da = basicSalary * 0.10;    // Dearness Allowance

        double totalSalary = basicSalary + hra + da;

        return totalSalary;
    }

}
