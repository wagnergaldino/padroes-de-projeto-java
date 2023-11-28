package br.net.galdino.factory.app.after;

import br.net.galdino.factory.app.after.db.DB;
import br.net.galdino.factory.app.after.factory.OracleFactory;
import br.net.galdino.factory.app.after.factory.PostgresFactory;

public class Client {

	public static void main(String[] args) {
		DB dbOracle = new OracleFactory().getDatabase();
		dbOracle.query("SELECT * FROM users");
		dbOracle.update("INSERT INTO users VALUES ('User', 25)");
		
		DB dbPostgres = new PostgresFactory().getDatabase();
		dbPostgres.query("SELECT * FROM users");
		dbPostgres.update("INSERT INTO users VALUES ('User', 25)");
	}
}
