package br.univel.patterns.decorator;

import java.math.BigDecimal;

/**
 * NÃO É PADRÃO DECORATOR
 * http://www.tutorialspoint.com/design_pattern/null_object_pattern.htm
 * Utilizado para não retorna null, assim evitando {@link NullPointerException},
 * porém nenhuma ação desta classe de executar qualquer calculo ou processamento
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
