package br.univel.patterns.decorator;

import java.math.BigDecimal;

public interface Bebida {

	String getNome();

	BigDecimal getPreco();

	Boolean isAlcolica();
}
