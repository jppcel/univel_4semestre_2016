package br.univel.patterns.singleton;

/**
 * <pre>
 * http://www.devmedia.com.br/padrao-de-projeto-singleton-em-java/26392 
 * Padrão singleton garante que apenas uma instancia desta classe estará em memória e fornece um ponto global de acesso
 * Implementação de exemplo do padrão singleton, neste caso o {@link Singleton} pode executar apenas uma ação por vez, fizemos toda a lógica para garantir isso, o padrão Singleton por ter apenas um objeto faz com que todos façam acesso sempre ao mesmo objeto, então é necessário ter muito cuidado com a implementação deste padrão
 * 
 * </pre>
 *
 * Executor para demonstrar o padrão singleton
 * 
 * @author Will
 *
 */
public class MainSingleton {

	public static void main(final String[] args) {
		// A instancia1 recupera o singleton para trabalhar com ele
		final Singleton instancia1 = Singleton.getInstancia();
		instancia1.executarAcao();
		// Ao recuperar a instancia2, na verdade será a mesma da instancia1,
		// pois ele foi criado na instancia1, então estarão trabalhando com o
		// mesmo objeto
		final Singleton instancia2 = Singleton.getInstancia();
		instancia2.executarAcao();
		instancia1.acaoConcluida();
		instancia2.acaoConcluida();
	}
}
