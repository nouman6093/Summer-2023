import java.util.Scanner;
public class add{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Value of a is: ");
        System.out.println(a);
        System.out.print("Value of b is: ");
        System.out.println(b);
        System.out.print("Sum of a and b is: ");
        int sum = a+b;
        System.out.println(sum);
    }
}