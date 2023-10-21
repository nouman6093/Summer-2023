import java.util.*;
//remove duplicates: sahi nahi samajh aaya
public class recursive_11 {
    public static String newString = "";
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int i){
        if (i==str.length()){
            System.out.print(newString);
            return;
        }
        char currentChar = str.charAt(i);
        if (map[currentChar-'a']){
            removeDuplicates(str,i+1);
        } else {
            newString += currentChar;
            map[currentChar-'a'] = true;
            removeDuplicates(str,i+1);
        }
    }
    public static void main(String[] args){
        String str = "abbccda";
        removeDuplicates(str,0);
    }
}