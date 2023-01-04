package com.tech.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.tech.application.Partida;
import com.tech.characters.Scorpion;
import com.tech.characters.SubZero;
import com.tech.entities.Guerreiro;
import com.tech.player.Jogador;

class PartidaTest {

	@Test
	void testeVencendorPlayerUm() {
		Guerreiro scorpion = new Scorpion("Scorpion", 3, 10);
		Guerreiro subZero = new SubZero("Sub-Zero", 3, 12);

		Jogador player1 = new Jogador("cris");
		Jogador player2 = new Jogador("dessa");

		Partida partida = new Partida();

		player1.selecionarGuerreiro(subZero);
		player2.selecionarGuerreiro(scorpion);

		Jogador partidaPlayer = partida.iniciarPartidaParaDois(player1, player2);
		
		assertEquals(player1, partidaPlayer);
	}

	@Test
	void testeVencendorPlayerDois() {
		Guerreiro johnnyCage = new Scorpion("Johnny Cage", 3, 2);
		Guerreiro Raiden = new SubZero("Raiden", 3, 10);

		Jogador player1 = new Jogador("cris");
		Jogador player2 = new Jogador("dessa");

		Partida partida = new Partida();

		player1.selecionarGuerreiro(johnnyCage);
		player2.selecionarGuerreiro(Raiden);

		Jogador partidaPlayer = partida.iniciarPartidaParaDois(player1, player2);

		assertEquals(player2, partidaPlayer);
	}

}
