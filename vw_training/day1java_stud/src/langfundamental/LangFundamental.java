package langfundamental;

public class LangFundamental {
	
	
	public static void main(String[] args)
	{
		/*
		int a =5; //int-literal
		
		
			
		float f = 1.2f; //float-literal
		
		float f1 = (float)12.3;
		
		double d = 1.2;
	//	int b = (int)d;
		

		Double db = d;  //  Double db = new Double(d); //auto-boxing
		
		int num = db.intValue();
		
		byte b = db.byteValue();
		
		String v = db.toString();

	
		
		
		double dx = a;
		
		
		boolean b1 = true;
		b1=false;
		
	//	int nox = (int)b;
		
		String n ="A";
	//	char ch1 = (char)n;
				
		
		char ch ='B';
		
		int no = (int)ch;
		
	
		
		System.out.println((int)ch);
		*/
		
	
				int no=5;
				int no1=6;

				boolean result = no==no1;
				
				System.out.println(result);
				
				Employee e = new Employee(11);
				
				Employee e1 = new Employee(11);
				
				Employee e2 = e;
				
				System.out.println("check equality of two emp objects, e and e1:"+(e==e1));
				System.out.println("check equality of two emp objects, e and e2:"+(e==e2));
				
				
				int nox = 2 > 2 ? 1 : 2;
				System.out.println(nox);
				
				
				
				
				
				
		
	}

}
