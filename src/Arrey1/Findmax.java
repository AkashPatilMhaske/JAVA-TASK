package Arrey1;

public class Findmax {
    public static void main(String[] args) {


    int[]array={10,20,30,40,50};
    int min=Integer.MAX_VALUE;
    for (int i=0;i<array.length;i++){

    if(min>array[i]){
        min=array[i];
    }
    }
        System.out.println(min);
    }







}
