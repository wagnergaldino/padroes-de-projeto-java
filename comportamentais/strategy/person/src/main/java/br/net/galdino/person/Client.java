package br.net.galdino.person;

import br.net.galdino.person.strategies.eat.MeatFoodStrategy;
import br.net.galdino.person.strategies.eat.VeggieFoodStrategy;
import br.net.galdino.person.strategies.transportation.AirplaneStrategy;
import br.net.galdino.person.strategies.transportation.BikeStrategy;
import br.net.galdino.person.strategies.transportation.CarStrategy;
import br.net.galdino.person.strategies.transportation.WalkStrategy;
import br.net.galdino.person.strategies.work.DeveloperStrategy;
import br.net.galdino.person.strategies.work.NoWorkStrategy;
import br.net.galdino.person.strategies.work.PilotStrategy;

public class Client {

	public static void presentYourself(Person person) {
		System.out.println("Hi, I'm " + person.getName());
		person.eat();
		person.move();
		person.work();
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Person jhon = new Person("Jhon", new MeatFoodStrategy(), 
				new CarStrategy(), new DeveloperStrategy());
		presentYourself(jhon);
		
		Person ann = new Person("Ann", new MeatFoodStrategy(), 
				new AirplaneStrategy(), new PilotStrategy());
		presentYourself(ann);
		
		Person carol = new Person("Carol", new VeggieFoodStrategy(), 
				new BikeStrategy(), new DeveloperStrategy());
		presentYourself(carol);
		
		Person alan = new Person("Alan", new VeggieFoodStrategy(), 
				new WalkStrategy(), new NoWorkStrategy());
		presentYourself(alan);
	}
}