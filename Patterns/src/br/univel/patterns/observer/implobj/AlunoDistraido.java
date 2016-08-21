package br.univel.patterns.observer.implobj;

/**
 * Aluno � um observer do professor, fica assistindo a aula e absorvendo
 * conhecimento, por�m este aluno � distra�do, ent�o ele recebe a notifica��o
 * que o professor esta em aula, mas n�o presta aten��o
 * 
 * @author Will
 *
 */
public class AlunoDistraido implements ProfessorObserver {

	private final String nome;

	public AlunoDistraido(final String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	/**
	 * Metodo � chamado quando o professor sofre qualquer altera��o no seu
	 * status
	 * 
	 */
	@Override
	public void iniciarAula(Professor professor) {
		// N�o � preciso verificar se o objeto � do tipo professor, pois para
		// este caso o objeto j� � tipado
		if (professor.emAula()) {
			System.out.println(String.format("%s: Agora ta na aula de java, vou jogar pokemon", getNome()));
		}
	}
}
