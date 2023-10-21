import java.util.*;
//move all x at the end of the string:
public class recursive_10 {
    public static int count = 0;
    public static String newString = "";
    public static void printString(int i, String str){
        if (i==str.length()){
            for (int j = 0; j < count; j++){
                newString += 'x';
            }
        System.out.print(newString);
            return;
        }
        if (str.charAt(i) == 'x'){
            count++;
        } else {
            newString += str.charAt(i);
        }
        printString(i+1,str);
    }
    public static void main(String[] args){
        String str = "axbcxxd";
        printString(0,str);
    }
}