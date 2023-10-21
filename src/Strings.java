import java.util.*;
public class Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first_name = sc.next();
        System.out.print("Enter your last name: ");
        String last_name = sc.next();
        System.out.print("Your full name is: " +first_name+" "+last_name);
        String full_name = first_name + last_name;
        System.out.print("\nNumber of characters in your full name are: "+full_name.length());
        //assigning each character of string to an index:
        System.out.println();
        for (int i = 0; i < full_name.length(); i++){
            System.out.println(full_name.charAt(i));
        }

        //comparison function for strings:
        String name1 = "Tony";
        String name2 = "Tony";
        if (name1.equals(name2)){
            System.out.print("Strings are equal.");
        } else {
            System.out.print("Strings are not equal.");
        }

        //substring function for strings:
        String sentence = "My name is Nouman.";
        String substring = sentence.substring(11,sentence.length());
        System.out.print("\nSubstring: "+substring);
        String sentence_2 = "TonyStark";
//        String substring_2 = sentence_2.substring(0,4);
        //another way:
        String substring_2 = sentence_2.substring(4);
        System.out.print("\nAnother Substring: "+substring_2);
    }
}