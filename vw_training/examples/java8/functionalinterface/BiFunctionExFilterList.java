package functionalinterface;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.Arrays;

public class BiFunctionExFilterList {
	public static void main(String[] args) {
		      
        try
        {
        	BiFunctionExFilterList obj = new BiFunctionExFilterList();

             List<String> list = Arrays.asList("node", "c++", "java", "javascript");

             //use BiFunction to filter out strings with length greater than 3
             List<String> result1 = obj.filterList(list, 3, (l1, size) -> {
                 if (l1.length() > size) {
                     return l1;
                 } else {
                     return null;
                 }
             });

             System.out.println(result1);  // [node, java, javascript]
        }
        catch (Exception e) {
             System.out.println("Exception in executing function: "+ e);
        }
        
        //System.out.println("continue..");
   	}
	
	public  List<String> filterList(List<String> l,Integer s,BiFunction<String,Integer,String> bf)
	{
		List<String> res = new ArrayList<String>();
		  for(String str:l)
		  {
		  String s1 = bf.apply(str, s);
		    if(s1!=null)
		    {
		    	res.add(s1);
		    }
		  }
		  return res;
	}
	
	/*
	public <R,A,S> List<S> filterList(List<R> l,A s,BiFunction<R,A,S> bf)
	{
		List<S> res = new ArrayList<S>();
		  for(R str:l)
		  {
		  S s1 = bf.apply(str, s);
		    if(s1!=null)
		    {
		    	res.add(s1);
		    }
		  }
		  return res;
	}
	*/
}
