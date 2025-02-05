import java.util.Scanner;

public class BinaryLeftShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int blf1 = n << 1;
        int blf2 = n << 2;
        int blf3 = n << 3;

        System.out.println(blf1);
        System.out.println(blf2);
        System.out.println(blf3);
    }
}

/* TODO: Notes
    00001101  (Decimal: 13)
    << 2 (Shift left by 2)
    00110100  (Decimal: 52)

    Shifting left by n positions is equivalent to multiplying by 2ⁿ:
    13 << 1 → 13 * 2 = 26
    13 << 2 → 13 * 4 = 52
    13 << 3 → 13 * 8 = 104
  
 */
