package classesobjects;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		
		System.out.println("no of objects of Employee:"+Employee.count);
		
		e.displayEmployee();
		double s = e.calcAnnSalary();
		
		System.out.println(s);
		
		Employee e1 = new Employee(10,2000);
		
		System.out.println("no of objects of Employee:"+Employee.count);
		
		e1.displayEmployee();
		
         s = e1.calcAnnSalary(50000);
		
		System.out.println(s);


	}

}
