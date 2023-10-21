import java.util.*;
public class String_builder {
    public static void main(String[] args){
        //string builder:
        //declaration:
        StringBuilder name = new StringBuilder("Nouman Hameed");
        System.out.println(name);

        //accessing specific character from string:
        System.out.println(name.charAt(0));

        //replace specific character:
        name.setCharAt(0,'T');
        System.out.println(name);

        //insert a character:
        name.insert(0,'T');
        System.out.println(name);

        //delete character:
        name.delete(0,1);
        System.out.println(name);

        //append a character (append means to add something at the end):
        name.append(" Stark");
        System.out.println(name);

        //print length of string:
        System.out.println(name.length());
    }
}