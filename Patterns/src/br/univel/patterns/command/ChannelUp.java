package br.univel.patterns.command;

public class ChannelUp implements Command {

	@Override
	public void execute() {
		System.out.println("Mudando de canal para +");
	}

}
