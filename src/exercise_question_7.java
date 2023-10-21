import java.util.*;
public class exercise_question_7 {
    //while(n<1);
    public static void main(String[] args){
        Scanner numbers_object = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int num = numbers_object.nextInt();
        int positive = 0,negative= 0,zeros = 0;
        for (int i = 1; i<=num;i++){
            System.out.print("Enter an integer: ");
            int integer = numbers_object.nextInt();
            if (integer>0){
                positive++;
            } else if (integer<0){
                negative++;
            }else {
                zeros++;
            }
        }
        System.out.println("Number of Positive numbers: "+positive);
        System.out.println("Number of Negative numbers: "+negative);
        System.out.println("Number of Zeros: "+zeros);
    }
}