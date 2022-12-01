package task;
import java.util.Scanner;
public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius= sc.nextInt();
        double areaofCircle;
        sc.close();
        areaofCircle=Math.PI*radius*radius;
        System.out.println("Area of Circle is " +areaofCircle);





    }









}
