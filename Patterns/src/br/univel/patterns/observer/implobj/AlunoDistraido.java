package br.univel.patterns.observer.implobj;

/**
 * Aluno é um observer do professor, fica assistindo a aula e absorvendo
 * conhecimento, porém este aluno é distraído, então ele recebe a notificação
 * que o professor esta em aula, mas não presta atenção
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
	 * Metodo é chamado quando o professor sofre qualquer alteração no seu
	 * status
	 * 
	 */
	@Override
	public void iniciarAula(Professor professor) {
		// Não é preciso verificar se o objeto é do tipo professor, pois para
		// este caso o objeto já é tipado
		if (professor.emAula()) {
			System.out.println(String.format("%s: Agora ta na aula de java, vou jogar pokemon", getNome()));
		}
	}
}
