public class Recursion2towerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        //TODO: Base case
        if(n == 1){
            System.out.println("transfer disk "+ n + " from "+ src + " to " + dest);
            return;
        }

        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+ n + " from "+ src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 2;
        towerOfHanoi(n, "S", "H", "D");
    }
}

/* TODO: TOWER OF HANOI ALGORITHM
 *  TOH(n, S, H, D)
 *  1. TOH(n-1, S, D, H)
 *  2. Move disc n from S to C
 *  3. TOH(n-1, H, S, D)
 */

 /* TODO: NOTES
    The idea is to use the helper node to reach the destination using recursion. Below is the pattern for this problem:

    Shift ‘N-1’ disks from ‘S’ to ‘D’, using H.
    Shift last disk from ‘S’ to ‘D’.
    Shift ‘N-1’ disks from ‘H’ to ‘D’, using S.
  */