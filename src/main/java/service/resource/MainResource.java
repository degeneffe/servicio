package service.resource;

import java.util.logging.Logger;

import service.businesslogic.IUserOrderService;
import service.businesslogic.UserOrderServiceImpl;
import service.framework.BaseContextClass;

public class MainResource extends BaseContextClass{

	public static Logger log = Logger.getLogger("servicio");
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IUserOrderService uos = (IUserOrderService)MainResource.getBean("UserOrderService");
		log.info(uos.findUserOrderByEmailOrder("pedro@gmail.com", "miId").toString());
		
		
		
		
	}

}
