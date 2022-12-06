package task;

import java.util.Scanner;

public class VolumeofPrism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length,width and hight");
        int length,width,hight;
        length= sc.nextInt();
        width= sc.nextInt();
        hight= sc.nextInt();
          sc.close();
          int volumeofPrism=length*width*hight;
        System.out.println("volumeofPrism  : " +volumeofPrism);





    }







}
