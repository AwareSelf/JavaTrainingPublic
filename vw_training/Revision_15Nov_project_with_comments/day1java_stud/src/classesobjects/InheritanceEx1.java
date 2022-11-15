package classesobjects;

public class InheritanceEx1 {

	public static void main(String[] args) {
		
		
		Employee e;
		
		e = new Employee(1,"Raj Sing",23000,10);
		meth(e);
		
		e = new WageEmployee(2,"Neha Mathur",5000,20,8000,15);
		
		meth(e);
		
		
		e = new Manager(101,"Ronit Roy",45000,10,5,"Sales",12000);
		meth(e);
		
	
		/*
		
		Employee e1= new Employee(11,"Radha Joshi",12000,10);
		
		WageEmployee wgemp = new WageEmployee(2,"Neha Mathur",5000,20,8000,15);
		
		e1=wgemp; // wgemp is a emp - is-a relationship
		
		*/
	//	wgemp=e1; //emp is not a wageemp - no is-a relationship
		
	}
	
	
	
	public static void meth(Employee e)
	{
		System.out.println(e);
		double totsal = e.calcAnnSal();
		System.out.println("total annual salary:"+totsal);
	
		
		//without casting compiler will give error as it will search for
		//getDailyWage() method inside Employee class as ref e is of type Employee 
		//so need to use casting
	//	  System.out.println("daily wages:"+e.getDailyWage());
		
		
		if(e instanceof WageEmployee)
		  System.out.println("daily wages:"+((WageEmployee)e).getDailyWage());
	
	}

}
