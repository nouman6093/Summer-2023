import java.util.*;
public class functions_and_methods{
    //function to print users name:
    public static void print_name(String name){
        System.out.println(name);
        return;
    }

    //function to print hello world:
    public static void greetings(){
        System.out.println("Hello World.");
    }

    //function to add 2 numbers and return the sum:
    public static int add_numbers_function(int A, int B){
        int sum = A + B;
        return(sum);
    }

    //function to multiply 2 numbers and then return the result:
    public static int multiply_numbers_function(int C, int D){
        int multiply = C *   D;
        return(multiply);
    }

    //function to find factorial of a given number;
    public static int factorial_function(int factorial_variable){
        int factorial_variable_for_loop = 1;
        for (int i = factorial_variable; i>=1; i--){
            factorial_variable_for_loop *= i;
        }
        return(factorial_variable_for_loop);
    }

    //function which tells if a given number is even or not:
    public static void even_or_not_function(int even_or_not_variable){
        if (even_or_not_variable%2==0){
            System.out.println("Given number "+even_or_not_variable+" is even.");
        }else {
            System.out.println("Given number "+even_or_not_variable+" is not even.");
        }
    }


    //function to print table of a given number:
    public static void table_function(int table_variable){
        for (int i = 1; i <= 10; i++){
            System.out.println(table_variable+" * "+i+" = "+(table_variable*i));
        }
    }


    public static void main(String[] arg){
        //user name function:
        Scanner user_name = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = user_name.nextLine();
        print_name("Your name is: "+name);//function call
        //hello world function:
        greetings();//function call
        //addition function:
        Scanner add_numbers = new Scanner(System.in);
        System.out.print("Enter value of A for addition: ");
        int A = add_numbers.nextInt();
        System.out.print("Enter value of B for addition: ");
        int B = add_numbers.nextInt();
        int sum = add_numbers_function(A,B);
        System.out.println("Sum of A and B is: "+sum);
        //multiplication function:
        Scanner multiply_numbers = new Scanner(System.in);
        System.out.print("Enter value of C for multiplication: ");
        int C = multiply_numbers.nextInt();
        System.out.print("Enter value of D for multiplication: ");
        int D = multiply_numbers.nextInt();
        int multiply = multiply_numbers_function(C,D);
        System.out.println("Product of C and D is: "+multiply);
        //factorial function:
        Scanner factorial_object = new Scanner(System.in);
        System.out.print("Enter a positive number to find it's factorial: ");
        int factorial_variable = factorial_object.nextInt();
        int print_factorial_variable = factorial_function(factorial_variable);
        System.out.print("Factorial of given number is: "+print_factorial_variable);
        //even or not function:
        Scanner even_or_not_object = new Scanner(System.in);
        System.out.print("\nEnter a number for factorial: ");
        int even_or_not_variable = even_or_not_object.nextInt();
        even_or_not_function(even_or_not_variable);
        //table function:
        Scanner table_object = new Scanner(System.in);
        System.out.print("Enter a number for table: ");
        int table_variable = table_object.nextInt();
        table_function(table_variable);
    }
}