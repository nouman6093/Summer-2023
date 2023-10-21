import java.util.*;
public class recursie_7 {
    //print a string in reverse:
    public static void printString(String str, int i){
        if (i==0){
            System.out.print(str.charAt(i));
            return;
        } else {
            System.out.print(str.charAt(i));
            printString(str, i-1);
        }
    }
    public static void main(String[] args){
        String str = "abcd";
        printString(str, str.length()-1);
    }
}