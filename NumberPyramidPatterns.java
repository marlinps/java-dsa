import java.util.*;

public class NumberPyramidPatterns{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.err.print(" ");
            }

            //number -> print row no, row no times
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            
            System.out.println();
        } 
    }  
}

/* TODO: Example Output Patterns for n = 5
    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
*/