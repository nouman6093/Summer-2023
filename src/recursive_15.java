import java.util.*;
public class recursive_15 {
    //print permutation of a string sahi aali samajh nahi aayi:
    public static void printPermutation(String str, String permutation){
        if (str.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int j = 0; j < str.length(); j++){
            char currentChar = str.charAt(j);
            String newStr = str.substring(0,j) + str.substring(j+1);
            printPermutation(newStr, permutation+currentChar);
        }
    }
    public static void main(String[] args){
        String str = "abc";
        printPermutation(str,"");
    }
}