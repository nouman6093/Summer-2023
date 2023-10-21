import java.util.*;
public class ascending_check {
    //Take an array of numbers as input and check if it is an array sorted in ascending order.
    //Eg : { 1, 2, 4, 7 } is sorted in ascending order.
    //       {3, 4, 6, 2} is not sorted in ascending order.
    public static void main(String[] args){
        Scanner ascending_check_object = new Scanner(System.in);
        System.out.print("Enter number of integers to enter: ");
        int integers = ascending_check_object.nextInt();
        int arr[] = new int[integers];
        //entering integers:
        for (int i = 0; i < integers; i++){
            System.out.print("Enter integer: ");
            arr[i] = ascending_check_object.nextInt();
        }
        //checking order:
        int smaller = arr[0];
        boolean isAscending = false;
        for (int i = 0; i < integers; i++){
            if (arr[i] > smaller){
                isAscending = true;
                break;
            }
        }
        //printing result:
        if (isAscending){
                            System.out.print("The array is sorted in ascending order.");
        }else {
            System.out.print("The array is not sorted in ascending order.");
        }
    }
}