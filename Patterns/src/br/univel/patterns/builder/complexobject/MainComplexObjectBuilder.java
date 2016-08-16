package br.univel.patterns.builder.complexobject;

public class MainComplexObjectBuilder {

	public static void main(String[] args) {
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