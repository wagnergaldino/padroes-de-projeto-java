package br.net.galdino.factory.apple.after.factory;

import br.net.galdino.factory.apple.after.model.IPhone;
import br.net.galdino.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
