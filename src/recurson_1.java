import java.util.*;
public class recurson_1 {
    //print 5 to 1 and 1 to 5
    public static void printDescending(int x){
        if (x==0){
            return;
        }else {
            System.out.print(x+" ");
            printDescending(x-1);
        }
    }
    public static void printAscending(int y){
        if (y==6){
            return;
        }else {
            System.out.print(y+" ");
            printAscending(y+1);
        }
    }
    public static void main(String[] args){
        int x = 5;
        int y = 1;

        System.out.print("Ascending: ");
        printAscending(y);
        System.out.print("\nDescending: ");
        printDescending(x);
    }
}