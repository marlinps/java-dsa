public class Recursion2towerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        //TODO: Base case
        if(n == 1){
            System.out.println("transfer disk "+ n + " from "+ src + " to " + dest);
            return;
        }

        //TODO: tansfer n-1 disks from src to helper using dest as a 'helper'
        towerOfHanoi(n-1, src, dest, helper);

        //TODO: transfer nth disk from src to dest
        System.out.println("transfer disk "+ n + " from "+ src + " to " + dest);

        //TODO: transfer n-1 disks from helper to dest using src as a 'helper'
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
 
 /* TODO: FORMULA
    The recursive solution to this problem can be broken down into three steps:
    
    1. Move n-1 disks from source to helper using destination as a helper.
    2. Move the nth disk from source to destination.
    3. Move n-1 disks from helper to destination using source as a helper.

    The idea is to use the helper node to reach the destination using recursion. Below is the pattern for this problem:

    Shift ‘N-1’ disks from ‘S’ to ‘D’, using H.
    Shift last disk from ‘S’ to ‘D’.
    Shift ‘N-1’ disks from ‘H’ to ‘D’, using S.
  */