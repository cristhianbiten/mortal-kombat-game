package com.tech.entities;

public abstract class Guerreiro {
	private String nome;
	private int poderDeAtaque;
	private int vida;

	public Guerreiro(String nome, int poderDeAtaque, int vida) {
		this.nome = nome;
		this.poderDeAtaque = poderDeAtaque;
		this.vida = vida;
	}

	public abstract void tirandoVida(Guerreiro guerreiro);

	public abstract void ataque(Guerreiro guerreiro);

	public int getPoderDeAtaque() {
		return poderDeAtaque;
	}
	
	public boolean hasLife() {
		if(getVida() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

}
