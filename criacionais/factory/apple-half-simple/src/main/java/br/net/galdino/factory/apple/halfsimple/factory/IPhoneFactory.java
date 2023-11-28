package br.net.galdino.factory.apple.halfsimple.factory;

import br.net.galdino.factory.apple.halfsimple.model.IPhone;

public abstract class IPhoneFactory {

	public IPhone orderIPhone(String level) {
		IPhone device = null;
		
		device = createIPhone(level);
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhone createIPhone(String level);
}
