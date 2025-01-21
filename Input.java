import java.util.*;

public class Input {
    public static void main(String[] args){
        //Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //nextInt()
        //nextFloat()
        System.out.println(name);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
    
}
