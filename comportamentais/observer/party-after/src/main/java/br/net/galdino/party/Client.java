package br.net.galdino.party;

import br.net.galdino.party.observers.Friend;
import br.net.galdino.party.observers.Wife;
import br.net.galdino.party.subject.Doorman;

public class Client {

	public static void main(String[] args) {
		Doorman doorman = new Doorman();
		doorman.add(new Wife());
		doorman.add(new Friend());
		
		System.out.println("Husband is comming");
		doorman.setStatus(true);
	}
}