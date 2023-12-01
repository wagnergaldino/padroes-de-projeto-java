package br.net.galdino.adapter.tvport.devices;

import br.net.galdino.adapter.tvport.interfaces.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}
	
}