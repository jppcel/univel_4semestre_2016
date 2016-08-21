package br.univel.patterns.builder.complexobject;

import br.univel.patterns.builder.complexobject.embalagem.Embalagem;

/**
 * Representação de um item da refeição, podendo ser alimento ou bebida
 * 
 * @author Will
 *
 */
public interface Item {
	public String getNome();

	public Embalagem getEmbagalem();

	public Float getPreco();
}