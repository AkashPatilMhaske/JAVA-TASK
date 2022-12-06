package task;

import java.util.Scanner;

public class Volmeofcone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius and Hight");
        double radius=sc.nextDouble();
        double hight=sc.nextDouble();
        sc.close();
        double volmeofcone=Math.PI*radius*radius*(hight/2);
        System.out.println("volmeofcone : "+volmeofcone);







    }










}
