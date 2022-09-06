package equalshashcodeex;

public class App {

	public static void main(String[] args) {
	
		
		Emp e1 = new Emp(1,"Ram",5000,10);
		Emp e2 = new Emp(2,"Shyam",6000,10);
		
		System.out.println("e1 hashCode="+e1.hashCode());
		System.out.println("e2 hashCode="+e2.hashCode());
	
		
		boolean b= e1==e2;
		
		System.out.println(b);
		
		System.out.println(e1==e2);
		
		
		Emp e3 = new Emp(1,"Ram",5000,10);
		Emp e4 = e1;
		
		System.out.println("e4 hashCode="+e4.hashCode());
		System.out.println("e1 hashCode="+e1.hashCode());
		
		System.out.println("e1==e3:"+(e1==e3));
		boolean b1 = e1.equals(e3);
		System.out.println("e1.equals(e3):"+b1);
		
		System.out.println(e1==e4);
	}

}
