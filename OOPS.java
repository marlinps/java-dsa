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
        Pen pen = new Pen();
        pen.write();
    }
    
}
