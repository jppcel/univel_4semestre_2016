package br.univel.duelo.arma;

import java.util.Objects;

public class ArmaFactory {

	public Arma create(TipoArma tipo) {
		Objects.requireNonNull(tipo, "Tipo cannot be null");
		switch (tipo) {
		case LONGA:
			return new Rifle();
		case CURTA:
			return new Pistola();
		default:
			throw new RuntimeException("Tipo de arma desconhecido");
		}
	}
}
