import java.util.Scanner;

public class exercise_question_5{
    //Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static void vote_function(int age){
        if (age>=18){
            System.out.println("Congratulations! You are eligible to vote.");
        } else {
            System.out.println("Unfortunately, you can't vote.");
        }
    }
    public static void main(String[] args){
        Scanner vote_object = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = vote_object.nextInt();
        vote_function(age);
    }
}