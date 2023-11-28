package br.net.galdino.abstractfactory.apple.factory.abstractfactory;

import br.net.galdino.abstractfactory.apple.model.certificate.Certificate;
import br.net.galdino.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
