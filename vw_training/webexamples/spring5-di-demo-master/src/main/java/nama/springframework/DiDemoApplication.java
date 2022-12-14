package nama.springframework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import autowiringanno.Employeex;
import constructorinjection.GreetingService;
import constructorinjectionwithref.Employee1;
import propertyinjection.HelloWorld;
import propertyrefinjection.Employee;

public class DiDemoApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		Employeex empx = (Employeex) context.getBean("employeex");
		System.out.println("Employee created with property ref injection: "+ empx);

		
		/*
		HelloWorld objA = (HelloWorld) context.getBean("helloBean");
		objA.printHello();
		System.out.println(objA.getMessage());
		
		Employee emp = (Employee) context.getBean("employee");
		System.out.println("Employee created with property ref injection: "+ emp);


		
		GreetingService greetingService = (GreetingService) context.getBean("greetingServicess");
		greetingService.sayGreeting();
		
		
		Employee1 emp1 = (Employee1) context.getBean("employee1");
		System.out.println("Employee created with constructor ref injection: "+ emp1);

		*/
		   
		((AbstractApplicationContext) context).registerShutdownHook();
		
		//Using BeanFactory Container (primitive basic container) 
		/*
		Resource resource = new FileSystemResource("SpringBeans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		HelloWorld obj1 =(HelloWorld) factory.getBean("helloBean");
		obj1.printHello();
		System.out.println(obj1.getMessage());
		*/
	  }
}

/*
 * 
Spring provides the following two distinct types of containers.

Sr.No.	Container & Description
1	Spring BeanFactory Container
	This is the simplest container providing the basic support for DI and is defined by 
	the org.springframework.beans.factory.BeanFactory interface. 
	The BeanFactory and related interfaces, such as BeanFactoryAware, InitializingBean, DisposableBean, 
	are still present in Spring for the purpose of backward compatibility with a large number of third-party 
	frameworks that integrate with Spring.

2	Spring ApplicationContext Container
    This container adds more enterprise-specific functionality such as the ability to resolve textual 
    messages from a properties file and the ability to publish application events to interested event listeners. 
    This container is defined by the org.springframework.context.ApplicationContext interface.

    The ApplicationContext container includes all functionality of the BeanFactorycontainer, so it is generally 
    recommended over BeanFactory. BeanFactory can still be used for lightweight applications like mobile devices 
    or applet-based applications where data volume and speed is significant.
*/
