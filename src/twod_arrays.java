import java.util.*;
public class twod_arrays {
    public static void main(String[] args){
        Scanner matrix_object = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = matrix_object.nextInt();
        System.out.print("Enter number of columns: ");
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
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
}