package br.net.galdino.headphone.states;

import br.net.galdino.headphone.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}