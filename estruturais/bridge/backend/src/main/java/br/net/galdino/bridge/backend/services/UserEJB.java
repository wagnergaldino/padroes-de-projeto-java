package br.net.galdino.bridge.backend.services;

import br.net.galdino.bridge.backend.dao.UserDao;
import br.net.galdino.bridge.backend.model.User;

public class UserEJB extends UserService {
	public UserEJB(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
		dao.save(user);
	}
}