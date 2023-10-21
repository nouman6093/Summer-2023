import java.util.*;
public class selection_sort {
    public static void main(String[] args){
        //selection sort:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++){
            int smallest = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j]<arr[smallest]){
                    smallest = arr[j];
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }


        //alternative method made by me:
//        for (int i = 0; i < arr.length-1; i++){
//            for (int j = 0; j < arr.length-i-1; j++){
//                if (arr[j+1]<arr[j]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}