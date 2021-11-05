package com.daw.pruebas;

import java.util.Arrays;

public class BusquedaBurbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos array de enteros
		int[] desorden = {1,5,3,8,9,2,6};
		//Implementar bubble sort
		for(int i=0;i<desorden.length-1;i++) {
			for(int j=0;j<desorden.length-1;j++) {
				if (desorden[j]>desorden[j+1]) {
					//igualar aux al elemento de posición 1
					int aux=desorden[j];
					//intercambiamos elementos
					desorden[j]=desorden[j+1];
					//intercambiamos el valor anterior
					desorden[j+1]=aux;
				}
			}
		}
		System.out.println(Arrays.toString(desorden));

	}

}
