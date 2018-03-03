import java.util.Arrays;

public class Sequence {
    public static void main(String[] args) {
        Integer input = 15678;
        String string = Integer.toString(input);
        System.out.println("Introduced string: " + "" + string);
        int[] array = new int[string.length()];
        for (int i = 0; i < string.length(); i++) {
            array[i] = Character.digit(string.charAt(i), 10);
        }
        boolean ascending = true;  // Так и не понял зачем, почему и как использовать этот тип АААААААААААААААААААААа
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                if (i == array.length - 2) {
                    System.out.println("Numbers are ascending");
                }
            } else {
                System.out.println("Numbers are not ascending");
                break;
            }
        }
    }
}


