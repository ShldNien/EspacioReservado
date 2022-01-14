package com.daw.pruebas;

public class Persona {
	
	//ATRIBUTOS
	
	String nombre;
	String situacionLaboral;

	double altura;
	double peso;
	
	byte edad;
	byte ci;
	int longitudPelo;
	final int esperanzaVida = 84;
	
	String[] parejas;
	
	boolean carnetConducir;
	boolean conGafas;
	boolean esMbappe;
	
	//FUNCIONALIDADES
	public void presentacion() {
		System.out.println("Hola, mi nombre es "+this.nombre+" y tengo "+this.edad+" anios");
	}
	
	public void cumplirAnios() {
		//se suma 1 a edad
		this.edad++;
		//a cierta edad se empieza a caer el pelo
		if(!esMbappe && !this.nombre.equals("Luis")) {
			if(this.edad>50) {
				this.longitudPelo--;
			}
		}else{
			if(this.edad>16) {
				this.longitudPelo--;
			}
			
		}
	}
	public void empleo(boolean despedido) {
		if(despedido = true) {
			this.situacionLaboral = "Desempleado";
		}else{
			this.situacionLaboral = "Empleado";
		}
	}
}
