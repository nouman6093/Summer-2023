import java.util.*;
public class recursion_3 {
    //print factorial of a number:
    public static int factorial(int n){
        if (n==1 || n==0){
            return 1;
        } else {
            return (n*factorial(n-1));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find it's factorial: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.print("Result is: "+result);
    }
}