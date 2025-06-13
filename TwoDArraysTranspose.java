
import java.util.*;

public class TwoDArraysTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input
        //rows
        for(int i=0; i<rows; i++){
            //columns
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //ouput
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }   
        
        //to print tranpose
        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/* TODO: Example 
Input : rows = 2, cols= 3
1 2 3
2 3 4

Output Transpose rows = 3, cols= 2
1 2
2 3
3 4
 */
