package br.net.galdino.bridge.backend.services;

import br.net.galdino.bridge.backend.dao.UserDao;
import br.net.galdino.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
