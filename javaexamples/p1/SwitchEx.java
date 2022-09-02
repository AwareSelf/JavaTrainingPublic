package p1;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		
		/*
		int no = 1;
		
		switch(no)
		{
		case 1:
			System.out.println("inside case 1..no="+no);
		//	no++;
			
		case 2:
			System.out.println("inside case 2..no="+no);
		//	no++;
			break;
		case 3:
			System.out.println("inside case 3..no="+no);
		//	no++;
			
		default:
			System.out.println("default case..none of the cases matched"+no);
		}

		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no1=");
		int no1 = sc.nextInt();
		
		System.out.println("enter no1=");
		int no2 = sc.nextInt();
		
		System.out.println("enter opearion add/sub/mul/div=");
	    String opp = sc.next();
	    
		int result = 0;
		
		switch(opp.toUpperCase())
		{
		case "ADD":
			result = no1 + no2;
			System.out.println("inside case 1..result="+result);
		    break;
			
		case "SUB":
			result = no1 - no2;
			System.out.println("inside case 2..result="+result);
		    break;
		    
		case "MUL":
			result = no1 * no2;
			System.out.println("inside case 3..result="+result);
		    break;
		    
		case "DIV":
			result = no1 / no2;
			System.out.println("inside case 3..result="+result);
		    break;
			
		default:
			System.out.println("default case..none of the cases matched");
			
			
		}
		
		sc.close();
		
				*/
		
		/***************************************************/
		
        Scanner sc1 = new Scanner(System.in);
		
		System.out.println("enter no1=");
		int a1 = sc1.nextInt();
		
		System.out.println("enter no1=");
		int a2 = sc1.nextInt();
		
		System.out.println("enter opearion +/-/*//=");
	    String op = sc1.next();
	    
	    func(a1,a2,op);
	    
	    sc1.close();
       
	}
	
	
	static void func(int no1,int no2,String op)
	{
		
      int result = 0;
		
		switch(op.charAt(0))
		{
		case '+':
			result = no1 + no2;
			System.out.println("inside case 1..result="+result);
		    break;
			
		case '-':
			result = no1 - no2;
			System.out.println("inside case 2..result="+result);
		    break;
		    
		case '*':
			result = no1 * no2;
			System.out.println("inside case 3..result="+result);
		    break;
		    
		case '/':
			result = no1 / no2;
			System.out.println("inside case 3..result="+result);
		    break;
			
		default:
			System.out.println("default case..none of the cases matched");
			
			
		}
		
	}

}
