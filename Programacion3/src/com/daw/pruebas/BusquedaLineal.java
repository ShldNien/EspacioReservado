package com.daw.pruebas;

import java.util.Scanner;

public class BusquedaLineal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			int arr[] = new int[5];
			arr[1]=1;
			arr[2]=2;
			arr[3]=3;
			arr[4]=4;

			System.out.println("Introduzca su número a encontrar: ");
			int elementToSearch = sc.nextInt();
		    for (int i = 0; i < arr.length; i++) {
		        if (arr[i] == elementToSearch) {
		        	System.out.println("Encontrado: "+arr[i]);
		        }
		    }

	}
}
