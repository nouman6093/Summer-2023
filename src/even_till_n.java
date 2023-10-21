import java.util.*;
public class even_till_n{
    public static void main(String[] args){
    //a program which prints even numbers till the number entered by the user:
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scanner.nextInt();
    for (int i = 0; i <= n; i=i+2){
            System.out.println(i);
    }
    }
}