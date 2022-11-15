package innerclasses;

//import innerclasses.OuterClass.A;

public class StaticInnerClassEx
{
	public static void main(String[] args) {
		
		
	//	OuterClass1 out = new OuterClass1();
		
    //		out.membermeth();
		
		
		OuterClass1.A.meth1();
		
		
		//static inner class doesn't need outer class object instance to exist for creating it's own instance
		 OuterClass1.A inn = new OuterClass1.A();
		   inn.meth();
	   
	    

	}
}

class OuterClass1 {

	
	private int no;
	
	private static int ct=0;
	
	OuterClass1()
	{
		this.no=7;
	}
	
	
	
	
	void membermeth()
	{
		System.out.println("no="+no);
	}
	
	
	//inner class
	static class A
	{
		private int inno;
		
		A()
		{
			inno=8;
		}
		
		void meth()
		{
			//private data directly accessible
		//	System.out.println("no="+no);
			
			System.out.println(ct);
			System.out.println("inno="+inno);
		}
		
		
		static void meth1()
		{
			System.out.println("static method of inner class"+ct);
		}
		
		
	}


}




