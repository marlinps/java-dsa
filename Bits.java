public class Bits {
    public static void main(String[] args) {
        //TODO: Get Bit -> AND (&)
        int n = 5;//0101
        int pos = 3;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }

        //TODO: Set Bit -> OR (|)
        int n1 = 5;
        int pos1 = 1;
        int bitMask1 = 1<<pos1;

        int newNumber = bitMask1 | n1;
        System.out.println(newNumber);        
    }
}
