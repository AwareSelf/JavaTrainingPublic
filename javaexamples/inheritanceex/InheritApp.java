package inheritanceex;

public class InheritApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Emp e = new Emp(1,"Rahul",5000);
		/*
		System.out.println(e);
				
		double annSal = e.calcAnnSal();
		
		System.out.println(annSal);
		*/
		
		Manager m = new Manager();
		
	//	System.out.println(m);
		
		Manager m1 = new Manager(2,"Shyam",12000,"Sales",100000);
	//	System.out.println(m1);
		
	//	System.out.println(m1.calcAnnSal());
			
		Emp e2 = new Manager(3,"Radha",15000,"HR",200000);
	//	System.out.println(e2);
		
	//	System.out.println(e2.calcAnnSal());
		
		meth(e);
		meth(m);
		meth(m1);
		meth(e2);
		
		meth(new Emp(6,"Geeta",2300));
		meth(new Manager(7,"Mita",5000,"Training",100000));
		
		Emp[] arr = new Emp[3];
		arr[0] =  new Manager(8,"Kunal",4000,"HR",120000);
		arr[1] =  new Emp(9,"Mitu",6000);
//      arr[2] =  new WageEmployee(....);
		
		
		System.out.println("printing employee array of references in main...");
		for(Emp ex:arr)
		{
			if(ex!=null)
			{
			System.out.println(ex);
			
			double d = ex.calcAnnSal();
			System.out.println(d);
			}
		}
		
		meth(arr);
	}
	
	static void meth(Emp x)
	{
		x.calcAnnSal();
		
		if(x instanceof Manager)
		{
		   ((Manager)x).delegate();
		}
		
		
	}
	
	static void meth(Emp[] x)
	{
		System.out.println("printing employee array of references in function meth...");
		for(Emp ex:x)
		{
			if(ex!=null)
			{
			System.out.println(ex);
			
			double d = ex.calcAnnSal();
			System.out.println(d);
			
			     
			}
		}
	}
	
	

}
