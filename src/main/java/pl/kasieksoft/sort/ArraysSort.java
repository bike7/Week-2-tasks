package pl.kasieksoft.sort;

import java.util.Arrays;

public class ArraysSort implements SortingMethod {

    @Override
    public int[] sort(int[] array) {
        int[] copy = array.clone();
        Arrays.sort(copy);
        return copy;
    }
}
