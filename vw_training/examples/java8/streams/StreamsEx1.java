package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamsEx1
{
	public static void main(String[] args)
	{
		//filtering non null values, using filter lambda
		Stream<String> strm = Stream.of("java","c++",null,"python","c prog","c sharp");
		List<String> lst = strm.filter(x->x!=null).collect(Collectors.toList());
	    lst.forEach(System.out::println);
	    
	    //filtering nonNull values using filter-method ref Objects::nonNull
	    Stream<String> strm1 = Stream.of("java","c++",null,"python","c prog","c sharp");
	    List<String> lst1 = strm1.filter(Objects::nonNull).collect(Collectors.toList());
	    lst1.forEach(System.out::println);
	    
	    List<String> lt = Arrays.asList("apple", "apple", "banana",
                "apple", "orange", "banana", "papaya");
	    Map<String,Long> mp = lt.stream()
	    .collect(Collectors.groupingBy(Function.identity(),
	    		Collectors.counting()));
	    
	    System.out.println(mp);
	    
	    List<Emp> lstemp = new ArrayList<Emp>();
		lstemp.add(new Emp(1,"Ram",2000));
		lstemp.add(new Emp(5,"Shyam",5000));
		lstemp.add(new Emp(2,"lara",5000));
		
		Emp e = new Emp(4,"Meena",3000);
		lstemp.add(e);
		e = new Emp(4,"Meena",3000);
		lstemp.add(e);
		
		 Map<Double,List<Emp>> mp1 = lstemp.stream().collect(Collectors.groupingBy(Emp::getSal));
	//	 mp1.forEach((k,v)->System.out.println(k+":"+v));
		 
		// mp1.entrySet().stream().forEach(a->{System.out.println(a.getKey()+":"+a.getValue());});
	     mp1.entrySet().stream().forEach(System.out::println);
	}
}