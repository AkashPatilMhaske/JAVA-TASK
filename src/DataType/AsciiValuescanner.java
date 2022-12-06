package DataType;

import java.util.Scanner;

public class AsciiValuescanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lowercase Character");
        char ch1 = sc.next().charAt(0);
        int ascii1=(int)ch1;
        System.out.println("The Asscii value of "+ch1+"is : "+ascii1);


    }
}
