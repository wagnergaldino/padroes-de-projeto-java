package br.net.galdino.factory.apple.after.factory;

import br.net.galdino.factory.apple.after.model.IPhone;

public abstract class IPhoneFactory {

	public IPhone orderIPhone() {
		IPhone device = null;
		
		device = createIPhone();
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhone createIPhone();
}
