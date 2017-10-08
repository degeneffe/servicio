package servicio.businesslogic;

import servicio.api.UserOrder;

public interface IUserOrderService {

	public UserOrder findUserOrderByEmailOrder(String strEmail,String strOrderId);
}
