package Exaception;

public class Example5 {
    public static void main(String[] args) {
try{String str=null;
   System.out.println(str.length());
   System.out.println(10/0);
    System.out.println(10/1);
    int[] array=new int[3];
    System.out.println(array[5]);
}catch (NullPointerException nullPointerException){
    System.out.println("String is pointing to null");
}catch(ArithmeticException arithmeticException){
    System.out.println("divisor number is invalid");
}catch(Throwable throwable){
    System.out.println("genric handler");}

        System.out.println("rest of the code");









    }
}
