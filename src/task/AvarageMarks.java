package task;

import java.util.Scanner;

public class AvarageMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sub1 marks");
        int sub1=sc.nextInt();
        System.out.println("Enter the sub2 marks");
        int sub2=sc.nextInt();
        System.out.println("Enter the sub3 marks");
        int sub3=sc.nextInt();
        System.out.println("Enter the sub4 marks");
        int sub4=sc.nextInt();
        System.out.println("Enter the sub5 marks");
        int sub5=sc.nextInt();
        System.out.println("Enter the sub6 marks");
        int sub6=sc.nextInt();
        int total =sub1+sub2+sub3+sub4+sub5+sub6;
        double avarage=total/6;
        System.out.println("Your total is   :"+total);
        System.out.println("Your avarage is  :"+avarage);





    }








}
