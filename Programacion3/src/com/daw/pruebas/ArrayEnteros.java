package com.daw.pruebas;

import java.util.Scanner;

public class ArrayEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arrUsuario = new int[5];
		for (int i = 0;i<= arrUsuario.length;i++) {
			System.out.println("Posición:"+i);
			arrUsuario[i] = sc.nextInt();
			System.out.println("Contiene->"+arrUsuario[i]);
		}
	}

}
