package br.net.galdino.abstractfactory.app.factory;

import br.net.galdino.abstractfactory.app.service.CarRestApiService;
import br.net.galdino.abstractfactory.app.service.CarService;
import br.net.galdino.abstractfactory.app.service.UserRestApiService;
import br.net.galdino.abstractfactory.app.service.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}
