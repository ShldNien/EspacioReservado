package com.daw.pruebas;


public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrString = new String[7];
		arrString[0]="1ª Posición";
		arrString[1]="2ª Posición";
		arrString[2]="3ª Posición";
		arrString[3]="4ª Posición";
		arrString[4]="5ª Posición";
		arrString[5]="6ª Posición";
		arrString[6]="7ª Posición";
		for(int i=arrString.length-1;i>=0;i--) {
			System.out.println(arrString[i]);
		}
	}

}
