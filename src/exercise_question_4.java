import java.util.*;
public class exercise_question_4{
    //Write a function that takes in the radius as input and returns the circumference of a circle.
    public static double circumference_function(int radius){
        double circumference = 2*3.14159*radius;
        return(circumference);
    }
    public static void main(String[] args){
        Scanner circumference_object = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int radius = circumference_object.nextInt();
        double circumference = circumference_function(radius);
        System.out.print("Circumference of circle is: "+circumference);
    }
}