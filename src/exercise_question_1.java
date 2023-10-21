import java.util.*;
public class exercise_question_1{
    //a program which inputs three numbers from user and then displays their sum with the help of function:
    public static int average_function(int A, int B, int C){
        int sum = A+B+C;
        int average = sum/3;
        return(average);
    }
    public static void main(String[] args){
        Scanner average_object = new Scanner(System.in);
        System.out.print("Enter value of A: ");
        int A = average_object.nextInt();
        System.out.print("Enter value of B: ");
        int B = average_object.nextInt();
        System.out.print("Enter value of C: ");
        int C = average_object.nextInt();
        int average = average_function(A,B,C);
        System.out.print("Average of three numbers is: "+average);
    }
}