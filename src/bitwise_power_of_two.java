import java.util.*;
public class bitwise_power_of_two {
    //Write a program to find if a number is a power of 2 or not.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if ((num & (num - 1)) ==0){
            System.out.println("Entered number is power of 2.");
        } else {
            System.out.println("Entered number is not power of two.");
        }
    }
}