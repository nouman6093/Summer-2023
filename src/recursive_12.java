import java.util.*;
//print subsequences: sahi nahi samajh aaya
public class recursive_12 {
    public static void subsequences(String str, int i, String newString){
        if (i == str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(i);
        subsequences(str,i+1,newString+currentChar);
        subsequences(str,i+1,newString);
    }
    public static void main(String[] args){
        String str = "abc";
        subsequences(str,0,"");
    }
}