package main.util;

import java.util.Arrays;

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
	 * @param first the element index that will be swapped.
	 * @param second the other element index that will be swapped.
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
		
	/**
	 * Verifies if an array is valid to be sorted. To be considered valid, an array must have a size
	 * bigger than one (because a unique element array is already sorted), not null, with its left
	 * index being at least zero and smaller than the right index.
	 * 
	 * @param <T> the array type;
	 * @param array the array to be verified
	 * @param leftIndex the leftmost index of the array.
	 * @param rightIndex the rightmost index of the array.
	 * @return a boolean {@code true} in case of the array being valid or {@code false} otherwise.
	 */
	public static <T extends Comparable<T>> boolean isValid(T[] array, int leftIndex, int rightIndex)
	{
		return (array != null && array.length > 1 && leftIndex >= 0 && rightIndex > 0 && leftIndex < rightIndex);
	}

	/**
	 * Creates a copy of an array.
	 * 
	 * @param <T> the original array type.
	 * @param array the array to be copied.
	 * @return a full copy of the original array.
	 */
	public static <T extends Comparable<T>> T[] arrayCopy(T[] array)
	{
		return Arrays.copyOf(array, array.length);
	}
}
