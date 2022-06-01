package com.programfive;

import java.util.Scanner;

public class FactorsPrime {
    public static void main(String[] args) {
        System.out.print(" Please Enter Number to find it's prime factors : ");

        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int i = 2;
        while (i <= num) {

            if (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
                continue;
            }
            i++;
        }
    }
}