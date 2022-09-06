package layeredarchitecture;

import java.util.ArrayList;
import java.util.List;

public class DeptDao implements Dao {
	
	//Department[] arr;
	
  	List arr;
	
 public	DeptDao()
	{
		this.arr =  new ArrayList<Department>();
	 
	  //   this.arr = new Department[3];
	}
	

	public boolean add(Object o)
	{
	//	Department d = (Department)o;
	// boolean result = arr.add(d);
				
		boolean result = arr.add(o);
		
		return result;
		/*
		 
		 // array implementation
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==null)
			{
				break;
			}
		}
		
		Department d = (Department)o;
		arr[i] = d;
		
		return true;
		*/
	}
	
	public boolean remove(Object o)
	{
		Department d = (Department) o;
		
		boolean b = this.arr.remove(d);
		
		return b;
		/*
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(d))
			{
				arr[i]=null;
				return true;
			}
		}
		
		
		return false;
		*/
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
		
	//	return arr;
		
	}

}
