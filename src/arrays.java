import java.util.*;
public class arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int elements = sc.nextInt();
        int arr[] = new int[elements];
        //input:
        for (int i = 0; i < elements; i++){
            System.out.print("Enter element["+(i+1)+"] = ");
            arr[i] = sc.nextInt();
        }

        //output:
        System.out.println();
        for (int i = 0; i<elements;i++){
            System.out.println("Value of element["+(i+1)+"] is: "+arr[i]+".");
        }

        //find index number of given number:
        System.out.println();
        System.out.print("Enter number to search its index number: ");
        int find_variable = sc.nextInt();
        for (int i = 0; i <find_variable;i++){
            if (arr[i]==find_variable){
                System.out.print("Element found at index number: "+i);
            }
        }
    }
}