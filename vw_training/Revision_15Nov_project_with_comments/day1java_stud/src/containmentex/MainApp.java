package containmentex;

import java.util.*;

public class MainApp {
	
	
	public static void main(String[] args)
	{
		//part 1 - without containment - Employee has only deptno field (it doesnt contain Dept object)
		Map<Integer,Employee> mp = new HashMap<Integer,Employee>();
		
		mp.put(1,new Employee(1,"Ram",12000,10));
		mp.put(11,new Employee(2,"Shyam",15000,20));
		
		
		List<Department> d = new ArrayList<Department>();
		
		d.add(new Department(10,"Accounts",5,"Rohit Sharma"));
		d.add(new Department(20,"HR",15,"Aditi Mathur"));
		
		
		System.out.println("Show details of emp with empid=1 and his depatment details:");
		
		Employee e = mp.get(1);
		System.out.println(e);
		
		int deptno = e.getDeptno();
		
		d.forEach(x ->{
			
			if(x.getDeptno() == deptno)
			{	
				System.out.println("Employee with id:"+e.getEmpid()+", his dept details:"+x);
			}
		});
		
		//part 2 - Employee1 has Department object
		
		Map<Integer,Employee1> mp1 = new HashMap<Integer,Employee1>();
		
		Department d1 = new Department(10,"Accounts",5,"Rohit Sharma");
		Department d2 = new Department(20,"HR",15,"Aditi Mathur");
		
		List<Department> dplist = new ArrayList<Department>();
		  dplist.add(d1);
		  dplist.add(d2);
		
		Employee1 e1x = new Employee1(1,"Ram",12000,d1);
		
		Employee1 e2x = new Employee1(2,"Shyam",15000,d2);
		
		mp1.put(1,e1x);
		mp1.put(2,e2x);
		
		
		System.out.println("Show details of emp with empid=1 and his depatment details:");
		
		Employee1 ee = mp1.get(1);
		
		System.out.println("emp details with empid=1"+ee);
		System.out.println("emp's dept details:"+ee.getDept());
		System.out.println("Ram's department head:"+ee.getDept().getDepthead());
		
		
		
		
	}

}
