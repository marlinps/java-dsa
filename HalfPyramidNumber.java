import java.util.*;

public class HalfPyramidNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }   
    }  
}

/* TODO:E xample Output Patterns n= 5
 *   1
 *   1 2   
 *   1 2 3  
 *   1 2 3 4
 *   1 2 3 4 5
 */