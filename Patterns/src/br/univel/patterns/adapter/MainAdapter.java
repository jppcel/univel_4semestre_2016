package br.univel.patterns.adapter;

/**
 * <pre>
 * http://www.devmedia.com.br/padrao-de-projeto-adapter-em-java/26467
 * O Padr�o Adapter converte uma interface de uma classe para outra interface que o cliente espera encontrar. O Adaptador permite que classes com interfaces incompat�veis trabalhem juntas
 * </pre>
 * 
 * @author Will
 *
 */
public class MainAdapter {

	public static void main(final String[] args) {
		// Faz a adapta��o necess�rio para que uma tomada de dois pinos receba
		// um conector de tr�s pinos, assim como fazemos no mundo real, ao
		// comprar um adaptador
		ConexaoDoisPino conexao = ConexaoDoisPino.getInstancia();
		conexao.conectar(new ConectorDoisPinoAdapter(new ConectorTresPino()));
		conexao.desconectar();
	}
}
