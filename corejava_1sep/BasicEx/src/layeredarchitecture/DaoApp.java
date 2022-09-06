package layeredarchitecture;

import java.util.Scanner;

public class DaoApp {

	public static void main(String[] args) {
	// Interface ref = instance of Class that implements the interface
	// EmpDao is-a Dao
		
		String yesno = null;
	
		do
		{
		
		System.out.println("Enter the dao implementation type: Emp/Department/MyDate");
		Scanner sc = new Scanner(System.in);
		String daoimpl = sc.next();
		
	switch(daoimpl)
	{
		case "Emp":
		Dao dao = new EmpDao();
		
		Emp e1 = new Emp(1,"Ram",5000,10);
		Emp e2 = new Emp(2,"Shyam",6000,10);
		Emp e3 = new Emp(3,"Geeta",7000,20);
		
		dao.add(e1);
		dao.add(e2);
		dao.add(e3);
		
		Object[] arr = dao.getAll();
		
		System.out.println("After adding 3 emps into the list using dao class");
		for(Object e:arr)
		{
			System.out.println(e);
		}
		
		
		dao.remove(e2);
		
          arr = dao.getAll();
		
      	System.out.println("After removing 1 emp out of 3 emps from the list using dao class");  
		for(Object e:arr)
		{
			System.out.println(e);
		}
		
		
		break;
		
		
		
		case "Department":
			
			//add 3 Departments,list all 3 departments,remove a department,list remaining departments
		
        dao = new DeptDao();
		
		Department d1 = new Department(10,"Account",5);
		Department d2 = new Department(20,"HR",4);
		Department d3 = new Department(30,"Training",10);
		
		dao.add(d1);
		dao.add(d2);
		dao.add(d3);
		
		Object[] arr1 = dao.getAll();
		
		System.out.println("After adding 3 departments into the list using dao class");
		for(Object d:arr1)
		{
			System.out.println(d);
		}
		
		
		dao.remove(d2);
		
          arr1 = dao.getAll();
		
      	System.out.println("After removing 1 department out of 3 department from the list using dao class");  
		for(Object d:arr1)
		{
			System.out.println(d);
		}
		
		
		break;
		
		case "MyDate":
		
			 System.out.println("MyDate dao impl will go here");
		    break;
	
		default:
			System.out.println("dao implementation not available..");
	}
		
	   System.out.println("Do u wish to continue (yes/no)");
	
	     yesno = sc.next();
	
		}while(yesno.equals("yes"));

	}

}
