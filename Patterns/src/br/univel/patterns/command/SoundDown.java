package br.univel.patterns.command;

public class SoundDown implements Command{

	@Override
	public void execute() {
		System.out.println("Diminuindo o volume --");
	}

}
