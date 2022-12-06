package task;

import java.util.Scanner;

public class Volumeofpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in)  ;
        System.out.println("Enter the length width and breadth");
        double length= sc.nextDouble();
        double width= sc.nextDouble();
        double breadth= sc.nextDouble();
        sc.close();

        double volumeofpyramid=length*width*breadth;
        System.out.println("Volumeofpyramid : "+volumeofpyramid);







    }








}
