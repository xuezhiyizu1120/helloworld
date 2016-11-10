package test1;

import java.lang.reflect.Array;

public class ArrayTest
{
	public static void main(String[] args)
	{
		int[] array = (int[])Array.newInstance(int.class, 10);
	
		Array.set(array, 5, 5);
		
		for(int number : array)
		{
			System.out.println(number);
		}
		
	}
}
