package Exaception;

import java.util.Scanner;

public class DemoAge {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if(age < 18){
            throw new InvalidAgeException("your are under  age");

        }else {
            System.out.println("Your are eligible for voting");
        }



    }






}
