package task;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE UNIT");

            int unit=sc.nextInt();
        sc.close();
        double electrictybill=5.36*unit;
        System.out.println("Your ElectricityBill is : "+electrictybill);









    }









}
