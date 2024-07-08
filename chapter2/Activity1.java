package chapter2;

import java.util.*;

public class  Activity1 {

    public static void main(String[] args) {
        int a,b,c;    
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter 1st number");
        a = input.nextInt();
        System.out.println("Enter 2nd number");
        b = input2.nextInt();
        System.out.println("Enter 3rd number");
        c = input3.nextInt();
        if(a > b && b > c) {
            System.out.println(a + " is the largest number");
        } else if(b > a && b > c) {
            System.out.println(b +" is the largest number");
        } else if(c > a && c > b) {
            System.out.println(c + " is the largest number");
        }
        else if(a == b && b == c && c == a) {
            System.out.println("All numbers are equal");
        }
        
    }
      
}
