package p2_clase5_quicksort;

/**
 *
 * @author StormTK
 */
public class P2_Clase5_QuickSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        quicksort(intArray, 0, intArray.length);
        for (int c = 0; c < intArray.length; c++) {
            System.out.println(intArray[c]);
        }
    }

    public static void quicksort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(input, start, end);
        quicksort(input, start, pivotIndex);
        quicksort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}
