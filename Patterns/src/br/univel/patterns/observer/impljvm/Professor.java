package br.univel.patterns.observer.impljvm;

import java.util.Observable;

/**
 * Professor é um objeto observado no nosso sistema, sendo que qualquer
 * alteração no mesmo será notificado todos os seus observadores sobre a
 * alteração. Professor extends {@link Observable} para demonstrar que é
 * possivel fazer observer com o padrão fornecido pelo Java
 * 
 * @author Will
 *
 */
public class Professor extends Observable {

	/**
	 * Dar aula é um evento do professor que dispara ação aos observadores, para
	 * notificar que o professor mudou algo
	 */
	public void darAula() {
		System.out.println(String.format("Professor %s em aula", getNome()));
		// setChanged = marca que o objeto sofreu alteração
		setChanged();
		// notifica os observadores que o objeto teve alteração no seu status
		notifyObservers();
	}

	/**
	 * Falar é algo que faz o status do professor mudar e notificar os
	 * observadores
	 */
	public void falar() {
		System.out.println(String.format("Professor %s esta falando", getNome()));
		// setChanged = marca que o objeto sofreu alteração no seu status
		setChanged();
		// Notifica os observadores que o objeto teve alteração no seu status
		notifyObservers();
	}

	/**
	 * Quando o professor toma esta atitude os observadores devem ser
	 * notificados, pois é possível que alguns deles deve sair da sala
	 */
	public void expulsarAula() {
		System.out.println("Só se não estiver prestando atenção na aula");
		// setChanged = marca que o objeto sofreu alteração no seu status
		setChanged();
		// Notifica os observadores que o objeto teve alteração no seu status
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
