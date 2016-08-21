package br.univel.patterns.singleton;

/**
 * <pre>
 * http://www.devmedia.com.br/padrao-de-projeto-singleton-em-java/26392 
 * Padr�o singleton garante que apenas uma instancia desta classe estar� em mem�ria e fornece um ponto global de acesso
 * Implementa��o de exemplo do padr�o singleton, neste caso o {@link Singleton} pode executar apenas uma a��o por vez, fizemos toda a l�gica para garantir isso, o padr�o Singleton por ter apenas um objeto faz com que todos fa�am acesso sempre ao mesmo objeto, ent�o � necess�rio ter muito cuidado com a implementa��o deste padr�o
 * 
 * </pre>
 *
 * Executor para demonstrar o padr�o singleton
 * 
 * @author Will
 *
 */
public class MainSingleton {

	public static void main(final String[] args) {
		// A instancia1 recupera o singleton para trabalhar com ele
		final Singleton instancia1 = Singleton.getInstancia();
		instancia1.executarAcao();
		// Ao recuperar a instancia2, na verdade ser� a mesma da instancia1,
		// pois ele foi criado na instancia1, ent�o estar�o trabalhando com o
		// mesmo objeto
		final Singleton instancia2 = Singleton.getInstancia();
		instancia2.executarAcao();
		instancia1.acaoConcluida();
		instancia2.acaoConcluida();
	}
}
