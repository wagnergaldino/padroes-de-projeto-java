package br.net.galdino.abstractfactory.apple.factory.abstractfactory;

import br.net.galdino.abstractfactory.apple.model.certificate.BrazilianCertificate;
import br.net.galdino.abstractfactory.apple.model.certificate.Certificate;
import br.net.galdino.abstractfactory.apple.model.packing.BrazilianPacking;
import br.net.galdino.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
