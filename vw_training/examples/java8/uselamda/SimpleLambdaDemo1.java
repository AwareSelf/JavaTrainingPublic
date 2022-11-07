package uselamda;

import java.util.ArrayList;

public class SimpleLambdaDemo1 {
	
	 public static void main(String[] args) {  
		    ArrayList<Integer> arrLst = new ArrayList<Integer>();
		    arrLst.add(5);
		    arrLst.add(9);
		    arrLst.add(8);
		    arrLst.add(1);
		    
		    //see the lambda expression inside forEach method
		    arrLst.forEach( (n) ->  System.out.println(n));
		    
		    //see the lambda expression using body syntax inside forEach method
		   // arrLst.forEach( (n) ->  { System.out.println(n); });
		    
	 }

}
