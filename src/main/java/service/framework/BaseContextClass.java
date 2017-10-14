package service.framework;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.businesslogic.IUserOrderService;

public abstract class BaseContextClass {
	
private static ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
public static Logger log = Logger.getLogger("servicio");
	
	public static Object getBean(String bean){
		return context.getBean(bean);
		
	}

}
