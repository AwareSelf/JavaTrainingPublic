package protecteduse2;

import protecteduse1.A;

public class A1 extends A {
	
	//@Override
	public void meth1A1()
	{
		meth(); //inherited protected method accessible in derived class in another package via inheritance
		
	//	meth1(); // default method is not accessible outside package
		
		
		meth3();
		
	//	super.meth1A1();
	}

}





