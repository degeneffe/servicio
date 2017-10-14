package service.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class BaseContextClass {
	
public ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
	
	
	public Object getBean(String bean){
		return context.getBean(bean);
		
	}

}
