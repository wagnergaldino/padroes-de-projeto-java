package br.net.galdino.factory.app.before.db;

public class OracleDB {

	public void query(String sql) {
		System.out.println("Querying " + sql + " in Oracle database");
	}
	
	public void update(String sql) {
		System.out.println("Uptade query " + sql + " in Oracle database");
	}
}
