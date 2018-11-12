package pl.kasieksoft.sort;

public class BubbleSort implements SortingMethod {

    public static void main(String[] args) {
        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] arr2 = new BubbleSort().sort(arr1);
        for (int i : arr2) {
            System.out.println(i);
        }
    }

    @Override
    public int[] sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
        return array;
    }
}
