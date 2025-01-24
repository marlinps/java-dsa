import java.util.*;

public class CircumferenceCircleFunction {
    public static double CircumferenceCircle(int r){
        double pi = 3.14;

        double c = 2 * pi *r;
        
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println("Circumference of a circle "+CircumferenceCircle(r));
    }
}
