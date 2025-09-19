// Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;
public class positive_or_negative{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int entered_num = sc.nextInt();

        if(entered_num > 0){
            System.out.println("Number is positive");
        } else if (entered_num == 0){
            System.out.println("Number neither positive nor negative ");
        } else {
            System.out.println("Number is Negative");
        }

    }
}