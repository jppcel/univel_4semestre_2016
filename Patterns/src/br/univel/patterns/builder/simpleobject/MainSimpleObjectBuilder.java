package br.univel.patterns.builder.simpleobject;

/**
 * <pre>
 * http://www.devmedia.com.br/utilizando-builders-em-java/29167
 * Possibilita a criação de objeto com muitos parametros de forma simplificada, assim ficando mais legivel a criação dos objetos
 * </pre>
 * 
 * @author Will
 *
 */
public class MainSimpleObjectBuilder {

	public static void main(final String[] args) {
		// Sem builder
		new Pessoa("Santos", "Will", "000", "000", null, null, null, null);
		// Com builder
		final PessoaBuilder builder = new PessoaBuilder();
		builder.setSobrenome("Santos").setNome("Will").setCpf("000").setRg("000");
		builder.build();
	}
}
