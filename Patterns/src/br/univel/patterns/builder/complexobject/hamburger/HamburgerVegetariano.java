package br.univel.patterns.builder.complexobject.hamburger;

public class HamburgerVegetariano extends Hamburger {

	@Override
	public Float getPreco() {
		return 15.0f;
	}

	@Override
	public String getNome() {
		return "Hamburger vegetariano";
	}
}