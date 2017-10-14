package service;

import static spark.Spark.*;

import java.util.logging.Logger;

import com.google.gson.Gson;

import service.api.UserOrder;
import service.businesslogic.IUserOrderService;
import service.framework.BaseContextClass;
import service.resource.MainResource;

public class Main {
	private static Gson gson = new Gson();
	private static Logger log = Logger.getLogger("serviceApi");
	
	public static void main(String[] args) {
		get("/hello", (req, res) -> {
			IUserOrderService uos = (IUserOrderService) BaseContextClass.getBean("UserOrderService");
			
			UserOrder result = uos.findUserOrderByEmailOrder("pedro@gmail.com", "miId");
			
			log.info(result.toString());

			return gson.toJson(result, UserOrder.class);
		});
	}
}