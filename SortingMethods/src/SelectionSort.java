public class SelectionSort {

    public static void selectionSort(int[] array) {
        int index, aux, count;
        int min;
        count = 0;
        for (int j = 0; j < array.length-1 ; j++) {  // ultimul element oricum e sortat
            index = 0;
            min = array[count];
            for (int i = count; i < array.length; i++) {

                if (array[i] <= min) {
                    min = array[i];
                    index = i;
                }
            }
            swap(array[count], array[index]);

            count++;
        }
    }



    private static void swap(int x, int y){
        if (x != y){
           int aux = x;
           x = y;
           y = aux;
        }
    }
}
