package collections;

import java.util.Comparator;

public class ComparatorImplEmpNames implements Comparator<Employee> {
	
	
	
	public int compare(Employee e1,Employee e2)
	{
		System.out.println("comparing e1.empname:"+e1.getEmpname()+" and e2.empname:"+e2.getEmpname());
		return (int)(e1.getEmpname().compareTo(e2.getEmpname()));
	}

}
