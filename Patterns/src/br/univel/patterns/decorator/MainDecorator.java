package br.univel.patterns.decorator;

/**
 * <pre>
 * http://www.devmedia.com.br/padrao-de-projeto-decorator-em-java/26238
 * O Padrão Decorator anexa responsabilidades adicionais a um objeto dinamicamente. Os decoradores fornecem uma alternativa flexível de subclasse para estender a funcionalidade
 * </pre>
 * 
 * @author wcsantos
 *
 */
public class MainDecorator {

	public static void main(final String[] args) {
		// Fabrica uma bebida com leite e creme, sem mexer na bebida original,
		// apenas decorando a bebida original
		Bebida cafe = new Cafe();
		cafe = new Leite(cafe);
		cafe = new Creme(cafe);
		System.out.println(
				String.format("Agora vou tuma meu %s que ta de R$ %s", cafe.getNome(), cafe.getPreco().toString()));
	}
}
