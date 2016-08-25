package br.univel.patterns.command;

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
