package innerclasses;


public class InnerClassEx
{
	int n;
	static int ct=0;
	
	public static void main(String[] args) {
		
		InnerClassEx.methx();
		
		
		InnerClassEx obj = new InnerClassEx();
		    obj.n=9;
	//	System.out.println(n);
		
		OuterClass out = new OuterClass();
		
		out.membermeth();
		
	    OuterClass.A inn = out.new A();
	    inn.meth();
	    
	  //you need instance of Outer class for creating object of inner class
	  // as it is non static inner class  
	//    OuterClass.A x = new OuterClass.A(); 
		
	    
	    
	   
	    

	}
	
	
	
	public static  void methx()
	{
		System.out.println(ct);
	//	System.out.println(n);
	}
}

class OuterClass {

	
	private int no;
	
	OuterClass()
	{
		this.no=7;
	}
	
	
	
	
	void membermeth()
	{
		System.out.println("no="+no);
	}
	
	
	//inner class
	class A
	{
		private int inno;
		
		A()
		{
			inno=8;
		}
		void meth()
		{
			//private data directly accessible
			System.out.println("no="+no);
			System.out.println("inno="+inno);
		}
		
		/*
		static void methstat()
		{
			System.out.println("static method inside normal inner class");
		}
		*/
		
		
	}


}

class B
{
	
	void meth()
	{
		InnerClassEx ob = new InnerClassEx();
	//	System.out.println("no="+ob.no);
	}
	
}



