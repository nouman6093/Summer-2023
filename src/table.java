import java.util.*;
public class table{
    public static void main(String[] args){
        //a program which inputs a number from user and then prints its table:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 1; i < 11; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}