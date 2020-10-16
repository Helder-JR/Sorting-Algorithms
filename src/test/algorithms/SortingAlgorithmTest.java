package test.algorithms;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.sorting.Sorting;
import main.algorithms.*;

public class SortingAlgorithmTest
{
	private Integer[] emptyArray;
	private Integer[] equalValuesArray;
	private Integer[] evenSizeArray;
	private Integer[] negativeArray;
	private Integer[] oddSizeArray;
	private Integer[] repeatedValuesArray;
	private Integer[] reversedArray;
	private Integer[] uniqueElementArray;

	Sorting<Integer> implementation;

	/**
	 * Configuration made to change the array values to whatever values is desired.
	 */
	@Before
	public void setUp()
	{
		this.emptyArray = new Integer[] {};
		this.equalValuesArray = new Integer[] { 6, 6, 6, 6, 6, 6 };
		this.evenSizeArray = new Integer[] { 30, 28, 7, 29, 11, 26, 4, 22, 23, 31 };
		this.negativeArray = new Integer[] { -65, -12, 28, -7, 96, 55, -1, 43, 10, 0 };
		this.oddSizeArray = new Integer[] { 6, 41, 32, 7, 26, 4, 37, 49, 11, 18, 36 };
		this.repeatedValuesArray = new Integer[] { 4, 9, 3, 4, 0, 5, 1, 4 };
		this.reversedArray = new Integer[] { 97, 72, 66, 50, 43, 31, 25, 11, 8 };
		this.uniqueElementArray = new Integer[] {7};

		this.getImplementation();
	}

	/**
	 * Choise the algorithm to test the sorting changing null to the chosen implementation.
	 */
	private void getImplementation()
	{
		this.implementation = null;
	}

	/**
	 * Generic test to assert the chosen sorting algorithm implementation is working well.
	 * 
	 * @param array the array to be tested.
	 */
	public void genericTest(Integer[] array)
	{
		Integer[] copy = {};
		
		if (array.length > 0) copy = Arrays.copyOf(array, array.length);
		
		this.implementation.sort(array);
		
		Arrays.sort(copy);
		
		Assert.assertArrayEquals(copy, array);
	}

	@Test
	public void teste01()
	{
		genericTest(this.reversedArray);
	}

	@Test
	public void teste02()
	{
		genericTest(this.oddSizeArray);
	}

	@Test
	public void teste03()
	{
		genericTest(this.evenSizeArray);
	}

	@Test
	public void teste04()
	{
		genericTest(this.emptyArray);
	}

	@Test
	public void teste05()
	{
		genericTest(this.equalValuesArray);
	}

	@Test
	public void teste06()
	{
		genericTest(this.repeatedValuesArray);
	}

	@Test
	public void teste07()
	{
		genericTest(this.uniqueElementArray);
	}

	@Test
	public void teste08()
	{
		genericTest(this.negativeArray);
	}
}
