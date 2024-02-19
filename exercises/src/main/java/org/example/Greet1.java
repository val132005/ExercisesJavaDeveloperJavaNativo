package org.example;

import java.util.Scanner;

public class Greet1 {
    public static void main(String[] args) {
        /*
    For this exercise we need:
    1. Create an object of the scanner class to receive the information.
    2. Ask the user for his name in a message
    3. Create a String type variable to store the user's name
    4. Store the user's name in the variable
    5. Print the greeting by concatenating the user's name
     */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Hello "+ name);


    }
}
