package uselamda;

interface Addable
{
	int add(int a,int b);
}

public class LamdaExpEx1 {

	public static void main(String[] args) {
		
      Addable ad = (a,b)-> a+b;
      
      
      
      System.out.println(ad.add(10,20));
      
      int res = ad.add(30,30);
      System.out.println(res);
      
      ad = (a,b) -> {return a+b; };
      ad.add(2, 2);
      
    
	}
	


}
