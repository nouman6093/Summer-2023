import java.util.*;
public class two_d_array_find_x {
    //take a matrix as input from user. search for a given number x and print the indices at which it occurs
    public static void main(String[] args){
        Scanner matrix_object = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = matrix_object.nextInt();
        System.out.print("Enter number of columnss: ");
        int columns = matrix_object.nextInt();
        int arr[][] = new int[rows][columns];
        //input values:
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print("Enter value: ");
                arr[i][j] = matrix_object.nextInt();
            }
        }
        //output values:
        System.out.print("Matrix is: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        //finding indices of value:
        System.out.print("\nEnter value to find its indices: ");
        int value_for_index = matrix_object.nextInt();
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if (arr[i][j]==value_for_index){
                    System.out.print("Indices of value "+value_for_index+" are: ("+i+","+j+").");
                }
            }
        }
    }
}