package uselamda;


class MyRunnable implements Runnable
{
	public void run()
	{
		  for(int i=0;i<5;i++)
          {
        	  System.out.println(i);
          }
		
	}
}
public class RunnableEx {

	 public static void main(String[] args)
	 {
		 
		 Runnable r = () ->{
			          for(int i=0;i<5;i++)
			          {
			        	  System.out.println(i);
			          }
		            };
		            
		            Thread tr = new Thread(r);
		            tr.start();
		        
		 /*
		 MyRunnable ob = new MyRunnable();
		 Thread t = new Thread(ob);
		        t.start();
		        
		        //argument defined anonymous inner class
		 Thread t1 = new Thread(new Runnable() {
			  public void run()
			  {
				  for(int i=0;i<5;i++)
		          {
		        	  System.out.println(i);
		          }
				  
			  }
		  });
		 
		   t1.start();
		   */
	 }
}
