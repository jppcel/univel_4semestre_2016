package br.univel.patterns.builder.complexobject;

/**
 * <pre>
 * http://www.devmedia.com.br/utilizando-builders-em-java/29167
 * Utilizado para cria��o de objetos complexos, tab�m � possivel utilizar o padr�o Builder para este cenario
 * </pre>
 * 
 * @author Will
 *
 */
public class MainComplexObjectBuilder {

	public static void main(String[] args) {
		// Cria varias refei��es completas, como se fosse um combo, � apenas
		// solicitado uma refei��o vegetariana e o builder sabe tudo o que
		// precisa criar para que isso aconte�a
		RefeicaoBuilder refeicaoBuilder = new RefeicaoBuilder();
		Refeicao vegetariana = refeicaoBuilder.preparaRefeicaoVegetariana();
		System.out.println("Refei��o vegetariana");
		vegetariana.showItems();
		System.out.println("Pre�o total: " + vegetariana.getPreco());
		System.out.println();
		System.out.println();
		Refeicao carnivora = refeicaoBuilder.preparaRefeicaoCarnivora();
		System.out.println("Refei��o carnivora");
		carnivora.showItems();
		System.out.println("Pre�o total: " + carnivora.getPreco());
	}
}