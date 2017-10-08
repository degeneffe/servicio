package servicio.resource;

import java.util.logging.Logger;

import servicio.businesslogic.UserOrderServiceImpl;

public class MainResource {

	public static Logger log = Logger.getLogger("servicio");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserOrderServiceImpl uos = new UserOrderServiceImpl();
		log.info(uos.findUserOrderByEmailOrder("pedro@gmail.com", "miId").toString());
		
		
		
		
	}

}
