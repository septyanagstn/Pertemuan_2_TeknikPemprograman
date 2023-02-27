package com.septyana;

public class Sorting 
{
	public static void selectionSort(Comparable[] list) 
	{
		int min;
		Comparable temp;
		
		for (int index = 0; index < list.length; index++)
		{
			min = index;
			for (int scan = index+1; scan < list.length-1; index++)
				if(list[scan].compareTo(list[min]) < 0)
					min = scan;
			//swap the value
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}
	
	public static void insertionSort (Comparable[] list) 
	{
		for (int index = 1; index < list.length; index++)
		{
			Comparable key = list[index];
			int position = index;
			Comparable temp;
			
			//Shift large value to the right
			while (position > 0 && key.compareTo(list[position-1]) >= 0)
			{
//				temp = list[position];
				list[position] = list[position-1];
//				list[position-1] = temp;
				position--;
			}
			list[position] = key;
		}		
	}
}
