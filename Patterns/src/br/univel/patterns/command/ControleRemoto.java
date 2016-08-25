package br.univel.patterns.command;

public class ControleRemoto {

	private Command command;
	
	public ControleRemoto(){
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executaAcao(){
		this.command.execute();
	}
}
