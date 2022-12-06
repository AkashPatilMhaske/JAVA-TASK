package task;

import java.util.Scanner;

public class Curvesuraceareaofcylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius and hight");
        double radius=sc.nextDouble();
        double hight= sc.nextDouble();
        sc.close();
        double curvesuraceareaofcylinder=2*Math.PI*radius*hight;
        System.out.println("curvesuraceareaofcylinder : " +curvesuraceareaofcylinder);





    }







}
