package br.net.galdino.abstractfactory.app;

import br.net.galdino.abstractfactory.app.factory.EJBAbstractFactory;
import br.net.galdino.abstractfactory.app.factory.ServicesAbstractFactory;
import br.net.galdino.abstractfactory.app.service.CarService;
import br.net.galdino.abstractfactory.app.service.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory factory = new EJBAbstractFactory();
//		ServicesAbstractFactory factory = new RestAbstractFactory();
		
		UserService userService = factory.getUserService();
		userService.save("Jhon");
		userService.delete(5);
		
		CarService carService = factory.getCarService();
		carService.save("Prius");
		carService.update("Tesla X");
	}
}
