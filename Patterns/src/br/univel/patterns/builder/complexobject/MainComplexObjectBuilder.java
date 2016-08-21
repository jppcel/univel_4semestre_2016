package br.univel.patterns.builder.complexobject;

/**
 * <pre>
 * http://www.devmedia.com.br/utilizando-builders-em-java/29167
 * Utilizado para criação de objetos complexos, tabém é possivel utilizar o padrão Builder para este cenario
 * </pre>
 * 
 * @author Will
 *
 */
public class MainComplexObjectBuilder {

	public static void main(String[] args) {
		// Cria varias refeições completas, como se fosse um combo, é apenas
		// solicitado uma refeição vegetariana e o builder sabe tudo o que
		// precisa criar para que isso aconteça
		RefeicaoBuilder refeicaoBuilder = new RefeicaoBuilder();
		Refeicao vegetariana = refeicaoBuilder.preparaRefeicaoVegetariana();
		System.out.println("Refeição vegetariana");
		vegetariana.showItems();
		System.out.println("Preço total: " + vegetariana.getPreco());
		System.out.println();
		System.out.println();
		Refeicao carnivora = refeicaoBuilder.preparaRefeicaoCarnivora();
		System.out.println("Refeição carnivora");
		carnivora.showItems();
		System.out.println("Preço total: " + carnivora.getPreco());
	}
}