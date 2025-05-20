public class Recursion3PrintAllPemutationString {
    public static void printPerm(String str, String permutation){
        //Base Case
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            //"abc" -> "bc"
            String newStr = str.substring(0, i) + str.substring(i+1);
            //recursive call
            printPerm(newStr, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");  
    }
}

/* TODO: Print all permutations of a string "abc" using recursion.
 * 
 * input: "abc"
 * output: "abc", "acb", "bac", "bca", "cab", "cba"
 * 
 */