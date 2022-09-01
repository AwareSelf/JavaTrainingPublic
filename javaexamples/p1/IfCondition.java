package p1;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no1,no2,sum;
		
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter no1:");
		    
		no1 = s.nextInt();
		
		System.out.println("enter no2:");
		no2 = s.nextInt();
		
		sum = no1+ no2;
		System.out.println(sum);
		
		s.close();
		
		if(no1>no2)
		{
			System.out.println("no1 =  "+no1+"  is the greater no.");
		}
		else if(no1==no2)
		{
			System.out.println("no1="+no1+", no2 =  "+no2+"   are equal nos.");
		}
		else
		{
			System.out.println("no2 =  "+no2+"  is the greater no.");
		}
			

	}

}
