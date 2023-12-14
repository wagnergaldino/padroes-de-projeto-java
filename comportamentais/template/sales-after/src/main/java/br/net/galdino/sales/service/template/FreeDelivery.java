package br.net.galdino.sales.service.template;

import br.net.galdino.sales.model.Cart;

public class FreeDelivery extends BestOfferTemplate {

	public FreeDelivery(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isAppliable() {
		return regularItemsPrice > 500;
	}

	@Override
	protected void calibrateVariables() {
		deliveryFactor = 0d;
	}

}