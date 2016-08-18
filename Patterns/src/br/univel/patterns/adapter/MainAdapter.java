package br.univel.patterns.adapter;

public class MainAdapter {

	public static void main(final String[] args) {
		ConexaoDoisPino conexao = ConexaoDoisPino.getInstancia();
		conexao.conectar(new ConectorDoisPinoAdapter(new ConectorTresPino()));
		conexao.desconectar();
	}
}
