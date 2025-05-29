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
 * 
*/