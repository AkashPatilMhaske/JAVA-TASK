package Assignment;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grosssalary");
        int grosssalary = sc.nextInt();
        System.out.println("Enter the Saving");
        int saving = sc.nextInt();
        int tax = calculatetax(grosssalary, saving);
        System.out.println(tax);
    }

    private static int calculatetax(int grosssalary, int saving) {
        int ABC = 10;
        int abc = 10;

        int netTaxableamount = grosssalary - saving;
        int tax = 0;
          if(netTaxableamount<250000){
          tax=0;
          }
          return tax;
    }}











