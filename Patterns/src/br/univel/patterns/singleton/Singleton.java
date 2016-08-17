package br.univel.patterns.singleton;

public class Singleton {

	private Boolean executaAcao = false;
	private static Singleton instancia;

	private Singleton() {
	}

	public static Singleton getInstancia() {
		if (instancia == null) {
			System.out.println("Singleton ainda n�o iniciado, iniciando nova instancia");
			instancia = new Singleton();
		} else {
			System.out.println("Singleton j� iniciado, n�o ser� iniciado uma nova instancia");
		}
		return instancia;
	}

	public void executarAcao() {
		if (!executaAcao) {
			executaAcao = true;
		} else {
			System.out.println("Singleton j� esta em uso, aguarde para utilizar novamente");
		}
	}

	public void acaoConcluida() {
		if (executaAcao) {
			executaAcao = false;
		} else {
			System.out.println("N�o existia a��o em execu��o");
		}
	}
}
