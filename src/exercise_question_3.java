import java.util.*;
public class exercise_question_3{
    //Write a function which takes in 2 numbers and returns the greater of those two.
    public static void greater_function(int A, int B){
        if (A>B){
            System.out.print(A+" is greater than "+B);
        } else {
            System.out.print(B+" is greater than "+A);
        }
    }
    public static void main(String[] args){
        Scanner greater_object = new Scanner(System.in);
        System.out.print("Enter value of A: ");
        int A = greater_object.nextInt();
        System.out.print("Enter value of B: ");
        int B = greater_object.nextInt();
        greater_function(A,B);
    }
}