public class Main {
    public static void main(String[] args)
    {
        int[] array = {2, 3, 4, 3, 1, 3};
        SelectionSort.selectionSort(array);
        int[] arr2 = {2, 3, 4, 3, 1, 3};
        InsertionSort.insertionSort(arr2);
       /* for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }*/

        /*for(int i = 0; i < arr2.length; i++)
        {
            System.out.println(arr2[i]);
        }*/
        int[] arr3 = {2, 3, 4, 3, 1, 3};
        QuickSort.quickSort(arr3, 0, 5);
        for(int i = 0; i < arr3.length; i++)
        {
            System.out.println(arr3[i]);
        }

    }


}
