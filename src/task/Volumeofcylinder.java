package task;

import java.util.Scanner;

public class Volumeofcylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in)  ;
        System.out.println("Enter radius and hight");

        double radius=sc.nextDouble();
        double hight=sc.nextDouble();
sc.close();
double volumeofcylinder=Math.PI*radius*radius*hight;
        System.out.println("Volumeofcylinder  : "+volumeofcylinder);







    }










}
