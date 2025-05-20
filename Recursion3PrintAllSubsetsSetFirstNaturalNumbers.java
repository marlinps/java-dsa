import java.util.ArrayList;

public class Recursion3PrintAllSubsetsSetFirstNaturalNumbers {
    public static void printSubsets(ArrayList<Integer> subset) {
        for(int i=0; i < subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        //Base case
        if(n == 0){
            printSubsets(subset);
            return;
        }

        //Include the current number
        subset.add(n);
        findSubsets(n - 1, subset);

        //Exclude the current number
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }
    
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset); 
    }
}

/* TODO: Print all subsets of the first n natural numbers using recursion.
 * for example, if n = 3, the subsets are:
 * 1, 2, 3
 * 1, 2
 * 1, 3
 * 2, 3
 * 1
 * 2
 * 3
 * empty set
 * * The subsets are printed in the order of their size, starting from the largest subset to the smallest.
 * 
 */
