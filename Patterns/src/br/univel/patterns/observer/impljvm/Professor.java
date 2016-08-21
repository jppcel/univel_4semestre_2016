package br.univel.patterns.observer.impljvm;

import java.util.Observable;

/**
 * Professor � um objeto observado no nosso sistema, sendo que qualquer
 * altera��o no mesmo ser� notificado todos os seus observadores sobre a
 * altera��o. Professor extends {@link Observable} para demonstrar que �
 * possivel fazer observer com o padr�o fornecido pelo Java
 * 
 * @author Will
 *
 */
public class Professor extends Observable {

	/**
	 * Dar aula � um evento do professor que dispara a��o aos observadores, para
	 * notificar que o professor mudou algo
	 */
	public void darAula() {
		System.out.println(String.format("Professor %s em aula", getNome()));
		// setChanged = marca que o objeto sofreu altera��o
		setChanged();
		// notifica os observadores que o objeto teve altera��o no seu status
		notifyObservers();
	}

	/**
	 * Falar � algo que faz o status do professor mudar e notificar os
	 * observadores
	 */
	public void falar() {
		System.out.println(String.format("Professor %s esta falando", getNome()));
		// setChanged = marca que o objeto sofreu altera��o no seu status
		setChanged();
		// Notifica os observadores que o objeto teve altera��o no seu status
		notifyObservers();
	}

	/**
	 * Quando o professor toma esta atitude os observadores devem ser
	 * notificados, pois � poss�vel que alguns deles deve sair da sala
	 */
	public void expulsarAula() {
		System.out.println("S� se n�o estiver prestando aten��o na aula");
		// setChanged = marca que o objeto sofreu altera��o no seu status
		setChanged();
		// Notifica os observadores que o objeto teve altera��o no seu status
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
