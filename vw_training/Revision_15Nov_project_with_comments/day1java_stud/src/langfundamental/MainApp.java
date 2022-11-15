/**
 * 
 */

package langfundamental;

import java.util.ArrayList;

import classesobjects.Employee;

import java.io.FileReader;
import java.io.IOException; 




/**
 * @author namra
 * basic hello world program
 *
 */
public class MainApp  {

	/**
	 * @param args
	 */
	
	static int no=7;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//Employee.showObjectCount();
		System.out.println("hello everyone!");
		
			
		Employee e1 = new Employee(2,"Raj Malhotra",25000,10);
		
	
		//System.out.println(e1.empid);
		e1.display();
		
	     //  Employee.showObjectCount();
	       
	       /*
	//	System.out.println("no of objects of Employee created so far:"+r.ct); //misleading
		
	    Employee s = new Employee(1);
		
		System.out.println(s.empid);
		s.display();
	      Employee.showObjectCount();
		//System.out.println("no of objects of Employee created so far:"+s.ct);
		
		*/

	}

}

class A
{
	
}
