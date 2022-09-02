package p1;

public class SwitchEx {

	public static void main(String[] args) {
		
		
		
		int no = 2;
		
		switch(no)
		{
		case 1:
			System.out.println("inside case 1..no="+no);
		//	no++;
			
		case 2:
			System.out.println("inside case 2..no="+no);
		//	no++;
		case 3:
			System.out.println("inside case 3..no="+no);
		//	no++;
			
		default:
			System.out.println("default case..none of the cases matched"+no);
		}
		
		int no1=20,no2=10;
        String opp = "add";
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
			
		default:
			System.out.println("default case..none of the cases matched");
		}

	}

}
