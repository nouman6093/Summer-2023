import java.util.*;
public class exercise_question_8 {
    //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    public static double power_function(double base, int power){
        if (power==0){
            return 1;
        } else if (power>0) {
            double product = 1;
            for (int i = 1; i<=power;i++){
                product *= base;
            } return(product);
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner power_object = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = power_object.nextDouble();
        System.out.print("Enter power: ");
        int power = power_object.nextInt();
        double result = power_function(base,power);
        System.out.println("Power is: "+result);
    }
}