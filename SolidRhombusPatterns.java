import java.util.*;

public class SolidRhombusPatterns{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }  
    }  
}

/* TODO: Example Output Patterns for n = 5
        *****
       *****
      *****
     *****
    *****
*/