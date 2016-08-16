package br.univel.patterns.observer.implobj;

public class AlunoDistraido implements ProfessorObserver {

	private final String nome;

	public AlunoDistraido(final String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	@Override
	public void iniciarAula(Professor professor) {
		if (professor.emAula()) {
			System.out.println(String.format("%s: Agora ta na aula de java, vou jogar pokemon", getNome()));
		}
	}
}
