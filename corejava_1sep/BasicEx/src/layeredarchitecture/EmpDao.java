package layeredarchitecture;

import java.util.ArrayList;
import java.util.List;

public class EmpDao implements Dao {
	
	//Emp[] arr;
	
	List arr;
	
 public	EmpDao()
	{
		this.arr =  new ArrayList<Emp>();
	}
	

	public boolean add(Object o)
	{
		//Emp e = (Emp)o;
				
		//boolean result = arr.add(e);
		
		boolean result = arr.add(o);
		
		return result;
		
	}
	
	public boolean remove(Object o)
	{
		Emp e = (Emp) o;
		
		boolean b = this.arr.remove(e);
		return b;
	}
	//boolean remove(int id);
	
	/*
	public Object get(int id)
	{
		
		
	}
	*/
	
	public Object[] getAll()
	{
		
		/*
	Object[] arr =  this.arr.toArray();
	
	for(Object o:arr)
	{
		System.out.println(o);
	}
	
	return arr;
	*/
		
		return this.arr.toArray();
		
	}

}
