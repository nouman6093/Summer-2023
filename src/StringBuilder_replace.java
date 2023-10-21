import java.util.*;
public class StringBuilder_replace {
    //Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
    //Example :
    //original = “eabcdef’ ; result = “iabcdif”
    //Original = “xyz” ; result = “xyz”
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String original = sc.nextLine();
        StringBuilder original_builder = new StringBuilder(original);
        String result = "";
        for (int i = 0; i < original_builder.length(); i++){
            if (original_builder.charAt(i) == 'e'){
                result += 'i';
            } else {
                result += original_builder.charAt(i);
            }
        }
        System.out.println(result);
    }
}