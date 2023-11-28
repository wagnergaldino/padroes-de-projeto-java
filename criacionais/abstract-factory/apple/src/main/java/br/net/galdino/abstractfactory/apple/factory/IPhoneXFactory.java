package br.net.galdino.abstractfactory.apple.factory;

import br.net.galdino.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.net.galdino.abstractfactory.apple.model.iphone.IPhone;
import br.net.galdino.abstractfactory.apple.model.iphone.IPhoneX;
import br.net.galdino.abstractfactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
