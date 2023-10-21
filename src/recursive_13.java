import java.util.*;
//print unique subsequences: sahi nahi samajh aaya
public class recursive_13 {
    public static void subsequences(String str, int i, String newString, HashSet<String> set){
        if (i == str.length()){
            if (set.contains(newString)){
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar = str.charAt(i);
        subsequences(str,i+1,newString+currentChar, set);
        subsequences(str,i+1,newString, set);
    }
    public static void main(String[] args){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str,0,"", set);
    }
}