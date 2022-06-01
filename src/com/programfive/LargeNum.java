package com.programfive;

import java.util.Scanner;

public class LargeNum {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.print("Largest number is : ");
        System.out.print((x>y)?(x>y)?x:z:(y>z)?y:z);
    }
}