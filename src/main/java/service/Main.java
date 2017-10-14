package service;
import static spark.Spark.*;

import service.businesslogic.IUserOrderService;
import service.framework.BaseContextClass;
import service.resource.MainResource;

public class Main extends BaseContextClass{
    public static void main(String[] args) {
        get("/hello", (req, res) -> {
        	IUserOrderService uos = (IUserOrderService)MainResource.getBean("UserOrderService");
    		log.info(uos.findUserOrderByEmailOrder("pedro@gmail.com", "miId").toString());
        	return uos.findUserOrderByEmailOrder("pedro@gmail.com", "miId").toString();
        });
    }
}