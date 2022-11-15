package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		SortedSet<String> sortset = new TreeSet<String>();
		
		sortset.add("Vivek");
		sortset.add("Aditya");
		sortset.add("Anushka");
		sortset.add("Priyansh");
		sortset.add("Yamini");
		
		System.out.println(sortset);
		
		
		sortset.add("Chinmay");
		
		System.out.println(sortset);
		
		System.out.println(sortset.size());
		
		System.out.println(sortset.contains("Priyansh"));
	}

}
