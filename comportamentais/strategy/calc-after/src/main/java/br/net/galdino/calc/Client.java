package br.net.galdino.calc;

import br.net.galdino.calc.strategies.AdditionOperation;
import br.net.galdino.calc.strategies.DivisionOperation;
import br.net.galdino.calc.strategies.MultiplicationOperation;
import br.net.galdino.calc.strategies.SubtractionOperation;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AdditionOperation()));
		System.out.println(calc.getResult(new SubtractionOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));
	}
}