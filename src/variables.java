import java.util.Scanner;

public class variables{
    public static void main (String args[]){
        //initializing variables:
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.print("Addition: ");
        System.out.println(sum);
        int mul = a*b;
        System.out.print("Product: ");
        System.out.println(mul);
        int diff = b-a;
        System.out.print("Subtraction: ");
        System.out.println(diff);
        int division = b/a;
        System.out.print("Division: ");
        System.out.println(division);




        //inputting values in a variable
        Scanner sc = new Scanner(System.in);
        //Scanner is class. sc is name of created object. new is keyword and Scanner(System.in) is constructor both constructor and new keyword are used to create an object. In this line sc object is created only to take input from user
        System.out.println("Enter your name: ");
        String sun_name = sc.nextLine();
        //String is datatype. sun_name is variable. sc is object. nextLine is method of class Scanner.
        System.out.println("Enter your father's name: ");
        String father_name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter a floating number: ");
        float float_num = sc.nextFloat();
        System.out.print("Your name is: ");
        System.out.println(sun_name);
        System.out.print("Your father's name is: ");
        System.out.println(father_name);
        System.out.print("Your age is: ");
        System.out.println(age);
        System.out.print("The Floating number you entered is: ");
        System.out.println(float_num);
    }
}