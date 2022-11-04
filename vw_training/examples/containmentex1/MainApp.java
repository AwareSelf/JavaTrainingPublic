package containmentex1;

import java.util.*;

import containmentex.Employee1;

public class MainApp {
	
	
	public static void main(String[] args)
	{
		//part 1 - without containment - Employee has only deptno field (it doesnt contain Dept object)
		List<Department> dlst = new ArrayList<Department>();
		
		
		Department d1 = new Department(10,"Accounts",5,"Rohit Sharma");
		
		Department d2 = new Department(20,"HR",15,"Aditi Mathur");
		dlst.add(d1);
		dlst.add(d2);
		
		
		Employee e1 = new Employee(1,"Ram",12000,10);
		
		Employee e2 = new Employee(2,"Shyam",15000,10);
		
		
		d1.getEmplst().add(e1);
		d1.getEmplst().add(e2);
		
		
		
		//list the details of dept 10 and all employee details of that department
		
		dlst.forEach(d->
		       {
		    	  if(d.getDeptno() == 10)
		    	  {
		    		  System.out.println(d);
		    		  System.out.println(d.getEmplst());
		    		  
		    		  List<Employee> lemp = d.getEmplst();
		    		  
		    		  Employee e = lemp.get(0);
		    		  
		    	  }
		    	   
			
		        }
				
		);
		
		
		
	}

}
