package br.univel.patterns.observer.implobj;

public class AlunoDedicado implements ProfessorObserver {

	private final String nome;

	public AlunoDedicado(final String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	@Override
	public void iniciarAula(Professor professor) {
		if (professor.emAula()) {
			System.out.println(String.format("%s: Agora não posso jogar pokemon go, tenho aula de java", getNome()));
		}
	}

}
