import java.util.*;
public class recursion_4 {
    //print fibonacci series:
    public static void fibonacci(int a, int b, int n){
        if (n==0){
            return;
        }
        int c = a + b;
        System.out.print(c+" ");
        fibonacci(b,c,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("0 1 ");
        fibonacci(0,1,n-2);
    }
}