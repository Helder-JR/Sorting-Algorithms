package main.sorting;

public abstract class AbstractSorting<T extends Comparable<T>> implements Sorting<T>
{
    @Override
    public void sort(T[] array)
    {
        sort(array, 0, array.length - 1);
    }

    /**
     * Abstract method to be implemented using an algorithm to sort an array, on the
     * range from the left index to the right index. 
     * 
     * @param array the array to be sorted.
     * @param leftIndex the leftmost index of the array to be sorted.
     * @param rightIndex the rightmost index of the array to be sorted.
     */
    public abstract void sort(T[] array, int leftIndex, int rightIndex);
}
