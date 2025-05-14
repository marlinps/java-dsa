public class Recursion2MoveAllElemToEndString {
    public static void moveAllX(String str, int idx, int count, String newString){
        if(idx == str.length()){
            //base case
            for(int i = 0; i < count; i++){
                newString += 'x'; //newString = newString + 'x'
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            //recursive call
            moveAllX(str, idx + 1, count, newString);
        }else{
            newString += currChar; //newString = newString + currCHar
            //recursive call
            moveAllX(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");// 0 is the index of the string 
    }
}

/* TODO: Move all 'x' to the end of the string
    * example: axbcxxd -> abcdxxx
 * 
 */
