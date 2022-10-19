package langfundamental;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num < 1)
			System.out.println("please enter no greater than 1");
		
		boolean r = isPrime(num);
		
		if(r)
		System.out.println("no:"+num+" is prime");
		else
		System.out.println("no:"+num+" is not prime");	
	
		sc.close();
		
	
		}
	
	
	
	static boolean isPrime(int num)
	{
		if(num==2 || num==1)
			return true;
		
	    for(int i=2; i<num;i++)
	    {
	    	int r = num%i;
	    	
	    	if(r==0)
	    	{
	    		return false;
	    	}
	    	    	

	    }
	    
	    return true;
	
	}

	  

}
