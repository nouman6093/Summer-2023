import java.util.*;
public class length_of_strings {
    //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
    public static void main(String[] args){
        Scanner combine_string_object = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = combine_string_object.nextInt();
        String arr[] = new String[size];
        //taking input:
        for (int i = 0; i < size; i++){
            System.out.print("Enter string: ");
            arr[i] = combine_string_object.next();
        }
        //finding length of all strings combined:
        int length = 0;
        for (int i = 0; i < size; i++){
            length += arr[i].length();
        }
        System.out.print("Length of entered strings is: "+length);
    }
}