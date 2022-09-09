package collectionsex;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		
	//	List l = new ArrayList();
		List<String> l = new ArrayList<String>();
		
		l.add("Rahul");
		
	//	l.add(10);
		
		l.add("Sabeshnav");
		l.add("Medha");
		l.add("surabhi");
		l.add("Rahul");
		
		System.out.println(l.size());
		
		meth(l);
		
		//l.remove(0);
		
		l.remove("Medha"); //remove(Object) - it will search for matching object in the collection using equals method,  if true/present then remove it
		
		System.out.println("after removing element at index position 0");
		
		meth(l);
		
		System.out.println("is surabhi there:"+l.contains("surabhi")); // contains checks if element is present and uses equals method for it internally
		System.out.println("is medha there:"+l.contains("medha"));
		
		l.clear(); //remove all elements in that collection
		
		System.out.println(l.size());
		
		
		

	}
	
	
	static void meth(List<String> l)
	{
	//	interface ref = class which implements the interface
       Iterator<String> it = l.iterator();
		
		while(it.hasNext())
		{
			//System.out.println(it.next());
			
		//	String  name = (String)it.next();
			
			String  name = it.next();
			
			name = name.toUpperCase();
			System.out.println(name);
		}
		
	}

}
