package nama.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//https://www.dineshonjava.com/using-applicationcontextaware-in-spring/
public class LifecycleBean implements ApplicationContextAware,BeanNameAware {
	private String message;
	 private ApplicationContext ctx;
	
	public String getMessage()
	{
		return message;
	}
	
	public void setMessage(String message)
	{
		this.message=message;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		this.ctx = ctx;
	}
	
	 public void init()
	 {
		 System.out.println("init method called..");
	 }
	 
	 public void destroy()
	 {
		 System.out.println("destroy method called..");
	 }
	 
	 @Override
	 public void setBeanName(String beanName)
	 {
	  System.out.println("Bean name is: "+beanName);
	 }

}
