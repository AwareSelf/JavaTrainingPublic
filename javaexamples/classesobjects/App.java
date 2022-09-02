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
		
		
		//code to create account object
		
		//use scanner and take acctid and bal from end-user if u want and collect in a locak variable and pass to constructor
		
		
		Account a1 = new Account(1,5000.50);
		
		double balance = a1.getBal();
		System.out.println("balance for account id:"+a1.getAcctId()+" is "+balance);
		
		a1.setBal(-100);
		System.out.println("balance for account id:"+a1.getAcctId()+" is "+a1.getBal());
		
		a1.deposit(1000);
		System.out.println("balance for account id:"+a1.getAcctId()+" is "+a1.getBal());
		
		a1.withdraw(40000);
		System.out.println("balance for account id:"+a1.getAcctId()+" is "+a1.getBal());


	}

}
