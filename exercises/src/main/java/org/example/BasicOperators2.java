package org.example;

import java.util.Scanner;

public class BasicOperators2 {
    /*
    For this exercise we need:
    1. Create an object of the Scanner class to receive the information
    2. Ask the user for the first number in a message
    3. Create an int type variable to store the first number
    4. Save the first number in the variable
    5. Ask the user for the second number in a message
    6. Create an int type variable to store the second number
    7. Save the second number in the variable
    8. Create an int variables to store the result of different operations
    9. Ask the user for the operation to execute
    10. Create a variable to save the operation
    11. Use a conditional Switch to evaluate the operation chosen y the user

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the second number");
        int num2 = sc.nextInt();
        sc.nextLine();

        int addition = num1 + num2;
        int subtraction = num1-num2;
        int multiplication = num1*num2;
        int division = num1/num2;
        int mood = num1%num2;

        System.out.println("Please enter the number of the operation that you want execute:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo  ");
        int operation = sc.nextInt();
        sc.nextLine();

        switch (operation){
            case 1:
                System.out.println("Addition: "+ addition);
                break;
            case 2:
                System.out.println("Subtraction: "+subtraction);
                break;
            case 3:
                System.out.println("Multiplication: "+ multiplication);
                break;
            case 4:
                if (num2 == 0){
                    System.out.println("Invalid oparator for number 0");
                }else {
                    System.out.println("Division: "+division);
                }
                break;
            case 5:
                System.out.println("Modulo: "+mood);
                break;

        }



    }


}
