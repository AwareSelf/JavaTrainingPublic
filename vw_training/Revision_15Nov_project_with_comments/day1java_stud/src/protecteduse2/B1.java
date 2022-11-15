package protecteduse2;

import protecteduse1.A;

public class B1 {
	
	
	void b1meth()
	{
		A ob = new A();
	//	ob.meth();  protected method is accessible only in derived class in another package via inheritance
		            //but not via object reference or without inheritance (in another package)
		
		ob.meth3();
	}

}
