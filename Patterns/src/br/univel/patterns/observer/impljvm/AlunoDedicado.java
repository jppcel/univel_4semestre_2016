package br.univel.patterns.observer.impljvm;

import java.util.Observable;
import java.util.Observer;

public class AlunoDedicado implements Observer {

	private final String nome;

	public AlunoDedicado(final String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Professor) {
			Professor professor = (Professor) o;
			if (professor.emAula()) {
				System.out
						.println(String.format("%s: Agora não posso jogar pokemon go, tenho aula de java", getNome()));
			}
		}

	}

}
