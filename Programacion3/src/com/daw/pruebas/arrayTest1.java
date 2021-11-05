package com.daw.pruebas;

public class arrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrInt = {1,2,3,4,5,6,7,8,9};
		
		int elemento = 5;
		
		boolean encontrado = false;
		
		for(int i=0;i<arrInt.length && encontrado == false;i++) {
			if(elemento == arrInt[i]) {
				encontrado = true;
			}
		}
	}

}
