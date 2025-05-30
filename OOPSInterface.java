interface Animal{
    int eyes = 2;

    void walk();
}

interface Herbivore{
    void eat();

    default void graze(){
        System.out.println("Grazes on grass");
    }
}

class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }

    public void eat(){
        System.out.println("Eats grass");
    }
}

public class OOPSInterface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        horse.graze();
    }
   
}
