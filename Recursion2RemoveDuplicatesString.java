public class Recursion2RemoveDuplicatesString {
    // A global boolean array of size 26 (for each lowercase English letter).
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString){
        //Base case
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        System.out.println("Current character: " + currChar);

        if(map[currChar - 'a']){//map[currChar - 'a'] = true; Marks that 'a' has been seen or used
          
            // Skip this character, it's a duplicate
            removeDuplicates(str, idx + 1, newString);
        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str, 0, ""); // 0 is the index of the string
    }
}

/* TODO: Remove duplicates from a string
 * Input: "abbccda"
 
 * Process:
   Current: 'a' → not seen → add to newString: "a"
   Current: 'b' → not seen → "ab"
   Current: 'b' → already seen → skip
   Current: 'c' → not seen → "abc"
   Current: 'c' → already seen → skip
   Current: 'd' → not seen → "abcd"
   Current: 'a' → already seen → skip

 * Output: "abcd"
 */
