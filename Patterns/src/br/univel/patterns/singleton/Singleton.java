package br.univel.patterns.singleton;

/**
 * <pre>
 * http://www.devmedia.com.br/padrao-de-projeto-singleton-em-java/26392 
 * Padrão singleton garante que apenas uma instancia desta classe estará em memória e fornece um ponto global de acesso
 * Implementação de exemplo do padrão singleton, neste caso o {@link Singleton} pode executar apenas uma ação por vez, fizemos toda a lógica para garantir isso, o padrão Singleton por ter apenas um objeto faz com que todos façam acesso sempre ao mesmo objeto, então é necessário ter muito cuidado com a implementação deste padrão
 * 
 * </pre>
 * 
 * @author Will
 *
 */
public class Singleton {

	/**
	 * Flag para marcar se o singleton esta em execução
	 */
	private Boolean executaAcao = false;
	/**
	 * Instancia do singleton que será retornada para os demais objetos que
	 * desejarem este singleton
	 */
	private static Singleton instancia;

	/**
	 * Construtor privado é uma caracteristica do padrão singleton, assim
	 * conseguimos garantir que nenhum outro objeto chama este construtor
	 */
	private Singleton() {
	}

	/**
	 * Método getInstancia é o responsável por retorna a instancia do singleton
	 * a todos os outros objetos que soliciatarem uma instancia deste
	 * 
	 * @return
	 */
	public static Singleton getInstancia() {
		// Valida que o singleton ainda não tenha sido iniciado e inicia o
		// mesmo, isso acontece apenas uma vez, devido a variável instancia ser
		// static
		if (instancia == null) {
			System.out.println("Singleton ainda não iniciado, iniciando nova instancia");
			instancia = new Singleton();
		} else {
			System.out.println("Singleton já iniciado, não será iniciado uma nova instancia");
		}
		return instancia;
	}

	/**
	 * Inicia a execução de uma ação dentro do singleton
	 */
	public void executarAcao() {
		if (!executaAcao) {
			executaAcao = true;
		} else {
			System.out.println("Singleton já esta em uso, aguarde para utilizar novamente");
		}
	}

	/**
	 * Conclui a execução no singleton
	 */
	public void acaoConcluida() {
		if (executaAcao) {
			executaAcao = false;
		} else {
			System.out.println("Não existia ação em execução");
		}
	}
}
