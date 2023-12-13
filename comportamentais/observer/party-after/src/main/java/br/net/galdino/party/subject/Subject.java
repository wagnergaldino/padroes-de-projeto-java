package br.net.galdino.party.subject;

import java.util.ArrayList;
import java.util.List;

import br.net.galdino.party.observers.Observer;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();

	public void add(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers(boolean status) {
		for(Observer o: observers) {
			o.update(status);
		}
	}
}