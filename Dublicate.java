import java.util.*;

public class dublicate {
    public static void main(String[] Args) {
        int[] introducedArray = new int[]{5, 558, 0, 0, 0, 558, 558, 9999, 558, 9999};
        int highestNumber = 0;
        System.out.println("Introduced array: " + Arrays.toString(introducedArray));
        for (int i = 0; i < introducedArray.length; i++) {
            if (introducedArray[i] > highestNumber) {
                highestNumber = introducedArray[i];
            }
        }
        int[] countArray = new int[highestNumber + 1];
        for (int i = 0; i < introducedArray.length; i++) {
            countArray[introducedArray[i]]++;
        }
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] >= 2) {
                System.out.println("Number " + i + " repeats " + countArray[i] + " time's");
            }
        }
    }
}

