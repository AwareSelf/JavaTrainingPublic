package exceptionex;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("program execution started..");
		String s=null;
		
		System.out.println("before calling function func..");
		func(s);
		
		System.out.println("after calling function func..");
		
		s.toUpperCase();
		
		System.out.println("s="+s);
		
		System.out.println("end of program reached..");

	}
	
	
	static void func(String s)
	{
		System.out.println("inside function func..");
		
		s.concat("java");
		
		System.out.println(s);
	}

}
