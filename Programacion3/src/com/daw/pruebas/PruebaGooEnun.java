package com.daw.pruebas;

public class PruebaGooEnun {

	public static void main(String[] args) {
		

	}
	
	/**
	 * 	Dado un array que contiene solo n�meros en el rango de 1 a array.length(), encuentre el primer 
		n�mero duplicado para el cual la segunda aparici�n tiene la posici�n m�nima. En otras palabras, si hay 
		m�s de 1 n�mero duplicado, devuelve el n�mero para el que la segunda aparici�n tiene un �ndice (posici�n) 
		m�s peque�o que la segunda aparici�n del otro n�mero. Si no hay tales elementos, devuelve -1
		Ejemplo:
		array a = [2, 1, 3, 5, 3, 2] -> el m�todo debe retornar 3.
		Explicacion: Los numeros duplicados son el 2 y el 3. El 2 tiene a su duplicado en la posici�n 5, 3 tiene a 
		su duplicado en la posicion 4 ------> Entonces gana el 3, porque tiene a su duplicado en una posicion menor.
		
		array a = [8, 4, 6, 2, 6, 4, 7, 9, 5, 8] -> el m�todo debe retornar 6.
		array a = [3, 3, 3] -> se retorna 3.
		array a = [2, 3, 3] -> se retorna 3.
	 * @param a
	 * @return
	 */
	int firstDuplicate(int[] a) {
		
		return -1;
	}

}
