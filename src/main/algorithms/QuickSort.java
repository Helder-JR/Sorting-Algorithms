package main.algorithms;

import main.sorting.AbstractSorting;
import static main.util.Util.*;

public class QuickSort<T extends Comparable<T>> extends AbstractSorting<T>
{
	private int getPivot(T[] array, int leftIndex, int rightIndex)
	{
		int middleIndex = (leftIndex + rightIndex) >> 1;

		if (array[leftIndex].compareTo(array[middleIndex]) > 0)
			swap(array, leftIndex, rightIndex);

		if (array[leftIndex].compareTo(array[rightIndex]) > 0)
			swap(array, middleIndex, leftIndex);
			
		if (array[middleIndex].compareTo(array[rightIndex]) > 0)
			swap(array, middleIndex, rightIndex);

		swap(array, leftIndex, middleIndex);

		return leftIndex;
	}

	private int partition(T[] array, int leftIndex, int rightIndex)
	{
		int pivot = getPivot(array, leftIndex, rightIndex);
		int k = leftIndex;

		for (int i = leftIndex + 1; i <= rightIndex; i++)
		{
			if (array[i].compareTo(array[pivot]) <= 0)
			{
				k++;
				swap(array, k, i);
			}
		}

		swap(array, pivot, k);

		return k;
	}

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex)
	{
		if (isValid(array, leftIndex, rightIndex))
		{
			int pivotIndex = partition(array, leftIndex, rightIndex);

			sort(array, leftIndex, pivotIndex - 1);
			sort(array, pivotIndex + 1, rightIndex);
		}
	}
}
