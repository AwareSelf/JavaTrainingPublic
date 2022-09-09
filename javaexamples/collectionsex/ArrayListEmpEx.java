package collectionsex;
import java.util.*;

public class ArrayListEmpEx {

	public static void main(String[] args) {
		
	//	List l = new ArrayList();
		List<Employee> l = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1,"Rahul",5000,10);
		l.add(e1);
		
	
		l.add(new Employee(2,"Medha",6000,20));
		
		l.add(new Employee(3,"Surabhi",7000,10));
		
		Employee e2 = new Employee(1,"Rahul",5000,10);
		l.add(e2);
		
		Employee e3 = new Employee(11,"Sita",15000,20);
		l.add(e3);
		System.out.println(l.size());
		
		meth(l);
		
		//System.out.println("after removing element at index position 0");
		
		//l.remove(0);
		
	//	while(l.contains(new Employee(1,"Rahul",5000)))
	//	{
			//l.remove(new Employee(1,"Rahul",5000,10)); //remove(Object) - it will remove 1st occurence by searching for matching object in the collection using equals method,  if true/present then remove it
	//	}
		
		l.remove(new Employee(11,"Sita",15000,20));
		
	 //   l.remove(e1); 
		
		System.out.println(l);
		
		meth(l);
		
		/*
		System.out.println("is surabhi there:"+l.contains("surabhi")); // contains checks if element is present and uses equals method for it internally
		System.out.println("is medha there:"+l.contains("medha"));
		
		l.clear(); //remove all elements in that collection
		
		System.out.println(l.size());
		
		*/
		

	}
	
	
	static void meth(List<Employee> l)
	{
	//	interface ref = class which implements the interface
       Iterator<Employee> it = l.iterator();
		
		while(it.hasNext())
		{
			//System.out.println(it.next());
			
			Employee e = it.next();
			e.calcAnnSalary();
				
			System.out.println(e);
		}
		
	}

}
