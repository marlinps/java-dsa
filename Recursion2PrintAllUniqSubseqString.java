import java.util.HashSet;

public class Recursion2PrintAllUniqSubseqString {
   public static void uniqSubsequence(String str, int idx, String newString, HashSet<String> set){
        //Base case
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);

        //to be
        uniqSubsequence(str, idx + 1, newString + currChar, set); // 

        //or not to be
        uniqSubsequence(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqSubsequence(str, 0, "", set);
    }
}

/* TODO: Print all unique subsequences of a string
  base case: if the index is equal to the length of the string, print the current subsequence.
  recursive case: if the index is less than the length of the string, print the current subsequence and call the function again with the index incremented by 1. 
  call the function again with the index incremented by 1 and the current character added to the subsequence.
  print the current subsequence.

 * 
 */
