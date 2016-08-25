package br.univel.patterns.command;

/**
 * Cada comando sabe como deve executar a sua ação, quando invocado ele vai
 * disparar sua a ação
 * 
 * @author wcsantos
 *
 */
public class ChannelUp implements Command {

	@Override
	public void execute() {
		System.out.println("Mudando de canal para +");
	}

}
