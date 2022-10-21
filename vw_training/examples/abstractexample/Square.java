package abstractexample;

public class Square extends Shape {

	
	public Square(int side)
	{
		super(side);
	}
	
   public int calcArea()
   {
	  return this.getSide1() * this.getSide1();
   }
	
	
	public int calcPerimeter()
	{
		return this.getSide1() * 4;
	}
}
