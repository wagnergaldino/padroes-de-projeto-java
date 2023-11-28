package br.net.galdino.factory.apple.after.factory;

import br.net.galdino.factory.apple.after.model.IPhone;
import br.net.galdino.factory.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
