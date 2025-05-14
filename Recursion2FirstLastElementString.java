public class Recursion2FirstLastElementString {
    public static int first = -1; //initialize invalid index
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element){
        //TODO: Base case
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currchar = str.charAt(idx);
        if(currchar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }

        findOccurance(str, idx+1, element);
    }
    
    public static void main(String[] args) {
        String str = "abaacdaefaahb";
        findOccurance(str, 0, 'a');
    }
}

/* TODO: First(1st) and Last accurance of an Element of String example" 'a' in "abaacdaefaahb"
 * example: abaacdaefaah
 * 
 */
