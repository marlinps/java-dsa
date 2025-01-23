import java.util.*;

public class GreaterOfThoseTwoNumbersFunction {
    public static int GreaterOfThoseTwoNumbers(int a, int b){
        int temp;

        if(a > b){
            temp = a;
        }else{
            temp = b;
        }
        return temp;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Greater Of Those Two Numbers ("+a+" and "+b+") : "+GreaterOfThoseTwoNumbers(a, b));
    }
}
