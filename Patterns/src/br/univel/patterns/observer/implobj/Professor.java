package br.univel.patterns.observer.implobj;

import java.util.ArrayList;
import java.util.List;

/**
 * Objeto que ser� observado pelo demais, qualquer altera��o de status neste
 * objeto vai resultar em uma notifica��o aos seus observadores
 * 
 * @author Will
 *
 */
public class Professor {

	/**
	 * Lista de observadores do professor
	 */
	final List<ProfessorObserver> observers = new ArrayList<>();

	/**
	 * Possibilita a adi��o de um novo observador ao professor, pode ser
	 * qualquer observador, visto que basta implementar a interface
	 * ProfessorObserver
	 * 
	 * @param observer
	 */
	public void addObservers(ProfessorObserver observer) {
		this.observers.add(observer);
	}

	/**
	 * Notifica os observadores que algo mudou no status do professor
	 */
	protected void notifyObservers() {
		// For para percorrer a lista e notificar todos sobre as altera��es
		for (final ProfessorObserver observer : observers) {
			observer.iniciarAula(this);
		}
	}

	/**
	 * Dar aula � um evento do professor que dispara a��o aos observadores, para
	 * notificar que o professor mudou algo
	 */
	public void darAula() {
		System.out.println(String.format("Professor %s em aula", getNome()));
		notifyObservers();
	}

	/**
	 * Falar � algo que faz o status do professor mudar e notificar os
	 * observadores
	 */
	public void falar() {
		System.out.println(String.format("Professor %s esta falando", getNome()));
		notifyObservers();
	}

	/**
	 * Quando o professor toma esta atitude os observadores devem ser
	 * notificados, pois � poss�vel que alguns deles deve sair da sala
	 */
	public void expulsarAula() {
		System.out.println("S� se n�o estiver prestando aten��o na aula");
		notifyObservers();
	}

	/**
	 * Metodo para informar se o professor esta em aula
	 * 
	 * @return
	 */
	public Boolean emAula() {
		// Retorna true pois um professor sempre esta em aula
		return Boolean.TRUE;
	}

	public String getNome() {
		return "Will";
	}

	public String getMateria() {
		return "Java";
	}
}
