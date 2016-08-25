package br.univel.patterns.command;

/**
 * <pre>
 * http://www.devmedia.com.br/padrao-de-projeto-command-em-java/26456
 * O Padrão Command tem como definição encapsular uma solicitação como um objeto, o que lhe permite parametrizar outros objetos com diferentes solicitações, enfileirar ou registrar solicitações e implementar recursos de cancelamento de operações.
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
