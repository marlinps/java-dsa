public class Recursion2ArrayIsSortedStrictlyIncreasing {
    public static boolean isSorted(int arr[], int idx){
        //base case
        if(idx == arr.length - 1){
            return true;
        }

        if(arr[idx] >= arr[idx+1]){
            //array is unsorted
            return false;
        }

        //recursive case
         return isSorted(arr, idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 3};
        System.out.println(isSorted(arr, 0));
    }
}

/*TODO: Array is sorted strictly increasing return true or false
 * 1. Base case: if the array has only one element, it is sorted.
 * 2. Check if the first element is less than the second element.
 * 3. Recursively check the rest of the array.
 

 * Example: [1, 2, 3, 4] -> true
 * Example: [1, 2, 2, 4] -> false
*/