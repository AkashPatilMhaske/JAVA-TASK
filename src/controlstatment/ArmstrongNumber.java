package controlstatment;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int oldNumber=number;
        int sum=0;
        sc.close();
        while(number>0){
            int digit=number%10;
            sum=sum+(digit  *digit*digit * digit);
            number=number/10;
        }
        System.out.println( oldNumber==sum ? "Armstrong" : "Not Armstrong Number"  );














    }






}
