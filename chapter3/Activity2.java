package chapter3;

import java.util.Scanner;

public class Activity2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        
        if(num % 2 == 0) {
            System.out.println(num + " is even number.");
        } else {
            System.out.println(num + " is odd number.");
        } 

        if(num > 0) {
            System.out.println(num + " is positve");
        }
        else if (num < 0) {
            System.out.println(num + "is negative");
        }
        else {
            System.out.println("The number is zero.");
        }
        
    }
}