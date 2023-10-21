import java.util.*;
//check if array is sorted or not:
public class recurisve_9 {
    public static boolean sorted(int arr[], int i){
        if (i==arr.length-1){
            return true;
        }
        if (arr[i+1]>arr[i]){
            return sorted(arr,i+1);
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        System.out.print(sorted(arr,0));
    }
}