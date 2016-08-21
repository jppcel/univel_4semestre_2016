package br.univel.patterns.observer.implobj;

import java.util.Observable;

/**
 * Aluno � um observer do professor, fica assistindo a aula e absorvendo
 * conhecimento, por�m este aluno � dedicado, ent�o ele recebe a notifica��o que
 * o professor esta em aula, e larga o celular para prestar aten��o
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
	 * M�todo � chamado ap�s o professor chamar o
	 * {@link Observable#notifyObservers()}
	 */
	@Override
	public void iniciarAula(Professor professor) {
		if (professor.emAula()) {
			// Valida��o para garantir que o observable realmente � um professor
			System.out.println(String.format("%s: Agora n�o posso jogar pokemon go, tenho aula de java", getNome()));
		}
	}

}
