public class QuickSort {

    public static int partition(int l, int h, int[] arr) {
        int pivot = arr[l];
        int i = l;
        int j = h;
        while (i < j) {
            do {
                i++;
                }
            while(i < arr.length && arr[i] <= pivot);

            do{
                j--;
                }
            while (arr[j] > pivot);

            if (i < j) {
                int aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
            }
    }
        int aux = arr[l];
        arr[l] = arr[j];
        arr[j] = aux;
        return j;
    }
    public static void quickSort(int[] arr, int l, int h){
        if (l < h){
            int j = partition(l, h, arr);
            quickSort(arr, l, j);
            quickSort(arr, j+1 , h);
        }
    }

    public static void groupByNumber(int leftbound, int rightbound ){}

    public static void swap(int a, int b){
        int aux = a;
        a = b;
        b = aux;
    }
}
