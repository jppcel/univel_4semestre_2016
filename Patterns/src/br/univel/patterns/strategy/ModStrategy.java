package br.univel.patterns.strategy;

public class ModStrategy extends CalcularStrategy {

	@Override
	public Float calcular(Float valor1, Float valor2) {
		return valor1 % valor2;
	}

}
