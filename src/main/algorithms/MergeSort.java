package main.algorithms;

import main.sorting.AbstractSorting;
import static main.util.Util.*;

public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T>
{
	private void merge(T[] array, int leftIndex, int middleIndex, int rightIndex)
	{
		T[] aux = arrayCopy(array);

		int i = leftIndex;
		int j = middleIndex + 1;
		int k = leftIndex;

		while (i <= middleIndex && j <= rightIndex)
		{
			if (aux[i].compareTo(aux[j]) < 0) array[k] = aux[i++];
			else array[k] = aux[j++];
			k++;
		}

		while (i <= middleIndex) array[k++] = aux[i++];
		while (j <= middleIndex) array[k++] = aux[j++];
	}

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex)
	{
		if (isValid(array, leftIndex, rightIndex))
		{
			int middleIndex = (leftIndex + rightIndex) >> 1;

			sort(array, leftIndex, middleIndex);
			sort(array, middleIndex + 1, rightIndex);

			merge(array, leftIndex, middleIndex, rightIndex);
		}
	}
	
}
