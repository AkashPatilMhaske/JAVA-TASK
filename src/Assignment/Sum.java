package Assignment;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1");
        int number1= sc.nextInt();
        System.out.println("Enter the number1");
        int number2= sc.nextInt();
        System.out.println("Addition of two number is"+Sum.addition(number1,number2));
        System.out.println("Multipilcation of number is"+Sum.product(number1,number2));


    }
    private static int addition(int number1,int number2){
        return number1+number2;
    }

    private static int product(int number1,int number2){
        return number1*number2;
    }


}
