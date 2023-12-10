package br.net.galdino.chain.billsdispenser;

public class Client {

	public static void main(String[] args) {
		Dispenser atm = new Dispenser();
		atm.withDraw(230);
		System.out.println("-----------");
		atm.withDraw(66);
	}
}
