public class Recursion3FindNumberWays {
    public static int callGuests(int n){
        //Base case
        if(n <= 1){
            return 1;
        }
        //single
        int ways1 = callGuests(n-1);

        //pair
        int ways2 = (n-1) * callGuests(n-2);

        return ways1 + ways2;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(callGuests(n));
    }
}

/* TODO: Find number of ways to reach the nth stair using recursion.
 * base case: if n == 1, return 1
 * formula: vertically = callGuests(n)
 * formula: horizontally = (n-1) * callGuests(n-2)
 * return vertically + horizontally
 * 
 */