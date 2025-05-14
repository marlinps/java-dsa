public class Recursion2RemoveDuplicatesString {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString){
        //base case
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            //character is already present in the string
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
 * Output: "abcd"
 */
