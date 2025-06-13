public class Recursion3CountTotalPathMaze {
    public static int countPaths(int i, int j, int n, int m){
        //Base case
        if(i == n || j == m){
            return 0;
        }

        if(i == n-1 && j == m-1){
            return 1;
        }

        //move downwards
        int downwards = countPaths(i + 1, j, n, m);

        //move right
        int rightPaths = countPaths(i, j + 1, n, m);

        return downwards + rightPaths;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}
/* TODO: Count total number of paths in a maze using recursion.

 * 
 */