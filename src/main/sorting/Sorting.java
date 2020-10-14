package main.sorting;

/**
 * Interface responsible to keep the Sorting type and the sort
 * method to be implemented by the sorting algorithms.
 */
public interface Sorting<T extends Comparable<T>>
{
    /**
     * Method to be implemented using an algorithm to sort an array.
     * 
     * @param array the array to be sorted.
     */
    public void sort(T[] array);
}
