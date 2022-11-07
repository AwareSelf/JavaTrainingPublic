package functionalinterface;

import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class ConsumerEx {
	
	public static void main(String[] args)
	{
		Consumer<String> c = (s) -> System.out.println(s.toUpperCase());
		c.accept("Functional Interface");
		
		BiConsumer<String,String> bic = 
	    (s,m) -> System.out.println(s.toUpperCase()+" & "+m.toUpperCase());
		
	    bic.accept("Sun","Moon");
	}
}


