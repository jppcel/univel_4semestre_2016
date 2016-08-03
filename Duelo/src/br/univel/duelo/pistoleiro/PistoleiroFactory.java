package br.univel.duelo.pistoleiro;

/**
 * Abstract factory para definir como deve ser criado os pistoleiros
 * 
 * @author Will
 *
 */
public interface PistoleiroFactory {

	/**
	 * Define quais os parametros são necessário para criar um pistoleiro
	 * 
	 * @param tipo
	 * @param nome
	 * @return
	 */
	Pistoleiro create(final TipoPistoleiro tipo, final String nome);
}
