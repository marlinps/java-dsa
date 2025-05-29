class Student{
    String name;
    int age;

   // Constructor default
    Student() {
    }

    // Constructor with parameters
     Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
}

public class OOPSCopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Marlin";
        s1.age = 20;

        // Copy constructor
        Student s2 = new Student(s1);
        s2.printInfo();   
    } 
}
