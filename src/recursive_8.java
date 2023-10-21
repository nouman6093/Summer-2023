import java.util.*;

public class recursive_8 {
    // Print first and last occurrence of an element:
    public static int first = -1;
    public static int last = -1;

    public static void printOccurrence(String str, int i, char element) {
        if (i == str.length()) {
            System.out.print(first);
            System.out.print(" ");
            System.out.print(last);
            return;
        }

        char currentChar = str.charAt(i);
        if (currentChar == element) {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }
        printOccurrence(str, i+1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        printOccurrence(str, 0, 'a');
    }
}
