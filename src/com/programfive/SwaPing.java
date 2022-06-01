package com.programfive;

import java.util.Scanner;

public class SwaPing {
    public static void main(String[] args) {
        System.out.print("Enter first number : " );
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        int temp = a;
        a=b;
        b=temp;

        System.out.println("Now a :"+a );
        System.out.println("Now b :"+b );

    }
}