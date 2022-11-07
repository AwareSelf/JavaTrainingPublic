package functionalinterface;

import java.util.function.Function;

public class FunctionEx {
	public static void main(String[] args) {
		      
        try
        {
           // Function which takes in a number and returns half of it
           Function<Integer, Double> half = a -> a / 2.0; 
       
           // Now treble the output of half function
           //half = half.andThen(a -> 3 * a);
           //half = half.andThen(null);
           
           // However treble the value given to half function
           // half =  half.compose(a->3*a);
                         
           // Applying the function to get the result
           System.out.println(half.apply(6));
        }
        catch (Exception e) {
             System.out.println("Exception in executing function: "+ e);
        }
        
        //System.out.println("continue..");
   	}
}
