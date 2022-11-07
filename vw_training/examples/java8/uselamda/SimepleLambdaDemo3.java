package uselamda;
import java.util.ArrayList;
import java.util.function.Consumer;

//Use Java's Consumer interface to store a lambda expression in a variable:

public class SimepleLambdaDemo3 {
	
	  interface StrFunc {
		  String run(String str);
		}
	
	  public static void main(String[] args) {
			
			    StrFunc var = (s) -> s + "!";
			  
			    String r = var.run("Hi");
			   
			    System.out.println(r);
			    
			    
			    printFormatted("Hello", var);
			    
			  }
	  
      public static void printFormatted(String str, StrFunc f) {
			    String result = f.run(str);
			    System.out.println(result);
			  }
			
	  }
	




