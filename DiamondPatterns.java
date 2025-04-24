import java.util.*;

public class DiamondPatterns{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //upper half
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
          
            System.out.println();
        } 

        //lower half
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
          
            System.out.println();
        } 
    }  
}

/* TODO: Example Output Patterns for n= 4
   *    i= 1, spaces=3, stars=1
  ***   i= 2, spaces=2, stars=3 
 *****  i= 3, spaces=1, stars=5
******* i= 4, spaces=0, stars=7
*******
 *****
  ***
   *
*/