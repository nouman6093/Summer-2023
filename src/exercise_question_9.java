import java.util.*;
public class exercise_question_9 {
    //Write a function that calculates the Greatest Common Divisor of 2 numbers.
    public static int gcd_function(int a,int b){
        int gcd = 0;
        if (a<b){
            for (int i = 1; i<=a;i++){
                if(a%2==0 && b%2==0){
                    gcd = i;
                }
            }
        }
        else if (b<a){
            for (int i = 1; i<=b;i++){
                if(a%2==0 && b%2==0){
                    gcd = i;
                }
            }
        }
        return(gcd);
    }
    public static void main(String[] args){
        Scanner gcd_object = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = gcd_object.nextInt();
        System.out.print("Enter another number: ");
        int b = gcd_object.nextInt();
        int gcd = gcd_function(a,b);
        System.out.print("GCD is: "+gcd);
    }
}