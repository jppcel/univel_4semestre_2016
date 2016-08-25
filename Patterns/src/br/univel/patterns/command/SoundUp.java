package br.univel.patterns.command;

public class SoundUp implements Command{

	@Override
	public void execute() {
		System.out.println("Aumentando o volume ++");
	}

}
