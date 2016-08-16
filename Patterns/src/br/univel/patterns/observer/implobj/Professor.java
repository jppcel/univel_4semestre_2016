package br.univel.patterns.observer.implobj;

import java.util.ArrayList;
import java.util.List;

public class Professor {

	final List<ProfessorObserver> observers = new ArrayList<>();

	public void addObservers(ProfessorObserver observer) {
		this.observers.add(observer);
	}

	public void notifyObservers() {
		for (final ProfessorObserver observer : observers) {
			observer.iniciarAula(this);
		}
	}

	public void darAula() {
		System.out.println(String.format("Professor %s em aula", getNome()));
		notifyObservers();
	}

	public void falar() {
		System.out.println(String.format("Professor %s esta falando", getNome()));
		notifyObservers();
	}

	public void expulsarAula() {
		System.out.println("Só se não estiver prestando atenção na aula");
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
