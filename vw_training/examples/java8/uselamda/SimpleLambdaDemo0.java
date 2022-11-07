package uselamda;

public class SimpleLambdaDemo0 {
	
	interface bounceable {
		void bounce(String entity,int f);
	}
	
	public static void main(String[] args)
	{
		
		bounceable b = (e,f) ->  System.out.println(e +" bounces with bounce factor "+f);
		           
		b.bounce("Tyre",5);
		
		b = (e,f)-> { f= f*5; 
		              System.out.println(e +" bounces with bounnce factor "+f);
		            };
			
	    b.bounce("Ball",5);
		           

	}
	
	
	

}
