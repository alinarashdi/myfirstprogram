/**
 * Class: Month
 * @author: Alina Rashdi
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written: September 11, 2023
 * description: This program is used to compute the month from the digit entered.
 */
package BranchingDemo;

import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12 to determine the month: ");
        int singleDigit = input.nextInt();

        if (singleDigit == 1) {
            System.out.println("JANUARY");
        } else if (singleDigit == 2) {
            System.out.println("FEBRUARY");
        } else if (singleDigit == 3) {
            System.out.println("MARCH");
        } else if (singleDigit == 4) {
            System.out.println("APRIL");
        } else if (singleDigit == 5) {
            System.out.println("MAY");
        } else if (singleDigit == 6) {
            System.out.println("JUNE");
        } else if (singleDigit == 7) {
            System.out.println("JULY");
        } else if (singleDigit == 8) {
            System.out.println("AUGUST");
        } else if (singleDigit == 9) {
            System.out.println("SEPTEMBER");
        } else if (singleDigit == 10) {
            System.out.println("OCTOBER");
        } else if (singleDigit == 11) {
            System.out.println("NOVEMBER");
        } else if (singleDigit == 12) {
            System.out.println("DECEMBER");
        } else {
            System.out.println("NOT A MONTH");
        }
    }
}