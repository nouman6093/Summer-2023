//Polymorphism: When we solve one problem using different methods in java that is called polymorphism. There are two
//types of polymorphism one is function overloading and the other is function overriding. Function overloading is
//compile time polymorphism and function overriding is runtime polymorphism. Runtime polymorphism is used at the time
//of inheritance. in function overloading we create different functions which have same name. they perform different actions
//yet they have same name.

import java.util.*;
class Student_poly {
    String name;
    int age;

    // Method to print the name
    public void printInfo(String name) {
        System.out.println(name);
    }

    // Method to print the age
    public void printInfo(int age) {
        System.out.println(age);
    }

    // Method to print both name and age
    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        // Creating a Student object
        Student_poly s1 = new Student_poly();
        s1.name = "Nouman Hameed";
        s1.age = 19;

        // Calling different versions of the printInfo method
        s1.printInfo(s1.name);              // Prints the name
        s1.printInfo(s1.age);               // Prints the age
        s1.printInfo(s1.name, s1.age);      // Prints both name and age
    }
}
