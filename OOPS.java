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

        Student s1 = new Student();
        s1.name = "Rayyan";
        s1.age = 6;

        s1.printInfo();
        
    } 
}
