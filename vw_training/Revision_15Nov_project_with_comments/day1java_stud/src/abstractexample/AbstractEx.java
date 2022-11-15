package abstractexample;

public class AbstractEx {

	public static void main(String[] args) {
	
		Shape s;
		
		//s = new Shape(10);
		
	    s = new Square(5);
	    meth(s);
	 //   System.out.println(s.calcArea());
	 //   System.out.println(s.calcPerimeter());
	    
	    
	    s = new Rectangle(5,7);
	    meth(s);
	  //  System.out.println(s.calcArea());
	  //  System.out.println(s.calcPerimeter());
	    
	    
	    

	}
	
	
	
	public static void meth(Shape s)
	{
		
		 System.out.println(s.calcArea());
		 System.out.println(s.calcPerimeter());
		
		
	}

}
