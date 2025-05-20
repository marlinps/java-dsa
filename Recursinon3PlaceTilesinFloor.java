public class Recursinon3PlaceTilesinFloor {
    public static int placeTiles(int n, int m){
        //Base case
        if(n == m){
            return 2;
        }

        if(n < m){
            return 1;
        }

        //vertically
        int vertPlacement = placeTiles(n-m, m);

        //horizontally
        int horPalcement = placeTiles(n-1, m);

        return vertPlacement + horPalcement;
    }
    
    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));
    }
}

/* TODO: Place tiles in a floor using recursion.
 * base case: if n == m, return 2
 * base case: if n < m, return 1
 * formula: vertically = placeTiles(n-m, m)
 * formula: horizontally = placeTiles(n-1, m)
 * return vertically + horizontally
 */
