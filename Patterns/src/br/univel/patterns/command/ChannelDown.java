package br.univel.patterns.command;

public class ChannelDown implements Command{

	@Override
	public void execute() {
		System.out.println("Mudando de canal para -");
	}

}
