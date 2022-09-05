package day3;

public class FinalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int a;
		
		a=5;
	//	a++;   //once a 
		
		
		final A ob = new A(6);
	//	ob.o = new B();
	//	ob.no=8; //object is not final
		
	//	ob = new A(10); //reference is final
		
		
		

	}

}

class B
{
	
}


class A extends AnoClass
{
	final B o;
	final int no;
	
	A(int no)
	{
		this.no=no;
		this.o = new B();
		
	}
/*
	public void func()
	{
		
	}
	*/
	
}


