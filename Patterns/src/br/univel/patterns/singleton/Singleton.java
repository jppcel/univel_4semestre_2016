package br.univel.patterns.singleton;

public class Singleton {

	private Boolean executaAcao = false;
	private static Singleton instancia;

	private Singleton() {
	}

	public static Singleton getInstancia() {
		if (instancia == null) {
			System.out.println("Singleton ainda não iniciado, iniciando nova instancia");
			instancia = new Singleton();
		} else {
			System.out.println("Singleton já iniciado, não será iniciado uma nova instancia");
		}
		return instancia;
	}

	public void executarAcao() {
		if (!executaAcao) {
			executaAcao = true;
		} else {
			System.out.println("Singleton já esta em uso, aguarde para utilizar novamente");
		}
	}

	public void acaoConcluida() {
		if (executaAcao) {
			executaAcao = false;
		} else {
			System.out.println("Não existia ação em execução");
		}
	}
}
