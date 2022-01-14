package com.daw.pruebas;

import java.util.ArrayList;

public class Ataque{
	String tipo,nombre;
	int danio;
	
	public Ataque() {
		this.nombre = "";
		this.tipo = "";
		this.danio = 0;
	}
	
	public Ataque(String nombre, String tipo, int danio) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.danio = danio;
	}	
	public static void asignAtaque(ArrayList<Ataque> atks, Ataque ataque) {
		atks.add(ataque);
	}
}