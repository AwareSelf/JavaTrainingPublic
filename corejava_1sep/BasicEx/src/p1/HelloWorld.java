package p1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Everyone!");
		
		int no1=10,no2,sum;
		
		no2=20;
		
		sum = no1+no2;
		System.out.println(sum);
		
		Scanner s = new Scanner(System.in);
		
		/*
		String s1 = s.next();
		
		System.out.println(s1);
		*/
		
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
