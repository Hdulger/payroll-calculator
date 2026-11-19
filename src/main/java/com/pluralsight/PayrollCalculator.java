package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        name(myScanner);
        double wHours=workHours(myScanner);
        double payR=payRate(myScanner);
        grossPay(wHours, payR);

    }

    public static void name(Scanner scanner){
        System.out.println("What is your name?");
        String name=scanner.nextLine();
    }
    public static double workHours(Scanner scanner){
        System.out.print("How many hours do you work? ");
        double workHours= Integer.parseInt(scanner.nextLine());
        return workHours;
    }
    public static double payRate(Scanner scanner){
        System.out.println("What is your pay rate?");
        double payRate= Integer.parseInt(scanner.nextLine());
        return payRate;

    }
    public static void grossPay(double workHours, double payRate){
        double grossPay= workHours*payRate;
        System.out.println(grossPay);
    }
}