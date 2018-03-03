import java.util.Arrays;

public class Inverting {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Introduced array: " + Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int number = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = number;
        }
        System.out.println("Inverted array: " + Arrays.toString(array));
    }
}
