package day3;

public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s ;
//		s = new Shape();
		s = new Square(10);
		double a = s.calcArea();
		double pm = s.calcPerimeter();
		
		System.out.println("Area of square with side "+ s.getSide1() +" is ="+a);
		System.out.println("Perimeter of square with side "+ s.getSide1() +" is ="+pm);
		
		//passing Square to a method and calling calculate Area and Perimeter on it
		meth(s);
		meth(new Square(20));
		
		meth(new Rectangle(10,20));
		
		
		Shape[] shapearr = new Shape[3];
		
		shapearr[0] = new Square(4);
		shapearr[1] = new Rectangle(4,6);
		meth(shapearr);
	}
	
	public static void meth(Shape s)
	{
		System.out.println("isnide function meth...");
		double a = s.calcArea();
		double pm = s.calcPerimeter();
		
		System.out.println("Area ="+a);
		System.out.println("Perimeter ="+pm);

	}
	
	public static void meth(Shape[] arr)
	{
		for(Shape s:arr)
		{
			if(s!=null)
			{
			double a = s.calcArea();
			double pm = s.calcPerimeter();
			
			System.out.println("Area = "+a);
			System.out.println("Perimeter ="+pm);
			}
		}
	}

}
