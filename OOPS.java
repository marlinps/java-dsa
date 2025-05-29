//TODO: Blueprint pen
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name; //this.name refers to the instance variable, this.name is used to differentiate between the instance variable and the parameter (object)
        // name refers to the parameter 
        this.age = age; // this.age refers to the instance variable, this.age is used to differentiate between the instance variable and the parameter (object)
        // age refers to the parameter
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Navy";
        pen1.type = "Ballpoint";

        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "Gel";

        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student("Marlin", 20);
        s1.printInfo();
        
    } 
}
