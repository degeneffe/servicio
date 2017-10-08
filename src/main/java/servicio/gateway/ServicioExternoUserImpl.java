package servicio.gateway;

import servicio.domain.User;

public class ServicioExternoUserImpl implements IExternalServiceUserGateway {

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		
		/*
		 * El servico manipula la entrada y devuelve el id de usuario relleno
		 */
		user.setStrUserId("idusuario");
		user.setStrName("pedro");
		user.setStrSurname("picapiedra");
		return user;
	}

}
