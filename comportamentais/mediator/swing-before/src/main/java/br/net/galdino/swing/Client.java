package br.net.galdino.swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import br.net.galdino.swing.components.AddButton;
import br.net.galdino.swing.components.Label;
import br.net.galdino.swing.components.ResetButton;
import br.net.galdino.swing.components.State;

public class Client {
	private AddButton button;
	private ResetButton reset;
	private Label label;
	private State state;
	
	public Client() {
		state = new State();
		label = new Label(state);
		button = new AddButton(state, label);
		reset = new ResetButton(state, label, button);
	}

	public void run() {
		JFrame frame = new JFrame();  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JLabel title = new JLabel("Counter");
		frame.add(title, BorderLayout.NORTH);

		frame.add(reset, BorderLayout.WEST);
		frame.add(button, BorderLayout.CENTER);
		frame.add(label, BorderLayout.SOUTH);
		
		frame.setSize(400,200);  
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Client().run();
	}
}