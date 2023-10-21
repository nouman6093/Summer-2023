import java.util.*;
public class Bit_manipulation_counting {
    //Write a program to count the number of 1’s in a binary representation of the number.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++){
            if ((n&(1<<i)) != 0){
                count++;
            }
        }
        System.out.println("Number of 1's in given number are: "+count);
    }
}