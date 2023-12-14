package br.net.galdino.worker.jobs;

import br.net.galdino.worker.strategies.eat.MeatFoodStrategy;
import br.net.galdino.worker.strategies.transportation.AirplaneStrategy;
import br.net.galdino.worker.strategies.work.PilotStrategy;

public class Pilot implements Worker {

	@Override
	public void eat() {
		new MeatFoodStrategy().eat();
	}

	@Override
	public void move() {
		new AirplaneStrategy().move();
	}

	@Override
	public void work() {
		new PilotStrategy().work();
	}

}