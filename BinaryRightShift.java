import java.util.Scanner;

public class BinaryRightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int brh1 = n >> 1;
        int brh2 = n >> 2;
        int brh3 = n >> 3;
        int brh4 = n >> 4;

        System.out.println(brh1);
        System.out.println(brh2);
        System.out.println(brh3);
        System.out.println(brh4);
    }
}

/* TODO: Notes
    00001101  (Decimal: 13)
    >> 2 (Shift right by 2)
    00000012  (Decimal: 52)

    Shifting left by n positions is equivalent to multiplying by 2ⁿ:
    13 >> 1 → 13 / 2 = 6
    13 >> 2 → 13 / 4 = 3
    13 >> 3 → 13 / 8 = 1
    13 >> 4 → 13 / 16 = 0
 */
