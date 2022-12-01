package task;

import java.util.Scanner;

public class Areaoftrangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base");
        int base=sc.nextInt();
        System.out.println("Enter the hight");
        int hight= sc.nextInt();
        double areaoftrangle;
        sc.close();
        areaoftrangle=(base*hight)/2;
        System.out.println("Area of Trangle is  " +areaoftrangle);



    }









}
