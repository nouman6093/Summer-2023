import java.util.*;
public class Stringbuilder_combined_length {
    //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        StringBuilder arr[] = new StringBuilder[size];
        int length = 0;
        for (int i = 0; i < size; i++){
            System.out.print("Enter String: ");
            arr[i] = new StringBuilder(sc.next());
            length += arr[i].length();
        }
        System.out.print("Number of characters in your string array are: "+length);
    }
}