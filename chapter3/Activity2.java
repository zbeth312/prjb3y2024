package chapter3;

import java.util.Scanner;

public class Activity2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if(number % 2 == 0) {
            System.out.println(number + " is even number.");
        } else {
            System.out.println(number + " is odd number.");
        } 

        if(number > 0) {
            System.out.println(" is positve");
        }
    }
}