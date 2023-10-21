import java.util.*;
//print sum of n natural numbers:
public class recursion_2 {
    public static void print_Sum(int n, int i, int sum){
        if (i==n){
            sum+=i;
            System.out.print(sum);
            return;
        }
        sum += i;
        print_Sum(n,i+1,sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        print_Sum(n,1,0);
    }
}