package br.univel.patterns.decorator;

import java.math.BigDecimal;

/**
 * N�O � PADR�O DECORATOR
 * http://www.tutorialspoint.com/design_pattern/null_object_pattern.htm
 * Utilizado para n�o retorna null, assim evitando {@link NullPointerException},
 * por�m nenhuma a��o desta classe de executar qualquer calculo ou processamento
 * 
 * @author wcsantos
 *
 */
public class NullBebida implements Bebida {

	@Override
	public String getNome() {
		return "";
	}

	@Override
	public BigDecimal getPreco() {
		return BigDecimal.ZERO;
	}

	@Override
	public Boolean isAlcolica() {
		return false;
	}

}
