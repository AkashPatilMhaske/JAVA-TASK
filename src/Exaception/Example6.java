package Exaception;

public class Example6 {
    public static void main(String[] args) {
try{
    System.out.println(10/0);
    throw new ArithmeticException("Divide by zero");
}catch (ArithmeticException arithmeticException) {
    System.out.println("coustem handler ");
        }
        System.out.println("rest of the code");









    }







}
