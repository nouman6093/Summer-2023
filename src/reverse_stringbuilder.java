import java.util.*;
public class reverse_stringbuilder {
    public static void main(String[] args){
        //Reverse a String (using StringBuilder class)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String user_input = sc.nextLine();
        StringBuilder sb = new StringBuilder(user_input);
        for (int i = 0; i < sb.length()/2;i++){
            int front = i;
            int back = sb.length()-i-1;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.print(sb);
    }
}