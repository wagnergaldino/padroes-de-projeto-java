package br.net.galdino.abstractfactory.apple;

import br.net.galdino.abstractfactory.apple.factory.IPhone11Factory;
import br.net.galdino.abstractfactory.apple.factory.IPhoneFactory;
import br.net.galdino.abstractfactory.apple.factory.IPhoneXFactory;
import br.net.galdino.abstractfactory.apple.factory.abstractfactory.BrazilianRulesAbstractFactory;
import br.net.galdino.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.net.galdino.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
