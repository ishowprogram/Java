// write a java program to add two numbers taking input from user. 

import java.util.Scanner;

public class add_number_by_user_input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second number:");
        int num2 = sc.nextInt();

        int sum = num1 + num2 ;

        System.out.println(sum);
    }
}