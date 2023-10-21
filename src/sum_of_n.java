import java.util.*;
public class sum_of_n{
    public static void main(String[] args){
        //take number from user and then print sum till the beginning:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = n; n>0; n--){
            sum = sum+n;
        }
        System.out.println(sum);
    }
}