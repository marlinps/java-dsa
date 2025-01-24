import java.util.*;

public class SumAllOddNumbersFunction {
    public static void CalculateSumAllNumbers(int n){
        int sum = 0;

        if(n < 0){
            System.out.println("Invalid Numbers");
        }else{
            for(int i=1; i<=n; i++){
                if (i%2 != 0 ){
                    sum += i;
                }
            }

            System.out.println("Sum of n odd numbers "+sum);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CalculateSumAllNumbers(n);
    } 
}
