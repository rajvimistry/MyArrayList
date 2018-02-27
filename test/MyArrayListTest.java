package test;

import myArrayList.MyArrayList;
import util.FileProcessor;
import util.Results;
import java.io.File;

public class MyArrayListTest {

	FileProcessor fp;

	public MyArrayListTest(String inputfile)
	{
		fp = new FileProcessor(inputfile);

	}


	//method to read data from input file	
	private void insertDataFromFile(MyArrayList myArrayList)
	{
		String s;
		while((s = fp.readLine()) != null)
		{
			try
			{
				myArrayList.insertSorted(Integer.parseInt(s));			
			}
			catch(NumberFormatException e){			
			}		
		}
	}
	public void testMe(MyArrayList myArrayList, Results results)
	{
		//Testcases
		testMe1(myArrayList,results);
		testMe2(myArrayList,results);
		testMe3(myArrayList,results);
		testMe4(myArrayList,results);
		testMe5(myArrayList,results);
		testMe6(myArrayList,results);
		testMe7(myArrayList,results);
		testMe8(myArrayList,results);
		testMe9(myArrayList,results);
		testMe10(myArrayList,results);
	}
		
	public void testMe1(MyArrayList myArrayList, Results results)
	{
		if(myArrayList.size() == 0)
		{
			if(myArrayList.sum() == 0)
			{
				results.storeNewResult("Test Case 1 Passed: Sum is zero, If array is Empty");
			}
			else
			{
				results.storeNewResult("Test Case 1 Failed: Sum is zero, If array is Empty");
			}
		}
	}

	public void testMe2(MyArrayList myArrayList, Results results)
	{

		//insert 5 values into array
		for(int i=0;i<5;i++)
		{
			myArrayList.insertSorted(i);
		}
		//Testcase
		if(myArrayList.size() == 5)
		{
			results.storeNewResult("Test Case 2 Passed: After adding 5 values, Array Size = 5");
		}
		else
		{
			results.storeNewResult("Test Case 2 Failed: After adding 5 values, Array Size != 5");
		}
	}

	public void testMe3(MyArrayList myArrayList, Results results)
	{

		//Remove Value method
		myArrayList.removeValue(4);

		//Testcase
		if(myArrayList.size() == 4 && myArrayList.indexOf(4) == -1)
		{
			results.storeNewResult("Test Case 3 Passed: Number Removed Successfully");
		}
		else
		{
			results.storeNewResult("Test Case 3 Failed: Number Doesnot Remove From Array");
		}
		myArrayList.removeValue(1);
		myArrayList.removeValue(0);
		myArrayList.removeValue(3);
		myArrayList.removeValue(2);
	}

	public void testMe4(MyArrayList myArrayList, Results results)
	{
		if(myArrayList.size() == 0 && myArrayList.sum() == 0)
		{
			results.storeNewResult("Test Case 4 Passed: If file is empty");
		}
		if(myArrayList.size() != 0 && myArrayList.sum() != 0)
		{
			results.storeNewResult("Test Case 4 Failed: File is not empty");
		}
	}

	public void testMe5(MyArrayList myArrayList, Results results)
	{

		myArrayList.insertSorted(123);
		myArrayList.insertSorted(2);
		myArrayList.insertSorted(0);
		myArrayList.insertSorted(5);
		if((myArrayList.indexOf(0) == 0) && (myArrayList.indexOf(2) == 1) && (myArrayList.indexOf(5) == 2) && (myArrayList.indexOf(123) == 3))
		{
			results.storeNewResult("Test Case 5 Passed: Array is sorted");
		}
		else
		{
			results.storeNewResult("Test Case 5 Failed: Array is not sorted");
		}
		myArrayList.removeValue(0);
		myArrayList.removeValue(123);
		myArrayList.removeValue(2);
		myArrayList.removeValue(5);
		
	}
	public void testMe6(MyArrayList myArrayList, Results results)
	{
		//Inserting 0-5 values and then checking sum
		for(int i=0;i<5;i++)
		{
			myArrayList.insertSorted(i);
		}
		if(myArrayList.sum() == 10)
		{
			results.storeNewResult("Test Case 6 Passed: After adding 0 to 4, Sum = 10");
		}
		else
		{
			results.storeNewResult("Test Case 6 Failed: After adding 0 to 4, Sum != 10");
		}
		
		myArrayList.removeValue(0);
		myArrayList.removeValue(1);
		myArrayList.removeValue(2);
		myArrayList.removeValue(3);
		myArrayList.removeValue(4);

	}
	public void testMe9(MyArrayList myArrayList, Results results)
	{
		//inserting >50 values into array
		for(int i=0; i<70;i++)
		{
			myArrayList.insertSorted(i);
		}
		if(myArrayList.size() > 50)
		{
			results.storeNewResult("Test Case 9 Passed: Array size increased, because inputfile is greater than 50");
		}
		else
		{
			int j = myArrayList.size();
			results.storeNewResult("Test Case 9 Failed: Size < 70");
		}
		
		for(int i=0; i<70;i++)
		{
			myArrayList.removeValue(i);
		}
		
	}
	public void testMe7(MyArrayList myArrayList, Results results)
	{
		//inserting descending values
		for(int i=5; i>0;i--)
		{
			myArrayList.insertSorted(i);
		}
		if((myArrayList.indexOf(1) == 0) && (myArrayList.indexOf(2) == 1) && (myArrayList.indexOf(3) == 2) && (myArrayList.indexOf(4) == 3) && (myArrayList.indexOf(5) == 4))
		{
			results.storeNewResult("Test Case 7 Passed: Descending values are Sorted");
		}
		else
		{
			results.storeNewResult("Test Case 7 Failed: Descending values are not Sorted");
		}

	}
	public void testMe8(MyArrayList myArrayList, Results results)
	{
		myArrayList.removeValue(5);
		if(myArrayList.size() == 4)
		{
			results.storeNewResult("Test Case 8 Passed: Array Size decreased, after removing a value");
		}
		else
		{
			results.storeNewResult("Test Case 8 Failed: Array Size is not decreased, after removing a value");
		}

		myArrayList.removeValue(1);
		myArrayList.removeValue(2);
		myArrayList.removeValue(3);
		myArrayList.removeValue(4);
		
	}
	public void testMe10(MyArrayList myArrayList, Results results)
	{

		//trying to add negative values in array
		for(int i=0;i>-5;i--)
		{
			myArrayList.insertSorted(i);
		}

		//Testcase
		if(myArrayList.size() == 1)
		{
			results.storeNewResult("Test Case 10 Passed: Only Positive Values are added");
		}
		else
		{
			results.storeNewResult("Test Case 10 Failed: Negative values are also in array");
		}

		for(int i=0;i>-5;i--)
		{
			myArrayList.removeValue(i);
		}

		insertDataFromFile(myArrayList);
		results.storeNewResult("Sum of the values in the file is "+myArrayList.sum());

	}

	@Override
	public String toString()
	{
		return null;
	}
}
