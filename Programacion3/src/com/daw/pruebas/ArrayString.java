package com.daw.pruebas;


public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrString = new String[7];
		arrString[0]="1� Posici�n";
		arrString[1]="2� Posici�n";
		arrString[2]="3� Posici�n";
		arrString[3]="4� Posici�n";
		arrString[4]="5� Posici�n";
		arrString[5]="6� Posici�n";
		arrString[6]="7� Posici�n";
		for(int i=arrString.length-1;i>=0;i--) {
			System.out.println(arrString[i]);
		}
	}

}
