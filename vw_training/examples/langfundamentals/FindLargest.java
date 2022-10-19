package langfundamental;
import java.util.Scanner;

public class FindLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no1=-1,no2=-1,no3=-1;
				
		Scanner sc = new Scanner(System.in);
		
	    if(sc.hasNextInt())
		 no1 = sc.nextInt();
	    
		if(sc.hasNextInt())
		   no2 = sc.nextInt();
	    
		if(sc.hasNextInt())
		  no3 = sc.nextInt();
	    
		
	if(no1!=-1 && no2!=-1 && no3!=-1)
	 {
		if((no1 > no2) && (no1 > no3))
		{
			
			int x=6;
			System.out.println("no1:"+no1+" is greates among three nos");
		}
		else if(no2>no3 && no2>no1) 
		{
			//x++;
			System.out.println("no2:"+no2+" is greatest among three nos");
		}
		else
		{
			System.out.println("no3:"+no3+" is greates among three nos");
		}
	 }
	else
	{
		System.out.println("one of the three inputs is not entered properly");
	}
		/*
		
		if(no1> no2)   //no2 is out of the race
		{
			
			if(no1>no3) //false - no1 is out of the race
			{
				System.out.println("no1:"+no1+" is greates among three nos");
			}
			else if()
			{
				
			}
			
			
		}
		else
		
		*/
		
		sc.close();

	}

}
