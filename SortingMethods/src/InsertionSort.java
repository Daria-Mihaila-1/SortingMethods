public class InsertionSort {
    public static void insertionSort(int[] arr){
        int helper, j;
        for(int i = 0; i < arr.length; i++){
            helper = arr[i];
            j = i;
            while (j > 0 && arr[j-1] > helper){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = helper;
        }
    }
}
