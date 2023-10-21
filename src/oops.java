//oop describes a set of rules for writing programs regarding objects and classes. A class
//contains properties and methods for objects whereas object is an instance or entity of a class.
// a constructor is a special function in java which is used to create an object. there are three
//types of constructors. its name is similar to the name of class. Constructor doesn't return any
//value. Three types of constructors include: non-parameterized, parameterized, default and copy.
//there are also destructors in java but we don't write them because java already has garbage
//collector built into it. oop has 4 important topics which are: abstraction, polymorphism, inheritance and
//encapsulation.

import java.util.*;
class pen{
    String color;
    String type;
    public void write(){
        System.out.print("Writing Something.");
    }
    public void printInfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){  //Student() is a non-parameterized constructor.
        System.out.println("Constructor Called: ");
    }
    //parameterized constructor:
    Student(String name, int age){      //Student(String name, int age) is parameterized constructor
        this.name = name;
        this.age = age;
    }
    Student(Student s3){    //Student(Student s3) is a copy constructor
        this.name = s3.name;
        this.age = s3.age;
    }
}
public class oops {
    public static void main(String[] args){
        pen pen1 = new pen();   //pen() is a default constructor
        pen1.color = "blue";
        pen1.type = "gel";
        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "ball point";
        pen1.printInfo();
        pen2.printInfo();
        Student s1 = new Student();     //Student() is a default constructor
        s1.name = "Nouman Hameed";
        s1.age = 19;
        s1.printInfo();
        Student s2 = new Student("Doctor",18);      //Student("Doctor",18); is parameterized constructor
        s2.printInfo();
        Student s3 = new Student(s1); //Student(s10) is a copy constructor
        s3.printInfo();
    }
}