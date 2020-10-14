package main.util;

/**
 * Class that includes some common use methods, used in the sorting algorithms.
 */
public abstract class Util
{
    /**
     * Swaps two elements in an array.
     * 
     * @param <T> the array type.
     * @param array the array that contains the elements to be swapped.
     * @param first the element that will be swapped.
     * @param second the other element that will be swapped.
     */
    public static <T> void swap(T[] array, int first, int second)
    {
        T aux = array[first];
        array[first] = array[second];
        array[second] = aux;
    }

    /**
     * Finds the index of the biggest element in an array.
     * 
     * @param <T> the array type.
     * @param array the array in which the biggest element will be found.
     * @return the index of the biggest element.
     */
    public static <T extends Comparable<T>> int maximum(T[] array)
    {
        int maximum = 0;

        for (int i = 1; i < array.length; i++)
            if (array[i].compareTo(array[maximum]) > 0)
                maximum = i;
        
        return maximum;
    }

    /**
     * Finds the index of the smallest element in an array.
     * 
     * @param <T> the array type.
     * @param array the array in which the smallest element will be found.
     * @return the index of the smallest element.
     */
    public static <T extends Comparable<T>> int minimum(T[] array)
    {
        int minimum = 0;

        for (int i = 1; i < array.length; i++)
            if (array[i].compareTo(array[minimum]) < 0)
                minimum = i;
        
        return minimum;
    }

    public <T extends Comparable<T>> boolean isValid(T[] array, int leftIndex, int rightIndex)
    {
        return (array.length > 0 && leftIndex >= 0 && leftIndex < rightIndex);  
    }
}
