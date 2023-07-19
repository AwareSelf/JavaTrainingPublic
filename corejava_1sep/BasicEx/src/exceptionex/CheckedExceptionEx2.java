package exceptionex;

//import java.io.FileReader;
//import java.io.IOException;

import java.io.*;

public class CheckedExceptionEx2 {

	public static void main(String[] args)  {
	
		System.out.println("start of program main..");
		
		try
		{
		 func();
		 System.out.println("after func before catch");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		} 
		 System.out.println("end of program reached..");

	}
	
	
	static void func() throws IOException
	{
		 
		 System.out.println("inside function func..");
		 
		 
		 FileReader fr=null;
		 
		  fr = new FileReader("src/exceptionex/Abc.java");
		 	
		char ch = (char) fr.read();
		
		System.out.println("first char inside file Abc.java :-"+ch);
	
	
	 System.out.println("remaining lines of function func continues..");
	}

}
