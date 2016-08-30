package br.univel.patterns.strategy;

public class Calculadora {

	public Float calcular(Float valor1, 
			Float valor2, 
			CalcularStrategy strategy){
		return strategy.calcular(valor1, valor2);
	}
}
