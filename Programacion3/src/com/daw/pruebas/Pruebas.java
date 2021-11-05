package com.daw.pruebas;

import java.util.ArrayList;
import java.util.Scanner;

public class Pruebas {
	public static void main(String[] args) {
		
		//Colecciones
		
		//Los arraylists
		
		//TIPOS DE DATOS QUE ADMITEN LOS ARRAYLISTS (hay m�s)
		//Integer = int
		//Double = double
		//String = String
		//Boolean = boolean
		//Character = char
		
		//ArrayList<tipo de dato que se va a almacenar> nombreVariable = new ArrayList<tipo de dato>();
		//Un arraylist de enteros
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//Un arraylist de double
		ArrayList<Double> arrDoub = new ArrayList<Double>();
		//Un arraylist de Strings donde se van a almacenar los alumnos de una clase
		ArrayList<String> arrStr = new ArrayList<String>();
		//Un arraylist de booleanos
		ArrayList<Boolean> arrBool = new ArrayList<Boolean>();
		
		
		//A mi array de String le voy a a�adir nuevos alumnos
		arrStr.add("Luis");
		arrStr.add("Fran");
		arrStr.add("Sebas");
		arrStr.add("Antonio");
		arrStr.add("Carlos");
		arrStr.add("Roberto");
		arrStr.add("Alba");
		arrStr.add("Joseph");
		arrStr.add("Miguel Angel");
		arrStr.add("Conrado");
		
		System.out.println("Alumnos 1�: "+arrStr);  //Mostramos por pantalla el array list
		
		arrStr.add("Mbapp�"); //A�ado al alumno Mbapp�
		
		System.out.println("Alumnos 1�: "+arrStr);  //Mostramos por pantalla el array list
		
		arrStr.add("CR7"); //A�ado al alumno CR7
		System.out.println("Alumnos 1�: "+arrStr);  //Mostramos por pantalla el array list
		
		//Devuelve la cantidad de elementos que tiene la colecci�n
		int tamano = arrStr.size();
		System.out.println("El tama�o es: "+tamano); //Imprimo por pantalla el tama�o de mi arraylist
		
		//Elimina todos los elementos de una colecci�n
		arrStr.clear();
		
		//Mostramos por pantalla el tama�o de nuestro arraylist
		System.out.println("El tamano es: "+arrStr.size());
		
		//Mostramos por pantalla el array list
		System.out.println("Alumnos 1�: "+arrStr);
		
		//Insertamos elementos en el arraylist
		arrStr.add("Luis");
		arrStr.add("Fran");
		arrStr.add("Sebas");
		arrStr.add("Antonio");
		arrStr.add("Carlos");
		arrStr.add("Roberto");
		arrStr.add("Alba");
		arrStr.add("Joseph");
		arrStr.add("Miguel Angel");
		arrStr.add("Conrado");
		System.out.println("Alumnos 1�: "+arrStr); //Mostramos por pantalla el array list
		
		//Eliminamos lo que contiene la posici�n 7 del arraylist
		System.out.println("Remove");
		arrStr.remove(7);
		
		System.out.println("Alumnos 1�: "+arrStr);  //Mostramos por pantalla el array list
		
		
		//Eliminamos alg�n elemento del arraylist
		System.out.println("Remove a Antonio");
		arrStr.remove("Antonio");
		
		System.out.println("Alumnos 1�: "+arrStr);  //Mostramos por pantalla el array list
		
		
		//Index of -> te devuelve la posici�n de un elemento que nosotros le indicamos
		int posicion = arrStr.indexOf("Fran");
		
		System.out.println("La posici�n de Fran es: "+posicion); //Imprimo por pantalla la posici�n del elemento dado
		
		//Last index of -> te devuelve la �ltima posici�n de un elemento que nosotros le indicamos.
		arrStr.add("Fran"); //A�ado un nuevo alumno
		System.out.println("Alumnos 1�: "+arrStr); //Mostramos por pantalla el array list
		System.out.println("La �ltima posici�n de Fran es: "+arrStr.lastIndexOf("Fran")); //Muestro por pantalla la �ltima posici�n de un elemento que nosotros le indicamos
		
		
		//Llamo a mi m�todo sumatoria
		sumatoria(10);
		
		Alfabeto(0);
	}
	
	
	/**
	 * M�todo que suma dos variables y devuelve el resultado de la suma. Pepito
	 * @param x
	 * @param y
	 * @return
	 */
	public static int sumar(int x, int y) {
		//Sumamos las dos variables que nos vienen por par�metros y las almacenamos en resultado
		int resultado = x+y;
		
		//Devolvemos el resultado de la suma
		return resultado;
	}
	
	
	/**
	 * M�todo que multiplica 3 variables y devuelve el resultado de la multiplicacion
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static int multiplicar(int x, int y, int z) {
		
		int resultado = x*y*z;
		
		return resultado;
	}
	
	
	/**
	 * M�todo que recibe 2 par�metros y devuelve el mayor de esos dos.
	 * @param x
	 * @param y
	 * @return
	 */
	public static int mayorQue(int x, int y) {
		
		int resultado;
		
		if(x>y) {
			resultado = x;
		}else {
			resultado = y;
		}
		return resultado;
	}
	
	
	/**
	 * M�todo que comprueba si un n�mero es cero
	 * @param x
	 * @return true si 0, false si != 0
	 */
	public static boolean esCero(int x) {
		
		boolean esCero = false;
		
		if(x==0) {
			esCero = true;
		}
		
		return esCero;
		
	}
	
	
	/**
	 * M�todo que calcula la suma de todos los elementos de un arraylist
	 * @param num
	 */
	public static void sumatoria(int num) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int numeroParaIntroducir = 0;
		
		//Con este for tendr�a un arraylist relleno de todos los n�meros que quisiera
		for(int i=0; i<num; i++) {
			System.out.println("Introduzca un n�mero al array"); //muestro un mensaje al usuario
			numeroParaIntroducir = scan.nextInt(); //leo por teclado lo que el usuario nos ha dicho
			arr.add(numeroParaIntroducir); //A�ado el elemento a mi arraylist
		}
		
		//Con este for realizar�a la sumatoria de los elementos
		int sumatoria = 0;
		for(int i=0; i<arr.size(); i++) {
			sumatoria += arr.get(i); //Obtengo lo que contiene la posici�n i del arraylist, y lo sumo
		}
		
		System.out.println("La sumatoria es: "+sumatoria);
		
	}
	/*
	CREAR UNA LISTA CON LAS LETRAS DEL ALFABETO
	MOSTRAR LA LISTA
	BUSCAR Y MOSTRAR LA POSICI�N DE �E�, �H� Y �O�
	ELIMINAR ELEMENTO EN LA POSICI�N 1 Y �U�
	MOSTRAR LA LISTA DE NUEVO.
	*/
	
	public static void Alfabeto(int pos) {
		ArrayList<String> arrLetra = new ArrayList<String>();
		arrLetra.add("A");
		arrLetra.add("B");
		arrLetra.add("C");
		arrLetra.add("D");
		arrLetra.add("E");
		arrLetra.add("F");
		arrLetra.add("G");
		arrLetra.add("H");
		arrLetra.add("I");
		arrLetra.add("J");
		arrLetra.add("K");
		arrLetra.add("L");
		arrLetra.add("M");
		arrLetra.add("N");
		arrLetra.add("O");
		arrLetra.add("P");
		arrLetra.add("Q");
		arrLetra.add("R");
		arrLetra.add("S");
		arrLetra.add("T");
		arrLetra.add("U");
		arrLetra.add("V");
		arrLetra.add("W");
		arrLetra.add("X");
		arrLetra.add("Y");
		arrLetra.add("Z");
		System.out.println("Alfabeto: "+arrLetra);
		arrLetra.indexOf("E");
		arrLetra.indexOf("H");
		arrLetra.indexOf("O");
		System.out.println("Posición E: "+arrLetra.indexOf("E")+" Posición H: "+arrLetra.indexOf("H")+" Posición O: "+arrLetra.indexOf("O"));
		arrLetra.remove(1);
		arrLetra.remove("U");
		System.out.println("Alfabeto MOD: "+arrLetra);

	}
	
}