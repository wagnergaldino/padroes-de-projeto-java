package br.net.galdino.decorator.coffeshop.model.decorators;

import br.net.galdino.decorator.coffeshop.model.Drink;

public abstract class DrinkDecorator implements Drink {
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}
