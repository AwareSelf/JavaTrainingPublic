package uselamda;

interface Bounceable2
{
	void bounce(String entity,int bouncefactor);
}
public class LamdaExpEx {

	public static void main(String[] args) {
		
    Bounceable2 b = (e,bf) -> System.out.println(e +" bounces with bounce factor "+bf);
    
    
    
                b.bounce("Ball",10);
                meth((e,bf) -> System.out.println(e +" bounces with bounce factor "+bf),
                	  "Ball",
                	  10);
                
      b = (e,bf)->{
    	            bf = bf*2;
    	            System.out.println(e +" bounces with bounce factor "+bf);
                   };
      b.bounce("Tyre",1);
      meth((e,bf)->{
          bf = bf*2;
          System.out.println(e +" bounces with bounce factor "+bf);
         },"Tyre",10);
      
      
      
      
    
	}
	
	static void meth(Bounceable2 b,String entity,int bfactor)
	{
		System.out.println("inside method meth..");
		b.bounce(entity, bfactor);
	}

}
