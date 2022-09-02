package classesobjects;

public class ArrayEx {

	public static void main(String[] args) {
		
		
		int[] arr1 ;  //define a reference of type int array
		arr1 = new int[5]; //actually create integer array object
		
		int[] arr = new int[5];  //combine both create array object and assign it to array ref in single statement
		
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=5;
			System.out.println(arr[i]);
		}
		
		//for-each loop
		System.out.println("using for eachloop..");
		for(int a : arr)
		{
		    System.out.println(a);	
		}
		
		System.out.println("initialise array at time of creation and display using for eachloop..");
		
		int[] arr2 = {1,3,4,6,7};
		
		for(int a:arr2)
		{
			System.out.println(a);
		}
		
		System.out.println("pass array arr2 to function func..");
		func(arr2);
		
		System.out.println("after passing array arr2 to function func display using for-each..");
		for(int a:arr2)
		{
			System.out.println(a);
		}
		
		
		
		System.out.println("pass array arr2[0] value to function func1..");
		arr2[0] = func1(arr2[0]);
		
		System.out.println("after collecting returned value from function func1..");
		System.out.println(arr2[0]);

	}
	
	//pass by reference
	static void func(int[] ar)
	{
		for(int n=0;n<ar.length;n++)
		{
			ar[n] = ar[n]+5;
			System.out.println(ar[n]);
		}
		
		//System.out.println(ar[3]);
	}
	
	//pass by value
	static int func1(int no)
	{
		no=no+5;
		
		return no;
		
	}

}
