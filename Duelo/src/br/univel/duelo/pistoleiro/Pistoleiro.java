package br.univel.duelo.pistoleiro;

/**
 * Representa um pistoleiro no nosso joguinho com as a��es b�sicas deste, sendo
 * atirar e defender tiro
 * 
 * @author Will
 *
 */
public interface Pistoleiro {

	/**
	 * Retorna o nome que foi dado ao pistoleiro
	 * 
	 * @return
	 */
	String getNome();

	/**
	 * Faz o disparo do pistoleiro, o disparo � baseado na for�a que um tiro
	 * pode ter, sendo de 0 .. 100
	 * 
	 * @return for�a que o tira tem
	 */
	Float atirar();

	/**
	 * Utilizado pelo pistoleiro para defender um tiro disparado pelo outro, a
	 * for�a do tiro � subtraida da vida do pistoleiro
	 * 
	 * @param tiro
	 */
	Pistoleiro defenderTiro(Float tiro);

	/**
	 * Informa se o pistoleiro esta vivo
	 * 
	 * @return true para vivo e false para morto
	 */
	Boolean estaVivo();

}
