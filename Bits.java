import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        // TODO: Get Bit -> AND (&)
        int n = 5;//0101
        int pos = 3;
        int bitMask = 1<<pos; // 1 << 3 = 8 (1000)

        if((bitMask & n) == 0){ //1000 & 0101 = 0000
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }

        // TODO: Set Bit -> OR (|)
        int n1 = 5; //0101
        int pos1 = 1;
        int bitMask1 = 1<<pos1;

        int newNumber = bitMask1 | n1;
        System.out.println(newNumber);     
        
        // TODO: Clear Bit -> AND With NOT
        int n2 = 5; //0101
        int pos2 = 2;
        int bitMask2 = 1<<pos2;
        int notBitMask = ~(bitMask2);

        int newNumber2 = notBitMask & n2;
        System.out.println(newNumber2);

        // TODO: Update Bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 : set oper=0 : clear
        int n3 = 5; // 0101 -> 0111 -> dec 7
        int pos3 = 1;

        int bitMask3 = 1<<pos3;
        if(oper == 1){
            //set
            int newNumber3 = bitMask3 | n;
            System.out.println(newNumber3);
        }else{
            //clear
            int newBitMask3 = ~(bitMask3);
            int newNumber3 = newBitMask3 & n3;
            System.out.println(newNumber3);
        }
    }
}
