package com.daw.pruebas;

public class ArrayDesordenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayDesordenado = new int[4];
		
		arrayDesordenado[0] = 6;
		arrayDesordenado[1] = 4;
		arrayDesordenado[2] = 8;
		arrayDesordenado[3] = 1;

		// [6,4,8,1]
		
		int aux;
		aux = arrayDesordenado[3];
		arrayDesordenado[3] = arrayDesordenado[0];
		arrayDesordenado[0] = aux;
		
		int[] arrDes = {1,5,8,3,10,9,4,12,11};
		
		for(int i=0;i<arrDes.length-1;i++) {
			for(int j=i;j<arrDes.length-1;j++) {
			int aux2 = 0;
			if(aux2 > arrDes[j+1]) {
				aux2=arrDes[j];
				arrDes[j] = arrDes[j+1];
				arrDes[j+1] = aux2;
			}

			}
			System.out.println(arrDes[i]);
		}
	}
}
