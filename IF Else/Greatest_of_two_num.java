// Write a Java program that takes 2 numbers from the user and prints the greatest number.

import java.util.Scanner;

public class Greatest_of_two_num{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fisrt number");
        int first_num = sc.nextInt();

        System.out.println("Enter second number");
        int second_num = sc.nextInt();

        if(first_num > second_num){
            System.out.println("the greatest number is " + first_num);
        } else {
            System.out.println("the greatest number is " + second_num);
        }
    }
}