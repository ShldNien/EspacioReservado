package com.daw.pruebas;

import java.util.Random;

public class Tema4Actividad1 {
	int iteraciones = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Empieza");
		
		Tema4Actividad1 act = new Tema4Actividad1();
		int[] arr1 = act.inicializarArray(100, true);
		int[] arr2 = act.inicializarArray(100, false);
		int[] arr3 = act.inicializarArray(1000, true);
		int[] arr4 = act.inicializarArray(1000, false);
		
		String[] arr5 = act.inicializarArrayString(100);
		String[] arr6 = act.inicializarArrayString(1000);
		String[] arr7 = act.inicializarArrayString(2000);
		
		act.menu();
		
		long start1 = System.nanoTime();
		
		int num1 = act.numRandom(100);
		int num2 = act.numRandom(100);
		int num4 = act.numRandom(1000);
		int num5 = act.numRandom(1000);
		
		String str1 = act.strRandom(100);
		String str3 = act.strRandom(1000);
		String str5 = act.strRandom(2000);
		
		
		act.busquedaInt(num1, arr1);
		act.busquedaIntDesordenado(num1, arr2);
		
		act.busquedaIntDesordenado(num1, arr2);
		
		act.busquedaInt(num4, arr3);
		act.busquedaIntDesordenado(num4, arr3);
		
		act.busquedaIntDesordenado(num5, arr4);
			
		
		act.busquedaStr(str1, arr5);
		act.busquedaStr(str1, arr6);
		act.busquedaStr(str1, arr7);
		
		act.busquedaStr(str3, arr5);
		act.busquedaStr(str3, arr6);
		act.busquedaStr(str3, arr7);
		
		act.busquedaStr(str5, arr5);
		act.busquedaStr(str5, arr6);
		act.busquedaStr(str5, arr7);

		
		long end2 = System.currentTimeMillis();
		long total = start1 - end2;
		System.out.println("Acaba en "+total+" milisegundos");
	}
	

	/**
	 * Menu de mensajes
	 */
	private void menu() {
		try {
			System.out.println("Comienza la prueba en 3..");
			Thread.sleep(1000);
			System.out.println("2..");
			Thread.sleep(1000);
			System.out.println("1..");
			Thread.sleep(1000);
			System.out.println("¡GO!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Generador de array de enteros ordenado
	 * @param pos
	 * @return
	 */
	private int[] inicializarArray(int pos, boolean ordenado) {
		int[] a = new int[pos];
		
		//Si ordenado == true, genero un array de enteros ordenado. Si no, entonces desordenado
		if(ordenado) {
			for(int i=0;i<pos;i++) {
				a[i] = i;
			}
		}else {
			for(int i=0;i<pos;i++) {
				a[i] = (int)(Math.floor(Math.random()*(pos-0+1)+0));
			}
		}
			
		
		return a;
	}
	
	/**
	 * Generador de array de String aleatorio
	 * @param pos
	 * @return
	 */
	private String[] inicializarArrayString(int pos) {
		Random rand = new Random();
		
		String[] a = new String[pos];
		
		for(int i=0; i<pos; i++) {
			char[] c = new char[rand.nextInt(1)+2];
			
			for(int j = 0; j < c.length; j++)
	        {
	            c[j] = (char)('a' + rand.nextInt(26));
	        }
	        a[i] = new String(c);
		}
		return a;
	}

	/**
	 * Generador num random
	 * @param pos
	 * @return
	 */
	private int numRandom(int pos) {
		return (int)(Math.floor(Math.random()*(pos-0+1)+0));
	}
	
	
	/**
	 * Generador str random
	 * @param pos
	 * @return
	 */
	private String strRandom(int pos) {
		Random rand = new Random();
		char[] c = new char[rand.nextInt(1)+2];
		
		for(int j = 0; j < c.length; j++)
        {
            c[j] = (char)('a' + rand.nextInt(26));
        }
        return new String(c);
	}
	
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	private void busquedaInt(int num, int[] arr) {			//buscar num dentro de arr
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == num) {
	        	System.out.println("Encontrado: "+arr[i]);
	        	System.out.println("Posición: "+i);
	        	break;
	        }
	    }
		
	}
	
	
	private void busquedaIntDesordenado(int num, int[] arr) { 		//buscar num dentro de arr
		int lowindex = 0;
		int maxindex = arr.length-1;
		int posicion = -1;
		while (lowindex <= maxindex) {
			int midindex = (lowindex + maxindex)/2;
			if(num == arr[midindex]) {
				posicion = midindex;
				continue;
			}else if (num < arr[midindex]) {
				maxindex = midindex-1;
				continue;
			}else if (num > arr[midindex]) {
				lowindex = midindex+1;
				break;
			}
			System.out.println("Encontrado: "+arr[midindex]);
        	System.out.println("Posición: "+midindex);

		}
		
	}
	
	
	private void busquedaStr(String cad, String[] arr) {  		//buscar cad dentro de arr
		for(int i = 0;i<arr.length;i++) {
			if(arr[i].equals(cad)) {
				System.out.println("La palabra encontrada esta en laposicion "+i);
				break;
			}
	}
}
}
