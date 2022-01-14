package com.daw.pruebas;

public class Pais {
	public static int numPaises;
	private String nombre;
	private int poblacion;
	
	public Pais() {
		this.nombre = "";
		this.poblacion = 0;
		numPaises++;
	}
	
	public Pais(String nom, int pob){
		this.nombre = nom;
		this.poblacion = pob;
		numPaises++;
	}
	
	public String presentar() {
		String presentaciao = "Presentamos: "+this.nombre+" con población: "+this.poblacion;
		return presentaciao;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		boolean esNumero = false;
		for(int i=0;i<nombre.length()-1;i++) {
			if(Character.isDigit(nombre.charAt(i))) {
				esNumero = true;
				System.out.println("Pa tu casa!");
			}
		}
		
		if(!esNumero) {
			this.nombre = nombre;
		}
	}
	
	// Franc1a

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		if(this.poblacion>0) {
		this.poblacion = poblacion;
		}
	}
	
}
