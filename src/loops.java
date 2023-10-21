import java.util.*;
public class loops{
    public static void main(String[] args){
        //for loop:
        System.out.println("A program which prints Hello World 3 times using for loop: ");
        for (int i = 1; i <= 3; i++){
            System.out.println("Hello World.");
        }
        System.out.println();
        System.out.println("A program which prints counting from 1 to 10: ");
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }

        //while loop:
        System.out.println();
        System.out.println("A program which prints counting from 1 to 10 using while loop: ");
        int y = 1;
        while (y<11){
            System.out.println(y);
            y++;
        }

        //do while loop:
        System.out.println();
        System.out.println("A program which prints counting from 1 to 10 using do while loop: ");
        int z = 1;
        do {
            System.out.println(z);
            z++;
        }while(z<11);
    }
}