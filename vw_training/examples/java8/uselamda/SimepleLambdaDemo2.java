package uselamda;
import java.util.ArrayList;
import java.util.function.Consumer;

//Use Java's Consumer interface to store a lambda expression in a variable:

public class SimepleLambdaDemo2 {
	
	  public static void main(String[] args) {
	    ArrayList<Integer> numLst = new ArrayList<Integer>();
	   
	    numLst.add(5);
	    numLst.add(9);
	    numLst.add(8);
	    numLst.add(1);
	    
	    Consumer<Integer> method = (n) -> { System.out.println(n); };
	   
	    numLst.forEach( method );
	  }
	



}
