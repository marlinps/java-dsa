import java.util.*;

public class InvertedHalfPyramidNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //outer loop
        for(int i=1; i<=n; i++){
            //print numbers
            for(int j=i; j<=n; j++){
                System.out.print(i);
            }

            //print spaces
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }

            System.out.println();     
        }
    }  
}

/* TODO: Example Output Patterns n= 4
1111
222
33
4
 */