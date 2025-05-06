import java.util.*;

public class Recursion1 {
    public static void printNumDiscrease(int n){
        //TODO: Base case
        if(n == 0){
            return; //Break
        }

        System.out.println("printNumDiscrease: " +  n);
        printNumDiscrease(n-1); //TODO: Recursion
    }

    public static void printNumIncrease(int n){
        //TODO: Base case
        if(n == 6){
            return; //Break
        }

        System.out.println("printNumIncrease: " + n);
        printNumIncrease(n+1); //TODO: Recursion
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //exmp n =  5
        int n1 = sc.nextInt(); //exmp n =  1

        printNumDiscrease(n);
        printNumIncrease(n1);
    } 
}

/* TODO:
 * 
 *  Print numbers from 5 to 1.
 *  Print numbers from 1 to 5.
 */
