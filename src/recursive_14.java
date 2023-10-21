import java.util.HashSet;
public class recursive_14 {
    //print keypad combinations using recursion:
    public static String[] keypad = {".","abc", "def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombination(String str, int i, String newString){
        if (i==str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(i);
        String mapping = keypad[currentChar-'0'];
        for (int j = 0; j < mapping.length();j++){
            printCombination(str,i+1,newString+mapping.charAt(j));
        }
    }
    public static void main(String[] args){
        String str = "4";
        printCombination(str,0,"");
    }
}