package Assignment;

import java.util.Scanner;

public class Average {
    void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        float average = (float) (number1 + number2 + number3)/3;
        System.out.printf("Avarage of three numbers=%2"+average);
    }

    public static void main(String[] args) {
        Average average=new Average();
        average.calculate();








    }













}
