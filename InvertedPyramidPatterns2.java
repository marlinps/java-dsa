import java.util.*;

public class InvertedPyramidPatterns2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //TODO: outer loop
        for(int i=1; i<=n; i++){
            //TODO: inner loop -> space print
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            //TODO: inner loop -> stars print
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }   
    }  
}

/* TODO: Example Output Patterns rotated by 180 deg, n = 4
 *      *
 *     **   
 *    ***   
 *   ****
 */