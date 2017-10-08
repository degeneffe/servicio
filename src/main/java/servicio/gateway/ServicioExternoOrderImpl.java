package servicio.gateway;

import servicio.domain.Order;

public class ServicioExternoOrderImpl implements IExternalServiceOrderGateway {

	@Override
	public Order getOrder(Order order) {
		// TODO Auto-generated method stub
		
		/* en la llamada únicamente nos viene el id de usuario y nos devuelve el identificador de la compra, 
		
		*que suponemos único para cada usuario
		*/
		order.setStrFlag("true");
		order.setStrOrderId("4444");
		return order;
	}

}
