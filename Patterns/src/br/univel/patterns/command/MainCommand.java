package br.univel.patterns.command;

/**
 * <pre>
 * http://www.devmedia.com.br/padrao-de-projeto-command-em-java/26456
 * O Padr�o Command tem como defini��o encapsular uma solicita��o como um objeto, o que lhe permite parametrizar outros objetos com diferentes solicita��es, enfileirar ou registrar solicita��es e implementar recursos de cancelamento de opera��es.
 * </pre>
 * 
 * @author wcsantos
 *
 */
public class MainCommand {

	public static void main(final String[] args) {
		new MainCommand().executar(new ChannelDown());
	}

	public void executar(final Command command) {
		final ControleRemoto controle = new ControleRemoto();
		controle.setCommand(command);
		controle.executaAcao();
	}
}
