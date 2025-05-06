public class BubbleSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2,9};
        
        //TODO: time complexity = 0(n^2)
        //TODO: bubble sort
        for(int i=0; i<arr.length-1; i++){//n-1 -> 5-1=4
            for(int j=0; j<arr.length-i-1; j++){ //n-i-1 -> n-0-1=4-0-1=3
                if(arr[j] > arr[j+1]){
                    //TODO: swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        int arrLength = arr.length;
        System.out.println("Array Length : "+ arrLength);
        printArray(arr);
    } 
}
