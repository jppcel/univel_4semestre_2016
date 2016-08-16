package br.univel.patterns.observer.impljvm;

import java.util.Observable;

public class Professor extends Observable {

	public void darAula() {
		System.out.println(String.format("Professor %s em aula", getNome()));
		setChanged();
		notifyObservers();
	}

	public void falar() {
		System.out.println(String.format("Professor %s esta falando", getNome()));
		setChanged();
		notifyObservers();
	}

	public void expulsarAula() {
		System.out.println("S� se n�o estiver prestando aten��o na aula");
		setChanged();
		notifyObservers();
	}

	public Boolean emAula() {
		return Boolean.TRUE;
	}

	public String getNome() {
		return "Will";
	}

	public String getMateria() {
		return "Java";
	}
}
