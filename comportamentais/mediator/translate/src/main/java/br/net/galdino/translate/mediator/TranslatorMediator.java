package br.net.galdino.translate.mediator;

import br.net.galdino.translate.model.User;
import br.net.galdino.translate.services.Translator;

public class TranslatorMediator extends Mediator {

	private Translator translator = new Translator();

	protected String getMessage(String message, User to, User from) {
		return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
	}
}