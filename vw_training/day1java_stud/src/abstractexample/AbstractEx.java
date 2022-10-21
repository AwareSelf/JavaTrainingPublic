package abstractexample;

public class AbstractEx {

	public static void main(String[] args) {
	
		Shape s;
		
		//s = new Shape(10);
		
	    s = new Square(5);
	    
	    System.out.println(s.calcArea());
	    System.out.println(s.calcPerimeter());
	    

	}

}
