package br.net.galdino.factory.app.after.db;

public class OracleDB implements DB {

	public void query(String sql) {
		System.out.println("Querying " + sql + " in Oracle database");
	}
	
	public void update(String sql) {
		System.out.println("Uptade query " + sql + " in Oracle database");
	}
}
