package com.tech.player;

import com.tech.entities.Guerreiro;

public class Jogador {

	private String name;
	private Guerreiro guerreiro;

	public Jogador(String name) {
		this.name = name;
	}

	public void selecionarGuerreiro(Guerreiro guerreiro) {
		this.guerreiro = guerreiro;

	}
	
	public Guerreiro getGuerreiro() {
		return guerreiro;
	}
	
	public String getName() {
		return name;
	}
}
