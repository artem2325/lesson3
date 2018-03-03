import java.util.*;

public class minmax {
    public static void main(String[] Args) {
        int[] newArray = {1, 5, 4825, 10, 34, -5, 54, 11, 65, 0};
        int lowestNumber = 0;
        int highestNumber = 0;
        System.out.println("Array input: " + Arrays.toString(newArray));
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > highestNumber) {
                highestNumber = newArray[i];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < lowestNumber) {
                lowestNumber = newArray[i];
            }
        }
        System.out.println("Highest number: " + highestNumber);
        System.out.println("Lowest number: " + lowestNumber);
        lowestNumber = 0;
        highestNumber = 99;
        newArray[1] = lowestNumber;
        newArray[6] = highestNumber;
        System.out.println("Array output: " + Arrays.toString(newArray));
    }
}
