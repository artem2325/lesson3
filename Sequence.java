import java.util.*;

public class sequence {
    public static void main(String[] Args) {
        String inputString = "1593";
        char[] newArray = inputString.toCharArray();
        int amountofNumbers = 0;
        System.out.println("Itroduced string: " + "" + inputString);
        for (int i = 0; i < newArray.length; i++) {
            if (Character.isDigit(newArray[i])) {
                amountofNumbers++;
            }
        }
        int[] intArray = new int[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            intArray[i] = Character.digit(inputString.charAt(i), 10);
        }
        for (int i = 0; i < amountofNumbers - 1; i++) {
            if (intArray[i] < intArray[i + 1]) {
                if (i == amountofNumbers - 2) {
                    System.out.println("Numbers are ascending");
                }
            } else {
                System.out.println("Numbers are not ascending");
                break;
            }
        }
    }
}


