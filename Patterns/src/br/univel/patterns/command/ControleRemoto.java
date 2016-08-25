package br.univel.patterns.command;

/**
 * Executa a��es, mesmo sem saber qual a a��o que ser� executada. O command �
 * passado por parametro para o controle e este executa o comando
 * 
 * @author wcsantos
 *
 */
public class ControleRemoto {

	private Command command;

	public ControleRemoto() {
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void executaAcao() {
		this.command.execute();
	}
}
