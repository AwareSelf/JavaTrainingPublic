package multithreading1;

public class MultithreadingEx {

	public static void main(String[] args) {
		
		
	 //  MyThread1 thread1 = new MyThread1("Thread1");
		MyThread1 thread1 = new MyThread1();
	   thread1.start();
	   
	   
	   //this is commony used - runnable interface impl
        Runnable r = new MyThread2();
        
        Thread t2 = new Thread(r,"MyThread2");
        
         t2.start();
	   
	     
	   
	   
		
		
		for(int j=1;j<100;j++)
		{
			
	System.out.println(Thread.currentThread().getName()+" j="+j);
	
	     try
	     {
	       Thread.sleep(3000);
	       
	     }
	     catch(InterruptedException e)
	     {
	    	 e.printStackTrace();
	     }
	
	  
	
		}
		
		
	}

}
