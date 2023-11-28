package br.net.galdino.abstractfactory.apple.factory.abstractfactory;

import br.net.galdino.abstractfactory.apple.model.certificate.Certificate;
import br.net.galdino.abstractfactory.apple.model.certificate.USCertificate;
import br.net.galdino.abstractfactory.apple.model.packing.Packing;
import br.net.galdino.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
