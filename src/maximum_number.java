import java.util.*;
public class maximum_number {
    //program which finds maximum number from a set of input numbers:
    public static void main(String[] args){
        Scanner maximum_object = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        int integers = maximum_object.nextInt();
        int arr[] = new int[integers];
        //input loop:
        for (int i = 0; i <integers; i++){
            System.out.print("Enter number: ");
            arr[i] = maximum_object.nextInt();
        }
        //finding maximum number loop:
        int max = arr[0];
        for (int i = 0;i<integers;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        //printing output
        System.out.print("Maximum number is: "+max);
    }
}