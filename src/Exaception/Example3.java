package Exaception;

public class Example3 {
    public static void main(String[] args) {
try{
    String str=null;
    System.out.println(str.length());
    System.out.println(10/1);
    System.out.println(10/1);

}catch(NullPointerException nullPointerException){
    System.out.println("String is pointing to null");
}
catch(ArithmeticException arithmeticException){
    System.out.println("Divisor is invalid");
}
        System.out.println("Rest of the code");










    }









}
