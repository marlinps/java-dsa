import java.util.*;

public class Recursion1 {
    public static void printNumDiscrease(int n){
        if(n == 0){
            return; //Break
        }

        System.out.println(n);
        printNumDiscrease(n-1); //TODO: Recursion
    }

    public static void printNumIncrease(int n){
        if(n == 6){
            return; //Break
        }

        System.out.println(n);
        printNumIncrease(n+1); //TODO: Recursion
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //exmp n =  5

        printNumDiscrease(n);
        printNumIncrease(n);
    } 
}
