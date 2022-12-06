package arrey;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner sc=new Scanner(System.in);
        int arraySize=sc.nextInt();
        System.out.println(arraySize);
        //Array size cant be float,double,boolean,long
        int[]array=new int[arraySize];
        System.out.println("Enter the array Elements");
        for (int index = 0; index <array.length ; index++) {
            array[index]=sc.nextInt();
        }
        System.out.println("Printing he array elements");
        for (int index = 0; index <array.length ; index++) {
            System.out.println(array[index]);
        }









    }













}
