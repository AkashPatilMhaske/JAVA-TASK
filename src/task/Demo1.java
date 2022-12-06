package task;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        int result=num+num2;
        System.out.println(result);
        if(result%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }






    }























