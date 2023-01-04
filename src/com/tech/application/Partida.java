package com.tech.application;

import com.tech.player.Jogador;

public class Partida {

	public Jogador iniciarPartidaParaDois(Jogador player1, Jogador player2) {

		while (player1.getGuerreiro().hasLife() && player2.getGuerreiro().hasLife()) {
			player1.getGuerreiro().ataque(player2.getGuerreiro());

			if (player2.getGuerreiro().hasLife()) {
				player2.getGuerreiro().ataque(player1.getGuerreiro());
			}

		}

		if (player1.getGuerreiro().hasLife()) {
			return player1;
		} else {
			return player2;
		}

	}
}
