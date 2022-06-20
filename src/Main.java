import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] arr = generateRandomArray();
        String arrToString= Arrays.toString(arr);
        System.out.println(arrToString);
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}