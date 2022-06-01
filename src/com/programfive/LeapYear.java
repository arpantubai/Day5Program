package com.programfive;


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int leapYear;
        System.out.print("Enter Leap Year : ");

        Scanner sc = new Scanner(System.in);
        leapYear = sc.nextInt();
        if (String.valueOf(leapYear).length() != 4) {
            System.out.println("Please Enter the Year in four Digit");
            return;
        }
        if (leapYear % 4 == 0 || leapYear % 400 == 0)
            System.out.println(leapYear + " is a leap year");
        else
            System.out.println(leapYear + " is not a leap year");
    }
}