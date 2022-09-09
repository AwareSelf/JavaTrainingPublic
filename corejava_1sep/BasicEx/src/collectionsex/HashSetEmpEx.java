package collectionsex;
import java.util.*;

public class HashSetEmpEx {

	public static void main(String[] args) {
		

		Set<Employee> set = new HashSet<Employee>();
		
		Employee e1 = new Employee(1,"Rahul",5000,10);
		set.add(e1);
		
	
		set.add(new Employee(2,"Medha",6000,20));
		
		set.add(new Employee(3,"Surabhi",7000,10));
		
		Employee e2 = new Employee(1,"Rahul",5000,10);
		set.add(e2);
		
		
		Employee e3 = new Employee(11,"Sita",15000,20);
		set.add(e3);
		System.out.println(set.size());
	
		
		System.out.println(set);
		meth(set);
		
	
		System.out.println("emp sita is present:"+set.contains(new Employee(11,"Sita",15000,20)));
		set.remove(new Employee(11,"Sita",15000,20)); //remove(Object) - it will remove 1st occurence by searching for matching 
		//object in the collection using hashCode and equals method,  if true/present then remove it
		System.out.println(set.size());
		
		
	 	meth(set);
		
		/*
		System.out.println("is surabhi there:"+l.contains("surabhi")); // contains checks if element is present and uses equals method for it internally
		System.out.println("is medha there:"+l.contains("medha"));
		
		set.clear(); //remove all elements in that collection
		
		System.out.println(l.size());
		
		*/
		

	}
	
	
	static void meth(Set<Employee> set)
	{
	//	interface ref = class which implements the interface
       Iterator<Employee> it = set.iterator();
		
		while(it.hasNext())
		{
			//System.out.println(it.next());
			
			Employee e = it.next();
			e.calcAnnSalary();
				
			System.out.println(e);
		}
		
	}

}
