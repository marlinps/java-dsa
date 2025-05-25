public class MergeSort {
    public static void conquer(int arr[], int si, int mid, int ei){
        // TODO: create temporary array to hold the merged elements
        int merged[] = new int[ei - si + 1];

        int idx1 = si; //index for left subarray
        int idx2 = mid + 1; //index for right subarray
        int x = 0; //index for merged array

        //compare elements from both subarrays and merge them
        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }

        //copy the merged array back to the original array
        for(int i=0, j=si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei){
        // Base case
        // if start index is greater than or equal to end index, then return
        if(si >= ei){
            return;
        }
       
        int mid = si + (ei - si)/2; //(si + ei)/2

        //recursion call
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = {6, 3,9 , 5, 2, 8};
        int n = arr.length;
        System.out.println("Array before sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        
        divide(arr, 0, n-1);
        
        System.out.println("\nArray after sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}

/* TODO: Merge Sort Implementation in Java
 *  This code implements the merge sort algorithm, which is a divide-and-conquer algorithm for sorting an array.
 *  It recursively divides the array into halves, sorts each half, and then merges the sorted halves.
 *  The time complexity of merge sort is O(n log n) and the space complexity is O(n).
 */
