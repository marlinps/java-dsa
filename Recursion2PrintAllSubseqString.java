public class Recursion2PrintAllSubseqString {
    public static void subsequence(String str, int idx, String newString){
        //Base case
        if(idx == str.length()){
           System.out.println(newString);
           return;
        }

        char currChar = str.charAt(idx);

        //to be
        subsequence(str, idx + 1, newString + currChar); // 

        //or not to be
        subsequence(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequence(str, 0, "");
    }
}

/* TODO: Print all subsequences of a string
    * 1. Base case: if the index is equal to the length of the string, print the current subsequence.
    * 2. Recursive case: if the index is less than the length of the string, print the current subsequence and call the function again with the index incremented by 1. 
    * 3. Call the function again with the index incremented by 1 and the current character added to the subsequence.
    * 4. Print the current subsequence.
    input: "abc"
    * output: "", "a", "b", "ab", "c", "ac", "bc", "abc"
 * 
 */
