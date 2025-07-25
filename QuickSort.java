public class QuickSort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1; // index of smaller element

        for(int j=low; j<high; j++){
            // If current element is smaller than or equal to pivot
            if(arr[j] <= pivot){
                i++; // increment index of smaller element
                //TODO: swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++; // increment index of smaller element
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // pivot index
    }

    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] ={6, 3, 9, 5, 2, 8};
        int n = arr.length;
       
        quickSort(arr, 0, n - 1);

        //print
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();

        //TODO: time complexity: O(n log n)
        //TODO: space complexity: O(log n)
    }
}

/* TODO: QuickSort
    * QuickSort is a divide-and-conquer algorithm that sorts an array by selecting a 'pivot' element and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot.
    * It has a time complexity of O(n log n) and a space complexity of O(log n).
    * The algorithm works as follows:
    * 1. Choose a pivot element from the array.
    * 2. Partition the array into two sub-arrays: one with elements less than the pivot, and one with elements greater than or equal to the pivot.
    * 3. Recursively apply the same logic to the sub-arrays.
    * 4. Combine the sorted sub-arrays to get the final sorted array.
    
    * Example: [5, 2, 8, 1, 3] -> [1, 2, 3, 5, 8]   
    * * Note: The choice of pivot can affect the performance of the algorithm. Common strategies include choosing the first element, the last element, or a random element as the pivot.
 */
