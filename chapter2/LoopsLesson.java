package chapter2;

import java.util.*;

public class LoopsLesson {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int looper1 = 10;
        while(looper1>0)
            System.out.println("Looper Value:"+looper1--);
        
        do
            System.out.println("Looper2 Value:"+looper1);
        while (looper1++<10);
        
        for(int i=1;i<looper1;)
            System.out.println("Looper3 Value:"+i++);
        
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                System.out.print("💎");
                }
            System.out.println();
            }
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

            // For Each example
            String[] colors = {"black", "red", "green", "blue", "pink", "yellow"};
            for (String color : colors) {
                System.out.println(color);
        }

        for()
    } 
    
        }
    // 15 min break
