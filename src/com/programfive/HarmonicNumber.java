package com.programfive;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        System.out.print("Enter the value : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double add=0,i=1;

        while(i<=n){
            add = add + 1/i;
            i++;
        }

        System.out.println("Nth harmonic is : "+add);
    }
}