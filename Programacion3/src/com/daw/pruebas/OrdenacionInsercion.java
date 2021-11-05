package com.daw.pruebas;

import java.util.Arrays;

public class OrdenacionInsercion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,5,3,1,8,7,2,4};
		for(int i=0;i<arr.length-1;i++) {
			int aux;
			if(arr[i]<arr[i-1]) {
				int j;
				aux = arr[i];
				for (j = i;j > 0 && aux < arr[j-1];j--) {
					arr[j] = arr[j-1];
				}
				arr[j] = aux;
			}			
		}
		System.out.println(Arrays.toString(arr));
	}
}
