import java.util.*;

public class inverting {
    public static void main(String[] Args) {
        int[] newArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Introduced array: " + Arrays.toString(newArray));
        for (int i = 0; i < newArray.length / 2; i++) {
            int replaceableNumbers = newArray[i];
            newArray[i] = newArray[newArray.length - i - 1];
            newArray[newArray.length - i - 1] = replaceableNumbers;
        }
        System.out.println("Inverted array: " + Arrays.toString(newArray));
    }
}
