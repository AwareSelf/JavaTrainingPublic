package exceptionex;

//import java.io.FileReader;
//import java.io.IOException;

import java.io.*;

public class CheckedExceptionEx1 {

	public static void main(String[] args) {
	
		System.out.println("start of program main..");
		 func();
		 
		 System.out.println("end of program reached..");

	}
	
	
	static void func()
	{
		 
		 System.out.println("inside function func..");
		 
		 
	//try - with - resource	 
	 try(FileReader fr = new FileReader("src/exceptionex/Abc.java");  )
	  {
		 	
		char ch = (char) fr.read();
		
		System.out.println("first char inside file Abc.java :-"+ch);
		
		return;
	  }
	 catch(FileNotFoundException e)
	 {
		 System.out.println("File not found at given location - abc.java, Exception occured:"+e.getMessage()); 
		 return;
	 }
	 catch(IOException e)
	 {
		 System.out.println("IOException occured: some problem with file read operation or file closing"+e.getMessage());
		 return;
	 }
	 catch(Exception e)
	 {
		// System.out.println("IOException occured:"+e.getMessage());
		 
		 e.printStackTrace();
	 }
	 
	
	 System.out.println("remaining lines of function func continues..");
	}

}
