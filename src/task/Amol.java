package task;

public class Amol extends Akash{
    @Override
    void m1() {
        super.m1();
        System.out.println("Class amol ovverride method");
    }


    class  Test extends Amol {
        public static void main(String[] args) {

            System.out.println();


        }
    }
}
