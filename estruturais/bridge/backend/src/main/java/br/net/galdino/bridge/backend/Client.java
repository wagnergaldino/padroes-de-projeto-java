package br.net.galdino.bridge.backend;

import br.net.galdino.bridge.backend.dao.UserMongoDao;
import br.net.galdino.bridge.backend.dao.UserMysqlDao;
import br.net.galdino.bridge.backend.dao.UserOracleDao;
import br.net.galdino.bridge.backend.dao.UserPostgresDao;
import br.net.galdino.bridge.backend.model.User;
import br.net.galdino.bridge.backend.services.UserEJB;
import br.net.galdino.bridge.backend.services.UserRest;
import br.net.galdino.bridge.backend.services.UserService;
import br.net.galdino.bridge.backend.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);
		
		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);
		
		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);
		
		//.......
		
		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
		
	}
}
