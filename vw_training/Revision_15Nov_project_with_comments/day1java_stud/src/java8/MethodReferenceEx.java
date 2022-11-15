package java8;

import java.util.function.BiFunction;

public class MethodReferenceEx<T> {

	public static void main(String[] args) {
		   
        MethodReferenceEx<String> myApp = new MethodReferenceEx<String>();
        
        MethodReferenceEx.func("Namrata","Marathe",(a,b)->a.concat(b));
        
        
        // Calling the method func with a lambda expression
        System.out.println( MethodReferenceEx.
            func("Hello ", "World!", (a, b) -> a + b));
        
        // Reference to a static method
        System.out.println( MethodReferenceEx.
            func("Hello ", "World!",  MethodReferenceEx::appendStrings));

        // Reference to an instance method of a particular object        
        System.out.println( MethodReferenceEx.
            func("Hello ", "World!", myApp::appendStrings2));
        
        // Reference to an instance method of an arbitrary object of a
        // particular type
        System.out.println( MethodReferenceEx.
            func("Hello ", "World!", String::concat));

	}
	
	
	  public static String appendStrings(String a, String b) {
	        return a + b;
	    }
	    
	    public String appendStrings2(String a, String b) {
	        return a + b;
	    }
	    
	    
	    
	    static <T> T func(T a,T b, BiFunction<T,T,T> ref)
	    {
	       return ref.apply(a, b);
	    }

}
