class Student{
    String name;
    int age;

    public void prinInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}
    
public class OOPPolymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Rayyan";
        s1.age = 21;

        // Method Overloading
        s1.prinInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);  
    }
}

/* Polymorphism in OOP
 * Polymorphism is a core concept in Object-Oriented Programming (OOP) that allows objects to be treated as instances of their parent class, even if they are actually instances of a child class. This enables a single interface to represent different underlying forms (data types).
 *  It allows methods to do different things based on the object it is acting upon, even if they share the same method name.
 *  There are two types of polymorphism:
 *  1. Compile-time polymorphism (Method Overloading): This occurs when multiple methods in the same class have the same name but different parameters (different type, number, or order of parameters).
 *  2. Runtime polymorphism (Method Overriding): This occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.
 *  Example of Method Overloading:
 *  In the above code, the `printInfo` method is overloaded with different parameter types and counts. This allows the same method name to be used for different purposes, depending on the arguments passed.   
 *  Example of Method Overriding:
 *  In the context of polymorphism, method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass. This is not shown in the above code but can be implemented by creating a subclass that extends the `Student` class and overrides the `printInfo` method.
 *  Example of Runtime Polymorphism:
 *  In the context of polymorphism, runtime polymorphism allows a method to be called on an object of a superclass type, but the actual method that gets executed is determined by the actual object type at runtime. This is typically achieved through method overriding.
*/