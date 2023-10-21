import java.util.*;
public class exercise_question_10 {
    //Write a program to print Fibonacci series of n terms where n is input by user :
    //0 1 1 2 3 5 8 13 21 .....
    //In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
    public static void main(String[] args){
            Scanner Fibonacci_object = new Scanner(System.in);
            System.out.print("Enter number of terms: ");
            int terms = Fibonacci_object.nextInt();
            int first = 0;
            int second = 1;
            int sum = 0;
        System.out.print("Fibonacci series of " + terms + " terms: ");
        System.out.print(first + " " + second + " ");
            for (int i = 2; i<terms;i++){
                sum = first + second;
                System.out.print(sum+" ");
                first = second;
                second = sum;
            }
    }
}