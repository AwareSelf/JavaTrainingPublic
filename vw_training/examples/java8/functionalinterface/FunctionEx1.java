package functionalinterface;

import java.util.function.Function;

public class FunctionEx1 {
	public static void main(String[] args) {
		      
        try
        {
        	// Function which takes in a number and
            // returns it
           Function<Integer,Integer> i = Function.identity();
           // Applying the function to get the result
           System.out.println(i.apply(6));
        }
        catch (Exception e) {
             System.out.println("Exception in executing function: "+ e);
        }
        
        //System.out.println("continue..");
   	}
}
