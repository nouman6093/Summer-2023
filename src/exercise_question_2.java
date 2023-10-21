import java.util.Scanner;
public class exercise_question_2{
    //Write a function to print the sum of all odd numbers from 1 to n.
    public static int odd_function(int n){
        int sum = 0;
        for (int i = n;i>=1;i--){
            if (i%2!=0){
                sum+=i;
            }
        }
        return(sum);
    }
    public static void main(String[] args){
        //a program which inputs a number and displays sum of all numbers from 1 to n using a function:
        Scanner odd_object = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = odd_object.nextInt();
        int sum = odd_function(n);
        System.out.print("Sum of odd numbers is: "+sum);
    }
}