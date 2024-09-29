package com.ps;

import java.util.Scanner;

public class Main {

    // Calculator 1: Mortgage Calculator
// calculate how much a monthly payment for a loan (minus insurance/taxes)?
// how much interest you would pay over the life of the loan?

   // Inputs
// amountOfLoan - original sum of the loan borrowed, double
// annualInterestRate - yearly interest rate, float
// annualLoanLength - yearly loan length, short

   // Outputs
// totalMonthlyPayments = paymentsPerYear/12 = paymentsPerYear, byte
// monthlyInterestRate = annualInterestRate/12/100, float
// totalInterest, double

        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Welcome to Mortgage Calculator");

            System.out.println("Please enter loan amount: ");
            double amountOfLoan = scanner.nextDouble();

            System.out.println("Please enter annual interest rate (as percentage): ");
            float annualInterestRate = scanner.nextFloat();

            System.out.println("Please enter loan term in years: ");
            short annualLoanLength = scanner.nextShort();

      // Calculate the monthlyInterestRate
        float monthlyInterestRate = annualInterestRate / 12 / 100;

      // Convert the annualLoanLength into months
        int totalMonthlyPayments = annualLoanLength * 12;

      // Calculate the monthlyPayment
        double monthlyPayment = amountOfLoan * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, - totalMonthlyPayments)));

      // Calculate the totalInterest
        double totalInterest = (monthlyPayment * totalMonthlyPayments) - amountOfLoan;

      // Display results/System.out.println();
        System.out.printf("Your monthly payment will be: $%.2f");

        System.out.printf("The total interest you will pay over your annual loan length: $%.2f");

    }
}