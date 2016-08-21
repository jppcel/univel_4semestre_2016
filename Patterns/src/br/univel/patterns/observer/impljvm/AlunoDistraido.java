package br.univel.patterns.observer.impljvm;

import java.util.Observable;
import java.util.Observer;

/**
 * Aluno � um observer do professor, fica assistindo a aula e absorvendo
 * conhecimento, por�m este aluno � distra�do, ent�o ele recebe a notifica��o
 * que o professor esta em aula, mas n�o presta aten��o
 * 
 * @author Will
 *
 */
public class AlunoDistraido implements Observer {

	private final String nome;

	public AlunoDistraido(final String nome) {
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
	public void update(Observable o, Object arg) {
		if (o instanceof Professor) {
			// Valida��o para garantir que o observable realmente � um professor
			Professor professor = (Professor) o;
			if (professor.emAula()) {
				System.out.println(String.format("%s: Agora ta na aula de java, vou jogar pokemon", getNome()));
			}
		}

	}
}
