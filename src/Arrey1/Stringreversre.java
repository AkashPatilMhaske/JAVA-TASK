package Arrey1;

public class Stringreversre {
    public static void main(String[] args) {

          String name="Akash";


    char []array={'A','K','A','S','H'};


        for (int left=0, right= array.length-1; left < right ;left++,right--){
            char temp = array[left];
            array[left]= array[right];
            array[right]= temp;
        }


        System.out.println("printing reverse array");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]+" ");
        }


}}
