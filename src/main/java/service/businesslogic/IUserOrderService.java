package service.businesslogic;

import service.api.UserOrder;

public interface IUserOrderService {

	public UserOrder findUserOrderByEmailOrder(String strEmail,String strOrderId);
}
