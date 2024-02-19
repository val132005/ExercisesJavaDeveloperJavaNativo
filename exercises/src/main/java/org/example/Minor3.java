package org.example;

import java.util.Scanner;

public class Minor3 {
    public static void main(String[] args) {
        /*
        For this exercise we need:
        Variables with information from the user:
        Int num1
        Int num2

        Control flow:
        Conditionals:
        num1 < num2
        num2 < num1
        num1 == num2

        Message:
        To request num1
        To request num2
        To show the result

        Objects:
        Scanner


         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the second number");
        int num2 = sc.nextInt();
        sc.nextLine();

        if (num1>num2){
            System.out.print("The minor number is: ");
            System.out.println(num2);
        } else if (num1<num2) {
            System.out.print("The minor number is: ");
            System.out.println(num2);
        }else {
            System.out.println("The numbers are equals");
        }

    }
}
