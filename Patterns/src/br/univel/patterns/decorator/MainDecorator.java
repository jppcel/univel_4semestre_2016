package br.univel.patterns.decorator;

public class MainDecorator {

	public static void main(final String[] args) {
		Bebida cafe = new NullBebida();
		cafe = new Leite(cafe);
		cafe = new Creme(cafe);
		System.out.println(
				String.format(
						"Agora vou tuma meu %s que ta de R$ %s", 
						cafe.getNome(), 
						cafe.getPreco().toString()));
	}
}
