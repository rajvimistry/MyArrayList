package myArrayList.driver;

import myArrayList.MyArrayList;
import test.MyArrayListTest;
import util.Results;
import java.lang.NumberFormatException;


public class Driver
{

	public static void main(String[] args) 
	{

		if(args[0] == null || args[1].equals("${arg1}"))
		{
			System.out.println("Enter input/output File");
		}
		else
		{

			//Object of MyArrayList, MyArrayListTest and Result
			MyArrayList myarray = new MyArrayList();
			MyArrayListTest tests = new MyArrayListTest(args[0]);
			Results result = new Results();

			tests.testMe(myarray,result);
			result.writeToStdout();
			result.writeToFile(args[1]);
		}
	}	
}
