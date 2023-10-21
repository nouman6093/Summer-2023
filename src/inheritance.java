//inheritance means that a class gets properties of other class. keyword extends is used. it has 4 types which include
//single level inheritance, multilevel inheritance, hierarchial inheritance, hybrid inheritance and multiple inheritance(
//its in c++ and not in java) but in jave interfaces are used.

import java.util.*;
class Shape{    //shape is base class
    String color;
    public void displayArea(){
        System.out.print("Displaying Area: ");
    }
}
class Triangle extends Shape{   //triangle inherited properties of shape its called single level inheritance. triangle is deried class
    //here triangle class inherited properties of shape class
    public void displayArea(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class EquilateralTriangle extends Triangle {   //equilateral triangle inherited properties of triangle and triangle inherited properties of shape this is called multilevel inheritance
    public void displayArea(int l, int h) {
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{ //triangle and circle inherited properties of shape this is called hierarchial inheritance
    public void displayArea(int r){
        System.out.println((3.14)*r*r);
    }
}
public class inheritance {
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
//a program in which different inheritance types are used together such inheritance type is called hybrid inheritance.