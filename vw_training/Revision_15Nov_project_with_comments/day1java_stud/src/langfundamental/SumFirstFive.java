package langfundamental;

import java.util.Scanner;

public class SumFirstFive {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int seed = sc.nextInt();
		int sum = sumFirstFive(seed);
		System.out.println("final sum:="+sum);
	
		sc.close();
		
		}
	
	
	
	static int sumFirstFive(int seed)
	{
	
		int sum =0;
		int ct=0;
		int i=seed; //10
		
		while(ct<5)
		{
			
		  System.out.println("seed="+seed);	
		  sum +=seed; //10
		  System.out.println("sum="+sum);	
		  seed++;  
		  
		  ct++;
		}
		
		
		
	
		
		return sum;
	}

	  

}
