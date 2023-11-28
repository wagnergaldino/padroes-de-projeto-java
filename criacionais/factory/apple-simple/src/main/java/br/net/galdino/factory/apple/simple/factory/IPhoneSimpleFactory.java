package br.net.galdino.factory.apple.simple.factory;

import br.net.galdino.factory.apple.simple.model.IPhone;
import br.net.galdino.factory.apple.simple.model.IPhone11;
import br.net.galdino.factory.apple.simple.model.IPhone11Pro;
import br.net.galdino.factory.apple.simple.model.IPhoneX;
import br.net.galdino.factory.apple.simple.model.IPhoneXSMax;

public class IPhoneSimpleFactory {

	public static IPhone orderIPhone(String generation, String level) {
		IPhone device = null;

		if ("X".equals(generation)) {
			if ("standard".equals(level)) {
				device = new IPhoneX();
			} else if ("highEnd".equals(level)) {
				device = new IPhoneXSMax();
			}
		} else if ("11".equals(generation)) {
			if ("standard".equals(level)) {
				device = new IPhone11();
			} else if ("highEnd".equals(level)) {
				device = new IPhone11Pro();
			}
		}

		if(device != null) {
			device.getHardware();
			device.assemble();
			device.certificates();
			device.pack();
		}
		
		return device;
	}
}
