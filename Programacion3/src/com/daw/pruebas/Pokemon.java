package segundotrim;

import java.util.ArrayList;

public class Pokemon {

	String nombre;
	static int numPokemon;
	Tipo tipo;
	double vida, fuerza;
	ArrayList<Ataque> ataques;

	public Pokemon() {
		numPokemon++;
	}

	public Pokemon(String nombre, Tipo tipo, double vida, double fuerza) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
		this.fuerza = fuerza;

		numPokemon++;
	}

	public void recibirAtaque(Ataque ataque) {

		this.vida = this.vida - (ataque.danio * (this.tipo.debilidades.get(ataque.tipo)));
	}

	public void cuatroAtaques(Ataque atk, Ataque atk2, Ataque atk3, Ataque atk4) {

		this.ataques = new ArrayList<Ataque>();
		this.ataques.add(atk);
		this.ataques.add(atk2);
		this.ataques.add(atk3);
		this.ataques.add(atk4);

	}
	
	
}