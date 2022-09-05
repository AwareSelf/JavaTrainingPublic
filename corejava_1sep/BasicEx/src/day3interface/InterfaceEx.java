package day3interface;

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bounceable b = null;
		
		b = new Ball();
	
		// Bounceable b = new Ball();	
		
		b.setBounceFactor(5);
		b.bounce();
		
			
	    meth(b,5);
	    meth(new Ball(),7);
	    
	    b = new Tyre();
	    meth(b,5);
	    meth(new Tyre(),7); 
	    
	    
	    //create Bounceable array and pass it to meth method
	    Bounceable[]  barr = new Bounceable[3];
	    barr[0] = new Ball();
	    barr[1] = new Tyre();
	    
	    meth(barr,5);
	    

	}
	
	
	public static void meth(Bounceable b,int bf)
	{
		System.out.println("inside meth method..");
		b.setBounceFactor(bf);
		b.bounce();
	}
	
	public static void meth(Bounceable[] arr,int bf)
	{
		System.out.println("inside overloaded meth method that receives Bounceable array..");
		for(Bounceable x : arr)
		{
			if(x!=null)
			{
			x.setBounceFactor(bf);
			x.bounce();
			}
		}
		
	}

}
