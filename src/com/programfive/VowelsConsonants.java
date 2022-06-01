package com.programfive;

import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        System.out.println("Enter the Character :-");
        char ch;
        Scanner scan = new Scanner(System.in);
        ch = scan.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is vowel");
        } else
            System.out.println(ch + " is consonant");
    }
}