package br.univel.patterns.observer.impljvm;

import java.util.Observable;
import java.util.Observer;

public class AlunoDistraido implements Observer {

	private final String nome;

	public AlunoDistraido(final String nome) {
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
				System.out.println(String.format("%s: Agora ta na aula de java, vou jogar pokemon", getNome()));
			}
		}

	}
}
