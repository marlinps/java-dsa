import java.util.Scanner;

public class BinaryRightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int brh1 = n >> 1;
        int brh2 = n >> 2;
        int brh3 = n >> 3;

        System.out.println(brh1);
        System.out.println(brh2);
        System.out.println(brh3);
    }
}
