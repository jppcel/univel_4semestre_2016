package br.univel.patterns.strategy;

public class MainStrategy {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		Float result = calculadora.calcular(1F, 2F, 
				new SomaStrategy());
		System.out.println(result);
	}
	
}
