package br.net.galdino.abstractfactory.app.factory;

import br.net.galdino.abstractfactory.app.service.CarEJBService;
import br.net.galdino.abstractfactory.app.service.CarService;
import br.net.galdino.abstractfactory.app.service.UserEJBService;
import br.net.galdino.abstractfactory.app.service.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}

}

