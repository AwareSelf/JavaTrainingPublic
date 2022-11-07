package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsEx {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(1,"Ram",12000));
		lst.add(new Emp(5,"Shyam",5000));
		lst.add(new Emp(2,"lara",20000));
		
		Emp e = new Emp(4,"Meena",3000);
		lst.add(e);
		e = new Emp(4,"Meena",3000);
		lst.add(e);
		
		//filter, findAny, findFirst, orElse
		Emp e1 = lst.stream()
				   .filter(x->x.ename.equals("lara"))
				   .findFirst().orElse(null);
		System.out.println(e1);
		 e1 = lst.stream()
				   .filter(x->x.ename.equals("lara"))
				   .findAny().orElse(null);
		System.out.println(e1);
		
		//filter & collect
		
		List<Emp> lst1 = lst.stream().filter(x->x.sal>5000)
				         .collect(Collectors.toList());
		          lst1.forEach(System.out::println);
		
		Set<Emp> s = lst.stream().filter(x->x.sal>5000)
		         .collect(Collectors.toSet());
		         s.forEach(System.out::println);
		
		//filter & distinct,count
		long ct = lst.stream().filter(x->x.sal>5000).distinct().count();
		System.out.println("Total no of diff employees "+ ct);
		
		
		//filter & map
		List<String> empnames = lst.stream().filter(x->x.sal>4000)
				                .map(x->x.getEname())
				                .collect(Collectors.toList());
		
		empnames.forEach(System.out::println);
		
		
		//filter and collect(toMap)
		Map<Integer, String> emap = lst.stream().filter(x->x.sal>4000)
                				.collect(Collectors.toMap(Emp::getId,Emp::getEname));
		
		    //arg is BiConsumer interface
		    // it takes two args and returns nothing
			emap.forEach((k,v)->System.out.println("Key:"+k+":"+"Value:"+v));	         
	
		 emap = lst.stream().filter(x->x.sal>2000)
    				.collect(Collectors.toMap(Emp::getId,Emp::getEname,
    						  (old,neww)->old));
                  //last arg to toMap is merger function
		          //in case of duplicate key which value should be kept
		        //there are duplicate emp for sal >2000
         emap.forEach((k,v)->System.out.println("Key:"+k+":"+"Value:"+v));	         

		
		           

	}

}

class Emp
{
	int id;
	String ename;
	double sal;
	
	Emp()
	{
		
	}
	
	Emp(int id,String name,double sal)
	{
		this.id=id;
		this.ename=name;
		this.sal=sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
}
