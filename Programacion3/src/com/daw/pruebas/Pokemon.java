package com.daw.pruebas;

import java.util.ArrayList;

public class Pokemon {
	
	
	String nombre;
	static int numPokemon;
	Tipo tipo;
	double vida,fuerza;
	ArrayList<Ataque> ataques;
	
	public Pokemon() {
		numPokemon++;
	}
	
	public Pokemon(String nombre, Tipo tipo, double vida, double fuerza) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
		this.fuerza = fuerza;
		
		cuatroAtaques(null, null, null, null);
		
		numPokemon++;
	}

	public void recibirAtaque(Ataque ataque) {
		
		this.vida = this.vida - (ataque.danio*(this.tipo.debilidades.get(ataque.tipo)));
	}
	
	public void cuatroAtaques(Ataque atk, Ataque atk2, Ataque atk3, Ataque atk4) {
		
		Ataque.asignAtaque(ataques,atk);
		Ataque.asignAtaque(ataques,atk2);
		Ataque.asignAtaque(ataques,atk3);
		Ataque.asignAtaque(ataques,atk4);

	}
}