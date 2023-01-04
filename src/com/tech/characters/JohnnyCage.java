package com.tech.characters;

import com.tech.entities.Guerreiro;

public class JohnnyCage extends Guerreiro {

	public JohnnyCage(String nome, int poderDeAtaque, int vida) {
		super(nome, poderDeAtaque, vida);
	}

	@Override
	public void tirandoVida(Guerreiro guerreiro) {

		guerreiro.setVida(guerreiro.getVida() - getPoderDeAtaque());

	}

	@Override
	public void ataque(Guerreiro guerreiro) {
		tirandoVida(guerreiro);

	}

}
