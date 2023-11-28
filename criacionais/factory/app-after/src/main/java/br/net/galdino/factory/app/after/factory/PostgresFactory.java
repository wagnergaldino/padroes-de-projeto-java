package br.net.galdino.factory.app.after.factory;

import br.net.galdino.factory.app.after.db.DB;
import br.net.galdino.factory.app.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}

}
