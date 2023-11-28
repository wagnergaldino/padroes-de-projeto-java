package br.net.galdino.factory.app.after.factory;

import br.net.galdino.factory.app.after.db.DB;
import br.net.galdino.factory.app.after.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
