package com.daw.pruebas;

import java.util.Scanner;

public class EjemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String cad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un d�a de la semana : ");
		num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("Lunes");
			num++;
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Mi�rcoles");
			num++;
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			num++;
			break;
		case 6:
			System.out.println("S�bado");
			break;
		case 7:
			System.out.println("Domingo");
			num++;
			break;
		default:
			System.out.println("Dato incorrecto, destruyendo datos . . .");
			break;
		}
		
		if(num == 1) {
			System.out.println("Lunes");
		}else if(num == 2) {
			System.out.println("Martes");
		}else if(num == 3) {
			System.out.println("Mi�rcoles");
		}else if(num == 4) {
			System.out.println("Jueves");
		}else if(num == 5) {
			System.out.println("Viernes");
		}else if(num == 6) {
			System.out.println("S�bado");
		}else if(num == 7) {
			System.out.println("Domingo");
		}else{
			System.out.println("Dato incorrecto, destruyendo datos . . .");
		}
		
	}

}
