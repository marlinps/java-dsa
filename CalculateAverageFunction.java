import java.util.*;

public class CalculateAverageFunction {
    public static void calculateAverage(int a, int b, int c)
    {
        int avg = (a + b + c)/3;
        System.out.println("Average of 3 numbers is "+ avg);
        return;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        calculateAverage(a, b, c);
    }
    
}
