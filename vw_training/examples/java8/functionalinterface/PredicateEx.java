package functionalinterface;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class PredicateEx {
	
	public static void main(String[] args)
	{
		Predicate<Integer> c = (no) -> no%2==0;
		boolean r = c.test(10);
		System.out.println("10%2="+r);
		
		r = c.test(9);
		System.out.println("9%2="+r);
		
		BiPredicate<Integer,Integer> bp = (no,no1) -> no==no1;
		r = bp.test(12,12);
		System.out.println("12==12:"+r);
		
		r = bp.test(12,13);
		System.out.println("12==13:"+r);
	}
}


