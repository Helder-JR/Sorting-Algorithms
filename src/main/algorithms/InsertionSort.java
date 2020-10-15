package main.algorithms;

import main.sorting.AbstractSorting;
import main.util.Util;

public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T>
{

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex)
    {
        if (Util.isValid(array, leftIndex, rightIndex))
        {
            for (int i = leftIndex + 1; i <= rightIndex; i++)
            {
                int j = i;

                while (j > 0 && array[j].compareTo(array[j - 1]) < 0)
                {
                    Util.swap(array, j, j - 1);
                    j--;
                }
            }
        }
    }
}
