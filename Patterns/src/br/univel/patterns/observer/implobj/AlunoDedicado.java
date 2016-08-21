package br.univel.patterns.observer.implobj;

import java.util.Observable;

/**
 * Aluno é um observer do professor, fica assistindo a aula e absorvendo
 * conhecimento, porém este aluno é dedicado, então ele recebe a notificação que
 * o professor esta em aula, e larga o celular para prestar atenção
 * 
 * @author Will
 *
 */
public class AlunoDedicado implements ProfessorObserver {

	private final String nome;

	public AlunoDedicado(final String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	/**
	 * Método é chamado após o professor chamar o
	 * {@link Observable#notifyObservers()}
	 */
	@Override
	public void iniciarAula(Professor professor) {
		if (professor.emAula()) {
			// Validação para garantir que o observable realmente é um professor
			System.out.println(String.format("%s: Agora não posso jogar pokemon go, tenho aula de java", getNome()));
		}
	}

}
