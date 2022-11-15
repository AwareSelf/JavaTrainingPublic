package langfundamental;

import java.util.Scanner;

public class FunctionCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter full name:");
		String name = sc.nextLine();
		
		//call a member function
		FunctionCall ob = new FunctionCall();
		ob.greet(name);
		
		//calling a static function
		greet1(name);
		
		sc.close();
		
		System.out.println("remaining program continues");
		
		
	}
	
	
	
	public void greet(String name)
	{
		System.out.println("Hello "+name);
	}
	
	public static void greet1(String name)
	{
		System.out.println("Hello "+name);
	}

}
