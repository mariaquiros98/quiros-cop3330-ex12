/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/

        float principal;
        float rateInterest;
        float numberYears;

        /*Prompting for principal*/
        System.out.println("Enter the principal:");
        principal = scan.nextFloat();

        /*Prompting for rate of interest*/
        System.out.println("Enter the rate of interest:");
        rateInterest = scan.nextFloat();

        /*Prompting for number of years*/
        System.out.println("Enter the number of years:");
        numberYears = scan.nextFloat();

        /*Dividing the interest rate by 10*/
        float newRateInterest = (rateInterest / 10);

        /*Calculating the total amount*/
        float amount = (principal * ((1 + ((newRateInterest / 100) * numberYears))));

        /*Displaying how much the investment will be worth*/
        System.out.printf("After %.0f years at %.1f%%, the investment will be worth $%.0f.", +numberYears, +newRateInterest, +amount);

    }
}


