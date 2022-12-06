package arrey;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
int [] marks={54,66,77,89,23};
        System.out.println(marks.length);
        for (int index = 0; index <marks.length ; index++) {
            System.out.println(marks[index]);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the arrey size");
       int size=sc.nextInt();
       int[]array=new int[size];
        System.out.println("Enter the arrey elements");
        for (int index = 0; index < array.length; index++) {
            array[index]=sc.nextInt();

        }
        System.out.println("Enter arrey elements");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }




    }









}
