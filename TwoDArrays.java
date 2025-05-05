
import java.util.*;

public class TwoDArrays {
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
        
        int x = sc.nextInt();
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j] == x){
                    System.out.println("x : " + x + " found at location [" + i + ", " + j + "]");
                }
            }
        }
    }
}

/* TODO: Example 
Input : rows = 2, cols= 3
1 2 3
2 3 4

Output
1 2 3
2 3 4
 */
