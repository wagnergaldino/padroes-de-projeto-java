package br.net.galdino.abstractfactory.app.factory;

import br.net.galdino.abstractfactory.app.service.CarService;
import br.net.galdino.abstractfactory.app.service.UserService;

public interface ServicesAbstractFactory {
	UserService getUserService();
	CarService getCarService();
}
