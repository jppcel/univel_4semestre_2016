package br.univel.patterns.singleton;

/**
 * <pre>
 * http://www.devmedia.com.br/padrao-de-projeto-singleton-em-java/26392 
 * Padr�o singleton garante que apenas uma instancia desta classe estar� em mem�ria e fornece um ponto global de acesso
 * Implementa��o de exemplo do padr�o singleton, neste caso o {@link Singleton} pode executar apenas uma a��o por vez, fizemos toda a l�gica para garantir isso, o padr�o Singleton por ter apenas um objeto faz com que todos fa�am acesso sempre ao mesmo objeto, ent�o � necess�rio ter muito cuidado com a implementa��o deste padr�o
 * 
 * </pre>
 * 
 * @author Will
 *
 */
public class Singleton {

	/**
	 * Flag para marcar se o singleton esta em execu��o
	 */
	private Boolean executaAcao = false;
	/**
	 * Instancia do singleton que ser� retornada para os demais objetos que
	 * desejarem este singleton
	 */
	private static Singleton instancia;

	/**
	 * Construtor privado � uma caracteristica do padr�o singleton, assim
	 * conseguimos garantir que nenhum outro objeto chama este construtor
	 */
	private Singleton() {
	}

	/**
	 * M�todo getInstancia � o respons�vel por retorna a instancia do singleton
	 * a todos os outros objetos que soliciatarem uma instancia deste
	 * 
	 * @return
	 */
	public static Singleton getInstancia() {
		// Valida que o singleton ainda n�o tenha sido iniciado e inicia o
		// mesmo, isso acontece apenas uma vez, devido a vari�vel instancia ser
		// static
		if (instancia == null) {
			System.out.println("Singleton ainda n�o iniciado, iniciando nova instancia");
			instancia = new Singleton();
		} else {
			System.out.println("Singleton j� iniciado, n�o ser� iniciado uma nova instancia");
		}
		return instancia;
	}

	/**
	 * Inicia a execu��o de uma a��o dentro do singleton
	 */
	public void executarAcao() {
		if (!executaAcao) {
			executaAcao = true;
		} else {
			System.out.println("Singleton j� esta em uso, aguarde para utilizar novamente");
		}
	}

	/**
	 * Conclui a execu��o no singleton
	 */
	public void acaoConcluida() {
		if (executaAcao) {
			executaAcao = false;
		} else {
			System.out.println("N�o existia a��o em execu��o");
		}
	}
}
