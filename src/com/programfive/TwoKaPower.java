package com.programfive;

import java.util.Scanner;

public class TwoKaPower {
    public static void main(String[] args) {
        int a, multi = 2, i = 1;
        System.out.print("Enter power of 2 : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        while (i < a) {
            multi = multi * 2;
            i++;
        }

        System.out.println("Power of 2 is :" + multi);

        if (multi % 4 == 0 || multi % 400 == 0)
            System.out.println(multi + " is a leap year");
        else
            System.out.println(multi + " is not a leap year");
    }
}