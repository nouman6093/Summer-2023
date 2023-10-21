import java.util.*;
public class Bit_manipulation_update {
    //Write a program to toggle a bit a position = “pos” in a number “n”.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter position: ");
        int position = sc.nextInt();
        int bitMask = 1<<position;
        int result = bitMask ^ n;
        System.out.println("initial number: "+n);
        System.out.println("final number: "+result);
    }
}