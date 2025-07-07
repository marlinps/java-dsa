public class BacktrackingPrintAllPermutations {
    public static void printPermutation(String str, String perm, int idx){
        //Base case
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, perm + currChar, idx);
        }

    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}

/*
 TODO: Print all permutations of a given string using backtracking.
 base case if the string is empty, print the current permutation
 For example, if the input string is "abc", the output should be:
 "abc", "acb", "bac", "bca", "cab", "cba"
*/