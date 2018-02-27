package util;

//import util.FileProcessor;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Results implements FileDisplayInterface,StdoutDisplayInterface{

	private String[] result = new String[20];
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	public Results()
	{
		for(int i=0;i<result.length;i++)
		{
			result[i] = "null";
		}
	}

	public void storeNewResult(String s)
	{

		//adding testcase results to private array
		for(int i=0; i<result.length; i++)
		{
			if(result[i].equals("null"))
			{
				result[i] = s;break;
			}
		}
	}


	@Override
	public void writeToStdout()
	{
		for(int i=0; i<result.length; i++)
		{if(result[i]!= "null")System.out.println(result[i]);}
	}

	@Override
	public void writeToFile(String s1)
	{
		try
		{
			fw = new FileWriter(s1);
			bw = new BufferedWriter(fw);
			for(int i=0;i<result.length;i++)
			{
				if(result[i] != "null")
				{
					bw.write(result[i]);
					bw.write("\n");
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.close();
				fw.close();
			}
			catch(IOException e)
			{e.printStackTrace();}
		}
	}

	@Override
	public String toString()
	{
		return null;
	}

}
