package br.net.galdino.worker.jobs;

import br.net.galdino.worker.strategies.eat.VeggieFoodStrategy;
import br.net.galdino.worker.strategies.transportation.BikeStrategy;
import br.net.galdino.worker.strategies.work.DeveloperStrategy;

public class HispsterDeveloper implements Worker {

	@Override
	public void eat() {
		new VeggieFoodStrategy().eat();
	}

	@Override
	public void move() {
		new BikeStrategy().move();
	}

	@Override
	public void work() {
		new DeveloperStrategy().work();
	}

}