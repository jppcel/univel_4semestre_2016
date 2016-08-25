package br.univel.patterns.command;

/**
 * Cada comando sabe como deve executar a sua a��o, quando invocado ele vai
 * disparar sua a a��o
 * 
 * @author wcsantos
 *
 */
public class SoundDown implements Command{

	@Override
	public void execute() {
		System.out.println("Diminuindo o volume --");
	}

}
