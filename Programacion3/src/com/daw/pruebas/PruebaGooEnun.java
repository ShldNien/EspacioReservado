package com.daw.pruebas;

public class PruebaGooEnun {

	public static void main(String[] args) {
		

	}
	
	/**
	 * 	Dado un array que contiene solo números en el rango de 1 a array.length(), encuentre el primer 
		número duplicado para el cual la segunda aparición tiene la posición mínima. En otras palabras, si hay 
		más de 1 número duplicado, devuelve el número para el que la segunda aparición tiene un índice (posición) 
		más pequeño que la segunda aparición del otro número. Si no hay tales elementos, devuelve -1
		Ejemplo:
		array a = [2, 1, 3, 5, 3, 2] -> el método debe retornar 3.
		Explicacion: Los numeros duplicados son el 2 y el 3. El 2 tiene a su duplicado en la posición 5, 3 tiene a 
		su duplicado en la posicion 4 ------> Entonces gana el 3, porque tiene a su duplicado en una posicion menor.
		
		array a = [8, 4, 6, 2, 6, 4, 7, 9, 5, 8] -> el método debe retornar 6.
		array a = [3, 3, 3] -> se retorna 3.
		array a = [2, 3, 3] -> se retorna 3.
	 * @param a
	 * @return
	 */
	int firstDuplicate(int[] a) {
		
		return -1;
	}

}
