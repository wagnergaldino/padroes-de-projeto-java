package br.net.galdino.adapter.hexagonal.core.ports;

import java.util.List;

import br.net.galdino.adapter.hexagonal.core.model.User;

public interface UserRepository {
	void save(User user);
	List<User> getAll();
}
