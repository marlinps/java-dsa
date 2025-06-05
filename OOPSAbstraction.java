abstract class Animal{
    abstract void walk();

    Animal(){
        System.out.println("You are creating a new animals");
    }

    public void eat(){
        System.out.println("Eats food");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }

    @Override
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Created a Chicken");
    }

    @Override
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class OOPSAbstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
    }
}

/* TODO: OOPS Abstraction
    * Abstraction is a fundamental concept in Object-Oriented Programming (OOP) that focuses on hiding the complex implementation details and showing only the essential features of an object.
    * It allows you to create a simplified representation of an object, which can be used to perform specific tasks without needing to understand the underlying implementation.
    * In Java, abstraction can be achieved using abstract classes and interfaces.
    * 1. Abstract Class: An abstract class is a class that cannot
    * be instantiated and may contain abstract methods (methods without a body) as well as concrete methods (methods with a body). Abstract classes are used to define a common interface for a group of related classes.
    * 2. Interface: An interface is a reference type in Java that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. A class implements an interface by providing concrete implementations for the methods defined in the interface.
    * Abstraction helps in reducing complexity, increasing code reusability, and improving maintainability by allowing developers to work with high-level concepts rather than low-level details.
    * In the above code, we have an abstract class `Animal` with an abstract method `walk()`. The `Horse` and `Chicken` classes extend the `Animal` class and provide their own implementations of the `walk()` method. This demonstrates abstraction by allowing us to define a common interface for all animals while hiding the specific implementation details of each animal's walking behavior.
    * The `Animal` class also has a concrete method `eat()`, which can be used by all subclasses without needing to redefine it.
    * The `Horse` and `Chicken` classes can be instantiated, and they will call the constructor of the `Animal` class, demonstrating the use of constructors in abstract classes.
 */
   