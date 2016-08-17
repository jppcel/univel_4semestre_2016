package br.univel.patterns.singleton;

public class MainSingleton {

	public static void main(final String[] args) {
		final Singleton instancia1 = Singleton.getInstancia();
		instancia1.executarAcao();
		final Singleton instancia2 = Singleton.getInstancia();
		instancia2.executarAcao();
		instancia1.acaoConcluida();
		instancia2.acaoConcluida();
	}
}
