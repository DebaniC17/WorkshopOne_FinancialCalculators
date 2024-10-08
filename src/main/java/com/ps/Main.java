package com.ps;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Financial Calculators");

// Menu to choose which calculator the user wants
        System.out.println("Choose a calculator:");
        System.out.println("1. Mortgage Calculator");
        System.out.println("2. CD Calculator");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

// Calculator options based on user inputs
        if (choice == 1) {
            mortgageCalculator();
        } else if (choice == 2) {
            CDCalculator();
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2: ");
        }
    }
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


    public static void mortgageCalculator() {
        System.out.println("Welcome to Mortgage Calculator");

        System.out.print("Please enter loan amount: ");
        double amountOfLoan = scanner.nextDouble();

        System.out.print("Please enter annual interest rate (as percentage): ");
        float annualInterestRate = scanner.nextFloat();

        System.out.print("Please enter loan term in years: ");
        short annualLoanLength = scanner.nextShort();

        // Calculate the monthlyInterestRate
        float monthlyInterestRate = annualInterestRate / 12 / 100;

        // Convert the annualLoanLength into months
        int totalMonthlyPayments = annualLoanLength * 12;

        // Calculate the monthlyPayment
        double monthlyPayment = amountOfLoan * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -totalMonthlyPayments)));

        // Calculate the totalInterest
        double totalInterest = (monthlyPayment * totalMonthlyPayments) - amountOfLoan;

        // Display results/System.out.println();
        System.out.printf("Your monthly payment will be: $%.2f\n", monthlyPayment);

        System.out.printf("The total interest you will pay over your annual loan length: $%.2f\n", totalInterest);

    }

// Calculator 2: CD Calculator
// Determine the future value of a one-time deposit assuming compound interest

    // Inputs
// the deposit - deposit, double
// the interest rate - interestRate, float
// the number of times compounded per year - compoundedPerYear (365), short

    // Outputs
// the future value - futureValue, double
// the total interest earned - totalInterestEarned, double

    public static void CDCalculator() {
        System.out.println("Welcome to CD Calculator");

        System.out.print("Enter deposit amount: ");
        double deposit = scanner.nextDouble();

        System.out.print("Enter annual interest rate (as percentage): ");
        float annualInterestRate = scanner.nextFloat();

        System.out.print("Enter term length in years: ");
        short termLength = scanner.nextShort();

// Amount of times interest is compounded per year, I wonder how some would include leap years
        short compoundedPerYear = 365;

// Convert annual interest rate into decimal
        float interestRate = annualInterestRate/100;

// Calculate future value of the CD savings account
        double futureValue = deposit * Math.pow(1 + (interestRate / compoundedPerYear), compoundedPerYear * termLength);

// Calculate the total interest earned
        double totalInterestEarned = futureValue - deposit;

// Display results
        System.out.printf("Your future value of the CD is: $%.2f\n", futureValue);

        System.out.printf("Your total interest earned on the CD is: $%.2f\n ", totalInterestEarned);
    }

}

