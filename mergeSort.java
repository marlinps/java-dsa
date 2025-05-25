public class MergeSort {
    public static void divide(int arr[], int si, int ei){
        // Base case
        // if start index is greater than or equal to end index, then return
        if(si >= ei){
            return;
        }
       
        int mid = si + (ei - si)/2; //(si + ei)/2

        //recursian call
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = {6, 3,9 , 5, 2, 8};
        int n = arr.length;
        
    }
}

/* TODO: Merge Sort Implementation in Java
 *  This code implements the merge sort algorithm, which is a divide-and-conquer algorithm for sorting an array.
 *  It recursively divides the array into halves, sorts each half, and then merges the sorted halves.
 *  The time complexity of merge sort is O(n log n) and the space complexity is O(n).
 */
