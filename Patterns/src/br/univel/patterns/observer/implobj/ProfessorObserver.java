package br.univel.patterns.observer.implobj;

/**
 * Defini��o do comportamento dos observadores do professor
 * 
 * @author Will
 *
 */
public interface ProfessorObserver {

	/**
	 * Notifica��o de que a aula esta come�ando
	 * 
	 * @param professor
	 */
	void iniciarAula(final Professor professor);
}
