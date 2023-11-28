package br.net.galdino.factory.apple.after.factory;

import br.net.galdino.factory.apple.after.model.IPhone;
import br.net.galdino.factory.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
