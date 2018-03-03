import java.util.*;

public class sorting {
    public static void main(String[] Args) {
        Integer[] newArray = {1, 5, 2, 6, 99, 3, 54, 22, 44, 11};
        System.out.println("Introduced array :" + "" + Arrays.toString(newArray));
        Arrays.sort(newArray);
        System.out.println("Sorted array in increasing: " + Arrays.toString(newArray));
        Arrays.sort(newArray, Collections.reverseOrder());
        System.out.println("Sorted array in decreasing: " + Arrays.toString(newArray));
    }
}
