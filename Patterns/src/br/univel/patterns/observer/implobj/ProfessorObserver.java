package br.univel.patterns.observer.implobj;

/**
 * Definição do comportamento dos observadores do professor
 * 
 * @author Will
 *
 */
public interface ProfessorObserver {

	/**
	 * Notificação de que a aula esta começando
	 * 
	 * @param professor
	 */
	void iniciarAula(final Professor professor);
}
