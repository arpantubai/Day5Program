package com.programfive;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.print("Enter a number : " );
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        if(ch%2==0)
            System.out.println("number is even");
        else
            System.out.println("number is odd");
    }
}