package br.net.galdino.factory.apple.halfsimple.factory;

import br.net.galdino.factory.apple.halfsimple.model.IPhone;
import br.net.galdino.factory.apple.halfsimple.model.IPhoneX;
import br.net.galdino.factory.apple.halfsimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX();
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax();
		} else return null;
	}

}
