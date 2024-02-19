package org.example;

import java.util.Scanner;

public class MultiplicationTable5 {
    /*
    To this exercise we need:

    Variables:
    num, to store the num to the multiplication table
    res, to store the result of the multiplications

    Objects:
    Scanner to receive the user information

    Messages:
    To request the number
    To print every result in the multiplication table

    Control flow:
    Loop:
    To generate the multiplication table with the number

     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number from which you want to obtain the multiplication table");
        int num = sc.nextInt();

        for (int i = 1; i <11; i++) {
            int res = num*i;
            System.out.println(num+" * "+i+" = " + res);

        }
    }


}
