public class Recursion2stringInReverse {
    public static void printRev(String str, int idx){
        //TODO: Base case
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        //TODO: recursive call
        printRev(str, idx-1);
    }
    
    public static void main(String[] args) {
        String str = "abcd";
        printRev(str, str.length()-1);  
    }
}

/* TODO: String in Reverse exmp abcd -> dcba
 * 
 */
