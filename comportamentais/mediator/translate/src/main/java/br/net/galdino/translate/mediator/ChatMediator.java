package br.net.galdino.translate.mediator;

import br.net.galdino.translate.model.User;

public class ChatMediator extends Mediator {

	public String getMessage(String message, User to, User from) {
		return message;
	}
}