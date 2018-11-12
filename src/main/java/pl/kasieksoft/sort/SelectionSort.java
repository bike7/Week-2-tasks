package pl.kasieksoft.sort;

public class SelectionSort implements SortingMethod {

    public static void main(String[] args) {
        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] arr2 = new SelectionSort().sort(arr1);
        for (int i : arr2) {
            System.out.println(i);
        }
    }

    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;

            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        return array;
    }
}
