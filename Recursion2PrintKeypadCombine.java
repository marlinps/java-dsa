public class Recursion2PrintKeypadCombine {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "xwx", "yz"};

    public static void printComb(String str, int idx, String combination){
        //Base case
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i = 0; i < mapping.length(); i++){
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        printComb(str, 0, "");  
    }
}

/*
 * TODO: Print all combinations of a string
 * 1. Base case: if the index is equal to the length of the string, print the current combination.  
 * 2. Recursive case: if the index is less than the length of the string, print the current combination and call the function again with the index incremented by 1.
 * 3. Call the function again with the index incremented by 1 and the current character added to the combination.
 input:23
 output:dg, dg, dh, di, eg, eh, ei, fg, fh, fi
 */
