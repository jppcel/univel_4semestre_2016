package br.univel.patterns.command;

/**
 * Executa ações, mesmo sem saber qual a ação que será executada. O command é
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
