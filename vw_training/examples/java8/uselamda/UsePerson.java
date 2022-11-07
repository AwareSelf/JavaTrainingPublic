package uselamda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import uselamda.Person.Sex;

public class UsePerson {
	
	public static void main(String[] args)
	{
		Person p1 = new Person("Namrata",LocalDate.of(1981,4,16),Sex.FEMALE,"namratamarathe81@gmail.com");
		Person p2 = new Person("Rahul",LocalDate.of(1974,1,1),Sex.MALE,"rahulmar@gmail.com");
		
		
		List<Person> roster = new ArrayList<Person>();
		roster.add(p1);
		roster.add(p2);
		
		System.out.println(p1.getAge()+" "+p2.getAge());
		
		
		//using separate implementation class
		Person.printPersons(roster,  new CheckPersonImpl());
		
		//argument defined anonymous inner class
		Person.printPersons(roster,  new CheckPerson() {
	        public boolean test(Person p) {
	            return p.getGender() == Person.Sex.MALE
	                && p.getAge() >= 18
	                && p.getAge() <= 50;
	        }
	    });
		
		//lamda expression
		Person.printPersons(
			    roster,
			    (Person p) -> p.getGender() == Person.Sex.MALE
			        && p.getAge() >= 18
			        && p.getAge() <= 50
			);
		
	  
	} //end of main

}
