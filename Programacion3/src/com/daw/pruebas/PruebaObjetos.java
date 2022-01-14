package com.daw.pruebas;

public class PruebaObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1º Buscar por internet a que corresponde el ascii de los caracteres de un string
		 */
		String prueba = new String("telefono");
		System.out.println(prueba);
		
		Persona mbappe = new Persona();
		mbappe.nombre = "Kilyan";
		mbappe.edad = 24;
		mbappe.longitudPelo = 1;
		
		mbappe.presentacion();
		
		for (int i=mbappe.edad;i<50;i++) {
			mbappe.cumplirAnios();
		}
		
		mbappe.presentacion();
		System.out.println("Mi pelo mide "+mbappe.longitudPelo);
		
		mbappe.cumplirAnios();
		System.out.println("Mi pelo mide "+mbappe.longitudPelo);

		Persona simba = new Persona();
		Boolean empleoConseguido = true;
		simba.nombre = "Simba";
		simba.edad = 11;
		simba.peso = 45;
		simba.parejas = new String[] {"nombreNovia"};
		simba.empleo(empleoConseguido);
		simba.presentacion();
		/*
		 * actividad clase
		 * 
		 * 1 crear una clase coche
		 * 
		 * 2 buscar en internet crear otras clases furgoneta, todocamino, 4x4
		 * 
		 * 3 realizar herencia entre coche y las demas clases que habeis creado 
		 * 
		 * 4 crear los atributos que creais convenientes(que contenga String..Int..arrays..arraylist..)
		 * 
		 * 5 crear una o dos funcionalidades
		 * 
		 * 6 en otra clase crear e instanciar 2 o 3 objetos de tipo coche
		 * 
		 * 7 dar valores a los atributos de los diferentes objetos
		 * 
		 * 8 llamar a las funcionalidades de vuestros objetos
		 */
	}
}
