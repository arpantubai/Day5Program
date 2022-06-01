package com.programfive;

import java.util.Scanner;

public class RemainderQuotient {
    public static void main(String[] args) {
        System.out.print(" Please Enter dividend : " );
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        System.out.print("Please Enter divisor : ");
        int divisor = sc.nextInt();

        System.out.println("Quotient is : " + dividend/divisor );
        System.out.println("Remainder is : " + dividend%divisor );
    }
}