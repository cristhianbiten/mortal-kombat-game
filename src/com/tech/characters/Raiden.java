package com.tech.characters;

import com.tech.entities.Guerreiro;

public class Raiden extends Guerreiro {

	private static final int POTENCIA_ATAQUE = 2;

	public Raiden(String nome, int poderDeAtaque, int vida) {
		super(nome, poderDeAtaque, vida);
	}

	public void especial(Guerreiro guerreiro) {
		guerreiro.setVida(guerreiro.getVida() - POTENCIA_ATAQUE * getPoderDeAtaque());
	}

	@Override
	public void tirandoVida(Guerreiro guerreiro) {

		guerreiro.setVida(guerreiro.getVida() - getPoderDeAtaque());
	}

	@Override
	public void ataque(Guerreiro guerreiro) {
		if (guerreiro.getVida() >= 1 && guerreiro.getVida() <= 2) {
			especial(guerreiro);
		} else {
			tirandoVida(guerreiro);
		}
	}

}
