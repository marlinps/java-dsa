import java.util.*;

public class Arrays22 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//rows
        int m = sc.nextInt();//columns
        int numbers[][] = new int[n][m];

        //input 
        //rows
        for(int i=0; i<n; i++){
            //columns
            for(int j=0; j<m; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
