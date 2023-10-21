import java.util.*;
public class transpose {
    //program to print transpose of a matrix:
    public static void main(String[] args){
        Scanner spiral_object = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = spiral_object.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = spiral_object.nextInt();
        int arr[][] = new int[rows][columns];
        //input matrix:
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                arr[i][j] = spiral_object.nextInt();
            }
        }
        //transpose output:
        System.out.println("transpose order matrix: ");
        for(int i=0; i<columns; i++) {
            for(int j=0; j<rows; j++) {
                arr[i][j] = spiral_object.nextInt();
            }
            System.out.println();
        }
    }
}