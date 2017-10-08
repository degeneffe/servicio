package servicio.businesslogic;

import java.util.function.BiFunction;
import java.util.function.Function;

import servicio.api.UserOrder;
import servicio.domain.Order;
import servicio.domain.User;
import servicio.gateway.IExternalServiceOrderGateway;
import servicio.gateway.IExternalServiceUserGateway;
import servicio.gateway.ServicioExternoOrderImpl;
import servicio.gateway.ServicioExternoUserImpl;

public class UserOrderServiceImpl implements IUserOrderService {

	@Override
	public UserOrder findUserOrderByEmailOrder(String strEmail, String strOrderId) {
		// TODO Orquestación del servicio. Se llama a los dos servicios externos
		// y se devuelve un UserOrder
		User user = new User(strEmail, "", "", "");
		IExternalServiceUserGateway serviceUser = new ServicioExternoUserImpl();

		Order order = new Order(serviceUser.getUser(user).getStrUserId(), strOrderId, "");
		IExternalServiceOrderGateway serviceOrder = new ServicioExternoOrderImpl();
		order = serviceOrder.getOrder(order);
		return new UserOrder(strEmail, user.getStrName(), user.getStrSurname(), user.getStrUserId(),
				order.getStrOrderId(), order.getStrFlag());
	}

}
