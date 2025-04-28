import java.util.Scanner;

public class PascalsTrianglePatterns {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();

        //outer loop
        for(int i=1; i<=n; i++){
            int c =1;

            //print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //print number
            for(int j=1; j<=i; j++){
                System.out.print(c+" ");
                c = c * (i-j)/j;
            }

            System.out.println();
        }
    }
}

/*TODO: Example Output Patterns n= 5
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

TODO: this is binomial coefficent 
*/


