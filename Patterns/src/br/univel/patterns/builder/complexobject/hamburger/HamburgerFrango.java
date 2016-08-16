package br.univel.patterns.builder.complexobject.hamburger;

public class HamburgerFrango extends Hamburger {

	@Override
	public Float getPreco() {
		return 20.0f;
	}

	@Override
	public String getNome() {
		return "Hamburge de frango";
	}
}