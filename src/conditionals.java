import java.util.*;
public class conditionals{
    public static void main(String[] args){
        //conditionals:
        //program to find if user is adult or not:
        Scanner person = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = person.nextInt();
        if (age>=18){
            System.out.println("You are adult.");
        }
        else {
            System.out.println("You are not an adult.");
        }


        //program to find even or odd number:
        Scanner even_odd = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = even_odd.nextInt();
        if (x%2==0){
            System.out.println("Even.");
        }else {
            System.out.println("Odd.");
        }


        //a program which inputs two numbers and then compares them if one is greater than other using if else
        Scanner comparison = new Scanner(System.in);
        System.out.print("Enter value of A: ");
        int a = comparison.nextInt();
        System.out.print("Enter value of B: ");
        int b = comparison.nextInt();
        if (a == b) {
            System.out.println("A is equal to B.");
        } else if (a > b) {
            System.out.println("A is greater than B.");
        } else if (b > a) {
            System.out.println("B is greater than A.");
        }


        //using switch write a program in which user enters either 1,2 or 3. if 1 is pressed then print Hello if 2 is pressed then print assalam o alaikum if 3 is pressed then print bonjour
        Scanner greetings = new Scanner(System.in);
        System.out.print("Enter 1 or 2 or 3: ");
        int y = greetings.nextInt();
        switch (y) {
            case 1: {
                System.out.println("Hello.");
                break;
            }
            case 2: {
                System.out.println("Assalam O Alaikum.");
                break;
            }
            case 3: {
                System.out.println("Bonjour.");
                break;
            }
            default: {
                System.out.println("Invalid number. Please select either 1 or 2 or 3.");
            }
        }
    }
}