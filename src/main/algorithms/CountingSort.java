package main.algorithms;

import main.sorting.AbstractSorting;
import main.util.Util;

/**
 * Class responsible for implementing the sort method from {@link AbstractSorting}
 * using the Counting Sort algorithm. This algorithm consider only integer values 
 * from 0 to k (the biggest element in the array), where repetitions are allowed.
 * 
 * @see https://pt.wikipedia.org/wiki/Counting_sort
 */
public class CountingSort extends AbstractSorting<Integer>
{
    @Override
    public void sort(Integer[] array, int leftIndex, int rightIndex)
    {
        if (Util.isValid(array, leftIndex, rightIndex))
        {
            int max = Util.maximum(array);
            Integer[] counting = new Integer[array[max] + 1];
    
            for (int i = leftIndex; i < counting.length; i++)
                counting[i] = 0;
    
            for (int i = leftIndex; i <= rightIndex; i++)
                counting[array[i]]++;
            
            for (int i = leftIndex + 1; i < counting.length; i++)
                counting[i] += counting[i - 1];
         
            Integer[] result = new Integer[array.length];
    
            for (int i = rightIndex; i >= leftIndex; i--)
            {
                result[counting[array[i]] - 1] = array[i];
                counting[array[i]]--;
            }
    
            for (int i = leftIndex; i <= rightIndex; i++)
                array[i] = result[i];
        }

    }
}
