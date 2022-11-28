package nama.springframework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import propertyinjection.HelloWorld;

public class DiDemoApplication1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		HelloWorld objA = (HelloWorld) context.getBean("helloBean");
		System.out.println(objA.getMessage());
		
		//Singleton scope by default
		objA.setMessage("I'm object A");
		System.out.println(objA.getMessage());

	    HelloWorld objB = (HelloWorld) context.getBean("helloBean");
	    System.out.println(objB.getMessage());
	    
	    //helloBean1 has scope=prototype
	    objA = (HelloWorld) context.getBean("helloBean1");
		objA.setMessage("Spring prototype scope demo");
		System.out.println("prototype scope:"+objA.getMessage());
		
		objB = (HelloWorld) context.getBean("helloBean1");
		System.out.println("prototype scope:"+objB.getMessage());
		
		
		 ((AbstractApplicationContext) context).registerShutdownHook();
		
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
