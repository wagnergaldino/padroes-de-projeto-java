package br.net.galdino.worker.jobs;

import br.net.galdino.worker.strategies.eat.MeatFoodStrategy;
import br.net.galdino.worker.strategies.transportation.CarStrategy;
import br.net.galdino.worker.strategies.work.DeveloperStrategy;

public class Developer implements Worker {

	@Override
	public void eat() {
		new MeatFoodStrategy().eat();
	}

	@Override
	public void move() {
		new CarStrategy().move();
	}

	@Override
	public void work() {
		new DeveloperStrategy().work();
	}

}