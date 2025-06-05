import java.util.*;

class Shape{
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14) * r * r);
    }
}

public class OOPSInheritance {
    public static void main(String[] args) {
       Triangle t1 = new Triangle();
    }
}

/* TODO: Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a class (subclass or derived class) to inherit properties and behaviors (methods) from another class (superclass or base class).
    * This promotes code reusability and establishes a hierarchical relationship between classes.
    * In Java, inheritance is implemented using the `extends` keyword. A subclass can inherit fields and methods from a superclass, allowing it to reuse code and add or override functionality.
    * In the above code, we have a base class `Shape` with a method `area()`. The `Triangle` and `Circle` classes extend the `Shape` class, inheriting its properties and methods.
    * The `Triangle` class has an additional method `area(int l, int h)` to calculate the area of a triangle, while the `Circle` class has a method `area(int r)` to calculate the area of a circle.
    * This demonstrates how inheritance allows subclasses to inherit common functionality from a superclass while also providing their own specific implementations.
    * Inheritance can be single (a class inherits from one superclass) or multiple (a class inherits from multiple superclasses, which is not directly supported in Java but can be achieved through interfaces).
    * Inheritance is a key feature of OOP that helps in creating a more organized and modular code structure, making it easier to maintain and extend.
    * * Inheritance allows for the creation of a class hierarchy, where subclasses can inherit properties and behaviors from their superclasses, promoting code reuse and reducing redundancy.
    * * Inheritance can be single (a class inherits from one superclass) or multiple (a class inherits from multiple superclasses, which is not directly supported in Java but can be achieved through interfaces).
 * 
 */