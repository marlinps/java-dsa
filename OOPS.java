//TODO: Blueprint pen
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Navy";
        pen1.type = "Ballpoint";
        
        System.out.println("Pen Color " + pen1.color + ", types " + pen1.type);

        pen1.write();
    } 
}
