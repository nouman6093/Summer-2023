import java.util.*;
public class minimum_number {
    public static void main(String[] args){
        //program to find minimum number from a set of input numbers:
        Scanner minimum_object = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        int integers = minimum_object.nextInt();
        int arr[] = new int[integers];
        //input integers:
        for (int i = 0; i<integers;i++){
            System.out.print("Enter integer: ");
            arr[i] = minimum_object.nextInt();
        }
        //find minimum:
        int min = arr[0];
        for (int i = 0; i<integers;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        //printing output:
        System.out.print("Minimum number is: "+min);
    }
}