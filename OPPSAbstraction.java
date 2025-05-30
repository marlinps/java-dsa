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

public class OPPSAbstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
    }
}
   