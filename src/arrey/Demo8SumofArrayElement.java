package arrey;

public class Demo8SumofArrayElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 10,20,7};
        System.out.println(arraySum(array));
    }

    private static int arraySum(int[] array) {
        int sum = 0;
        if (array == null) {
            return sum;
        }
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }
        return sum;
    }













}










