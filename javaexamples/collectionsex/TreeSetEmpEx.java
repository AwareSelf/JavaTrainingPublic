package collectionsex;
import java.util.*;

public class TreeSetEmpEx {

	public static void main(String[] args) {
		
		/*
		  SortedSet<String> trees = new TreeSet<String>();
		     
		  trees.add("zeenat");
		     trees.add("aditi");
		     trees.add("charudatt");
		     
		     System.out.println(trees);
		     System.out.println(trees.size());
			*/	     
		     
     SortedSet<Employee> ts = new TreeSet<Employee>();
     
     
     Employee e1 = new Employee(11,"Radha",12000,10);
     
     Employee e2 = new Employee(2,"Mitali",15000,10);
     Employee e3 = new Employee(2,"Mitali",15000,10);
     
     Employee e4 = new Employee(7,"Geeta",13000,20);
     ts.add(e1);
     ts.add(e2);
     ts.add(e3);
     ts.add(e4);
     
     System.out.println(ts.size());
     System.out.println(ts);
		     
		     
		
  }
	
}