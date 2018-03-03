import java.util.Arrays;

public class Minmax {
    public static void main(String[] args) {
        int[] array = {1, 5, 4825, 10, 34, -5, 54, 11, 65, 0};
        int lowest = 0;
        int highest = 0;
        int lowestCell = 0;
        int highestCell = 0;
        System.out.println("Array input: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i];
                highestCell = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
                lowestCell = i;
            }
        }
        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
        lowest = 0;
        highest = 99;
        array[lowestCell] = lowest;
        array[highestCell] = highest;
        System.out.println("Array output: " + Arrays.toString(array));
    }
}
