package test.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.util.Util;

public class UtilTest
{
	Integer[] array;

	@Before
	public void setUp()
	{
		this.array = new Integer[] { 2, 4, 6, 8, 0, 9, 7, 5, 3, 1 };
	}

	@Test
	public void testMaximum()
	{
		Assert.assertEquals(5, Util.maximum(array));
	}

	@Test
	public void testMinimum()
	{
		Assert.assertEquals(4, Util.minimum(array));
	}

	@Test
	public void testIsValidArray()
	{
		Assert.assertTrue(Util.isValid(array, 0, array.length - 1));
	}

	@Test
	public void testArrayCopy()
	{
		Integer[] copy = Util.arrayCopy(array);

		Assert.assertArrayEquals(array, copy);
	}
}
