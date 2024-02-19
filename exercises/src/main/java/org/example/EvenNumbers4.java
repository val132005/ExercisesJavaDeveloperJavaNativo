package org.example;

public class EvenNumbers4 {
    /*
    For this exercise we need

    Control Flow
    Loop for to show the numbers between 1 and 100

    Message
    One message inside the loop to sow the numbers
     */

    public static void main(String[] args) {
        System.out.println("Numbers between 1 and 100");
        for (int i = 2; i < 10; i++) {
            if (i%2==0){
                System.out.print(i +" ");
            }

        }
    }


}
