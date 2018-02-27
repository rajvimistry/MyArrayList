package myArrayList;

import java.util.Arrays;

public class MyArrayList {

	private int[] arr = new int[50];

	public MyArrayList()
	{
		for(int i=0;i<arr.length;i++)
		{
			 arr[i] = 50000;
		}
	}
	
	//insertsorted method
	public void insertSorted(int newValue)
	{
		//check the range of a value
		if(newValue >= 0 && newValue < 10000)
		{
			boolean isFull = true;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i] == 50000)
				{arr[i] = newValue;isFull=false;break;}
			}
		
			//to resize the array
			if(isFull == true)
			{
				int[] arr1 = new int[arr.length+((arr.length*50)/100)];
				for(int i=0, j=0;i<arr.length;i++,j++)
				{
						arr1[i] = arr[j];
				}
				arr1[arr.length] = newValue;

				for(int i=arr.length+1;i<arr1.length;i++)
				{
					arr1[i] = 50000;
				}
				arr = arr1;
			}
			Arrays.sort(arr);
		}
	}
	
	//remove value function
	public void removeValue(int value)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == value)
			{
				arr[i] = 50000;
			}
		}
		Arrays.sort(arr);
	}
	
	//indexof function
	public int indexOf(int value)
	{
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i] == value)
			{
				return i;
			}
		}
		return -1;
	}
	
	//size method
	public int size()
	{
		int count = 0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i] != 50000)
			{count++;}
			else if(arr[i] == 50000)
			{break;}
		}
		return count;
	}
	
	//sum method
	public int sum()
	{
		int sum = 0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i] != 50000)
			{sum = sum + arr[i];}
			else if(arr[i] == 50000)
			{break;}
		}
		return sum;
	}
	
	public void print()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 50000)
			{
				System.out.println(arr[i]);
			}
			else if(arr[i] == 50000)
			{
				break;
			}
		}
	}

	@Override
	public String toString()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 50000)
			{
				System.out.println(arr[i]);
			}
			else if(arr[i] == 50000)
			{
				break;
			}
		}
		return null;
	}

}
