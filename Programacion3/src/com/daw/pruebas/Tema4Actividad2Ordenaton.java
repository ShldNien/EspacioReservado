package com.daw.pruebas;

import java.util.Arrays;
import java.util.Random;

public class Tema4Actividad2Ordenaton {
	long iteracionesOrdenacion = 0;
	long iteracionesBusqueda = 0;
	int numElemEncontrados = 0;
	int numArrOrdenados = 0;
	Random rand = new Random();
	
	public static void main(String[] args) {
		
		
		System.out.println("Empieza");
		
		Tema4Actividad2Ordenaton act = new Tema4Actividad2Ordenaton();
		
		//Creación e inicializacion de arrays desordenados
		int[] arr1 = act.inicializarArray(100);
		int[] arr2 = act.inicializarArray(100);
		int[] arr3 = act.inicializarArray(1000);
		int[] arr4 = act.inicializarArray(1000);
		int[] arr5 = act.inicializarArray(1000);
		int[] arr6 = act.inicializarArray(1000);
		int[] arr7 = act.inicializarArray(1000);
		int[] arr8 = act.inicializarArray(1000);
		int[] arr9 = act.inicializarArray(1000);
		int[] arr10 = act.inicializarArray(2000);
		int[] arr11 = act.inicializarArray(2000);
		int[] arr12 = act.inicializarArray(2000);
		
		//Creacion e inicializacion de numeros aleatorios
		int num1 = act.numRandom(1000);
		int num2 = act.numRandom(1000);
		int num3 = act.numRandom(1000);
		int num4 = act.numRandom(1000);
		int num5 = act.numRandom(1000);
		int num6 = act.numRandom(1000);
		int num7 = act.numRandom(1000);
		int num8 = act.numRandom(1000);
		int num9 = act.numRandom(1000);
		int num10 = act.numRandom(1000);
		int num11 = act.numRandom(1000);
		int num12 = act.numRandom(1000);
		
		//Mensajes de inicio del programa
		act.menu();
		
		//****************************************//
		//*Comienzo de la ordenacion de elementos*//
		//****************************************//
		long start = System.currentTimeMillis();
		long start2 = System.nanoTime();
		
		arr1 = act.ordenarArray(arr1);
		arr2 = act.ordenarArray(arr2);
		arr3 = act.ordenarArray(arr3);
		arr4 = act.ordenarArray(arr4);
		arr5 = act.ordenarArray(arr5);
		arr6 = act.ordenarArray(arr6);
		arr7 = act.ordenarArray(arr7);
		arr8 = act.ordenarArray(arr8);
		arr9 = act.ordenarArray(arr9);
		arr10 = act.ordenarArray(arr10);
		arr11 = act.ordenarArray(arr11);
		arr12 = act.ordenarArray(arr12);
		
		long end2 = System.nanoTime();
		long total2 = end2 - start2;
		
		
		//Comprobacion de si los arrays estan ordenados o no
		act.esArrayOrdenado(arr1);
		act.esArrayOrdenado(arr2);
		act.esArrayOrdenado(arr3);
		act.esArrayOrdenado(arr4);
		act.esArrayOrdenado(arr5);
		act.esArrayOrdenado(arr6);
		act.esArrayOrdenado(arr7);
		act.esArrayOrdenado(arr8);
		act.esArrayOrdenado(arr9);
		act.esArrayOrdenado(arr10);
		act.esArrayOrdenado(arr11);
		act.esArrayOrdenado(arr12);
		
		//Mensajes de tiempo de ejecucion en ordenacion de arrays
		act.tiempoEjecOrd(total2);
		
		//*************************************//
		//Comienzo de la busqueda de elementos*//
		//*************************************//
		start2 = 0; end2 = 0;
		start2 = System.nanoTime();
		
		act.busquedaLineal(num1, arr1);
		act.busquedaLineal(num2, arr2);
		act.busquedaLineal(num3, arr3);
		act.busquedaLineal(num4, arr4);
		act.busquedaBinaria(num5, arr5);
		act.busquedaBinaria(num6, arr6);
		act.busquedaBinaria(num7, arr7);
		act.busquedaBinaria(num8, arr8);
		act.busquedaBinaria(num9, arr9);
		act.busquedaBinaria(num10, arr10);
		act.busquedaBinaria(num11, arr11);
		act.busquedaBinaria(num12, arr12);
		
		end2 = System.nanoTime();
		total2 = end2 - start2;
		//Mensajes de tiempo de ejecucion en ordenacion de arrays
		act.tiempoEjecBusc(total2);
		
		//Mensajes de tiempo de ejecucion del programa entero
		long end = System.currentTimeMillis();
		act.tiempoEjecPrograma(end);
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
	 * Impresion por pantalla de los mensajes asociados a la ordenacion de arrays
	 * @param tEjec : en nanosegundos
	 */
	private void tiempoEjecOrd(long tEjec) {
		System.out.printf("El tiempo transcurrido para ordenar todos los arrays ha sido de: %s microSegundos "
				+ "\n y han hecho falta un total de %s iteraciones. \n", (tEjec/1000), iteracionesOrdenacion);
		
		System.out.printf("Numero de arrays correctamente ordenados es de %s/12", numArrOrdenados);
	}
	
	/**
	 * Impresion por pantalla de los mensajes asociados a la busqueda de elementos
	 * @param tEjec : en nanosegundos
	 */
	private void tiempoEjecBusc(long tEjec) {
		System.out.printf("El tiempo transcurrido para buscar todos los elementos ha sido de: %s microSegundos"
				+ "\n y han hecho falta un total de %s iteraciones. \n", (tEjec/1000), iteracionesBusqueda);
		
		System.out.printf("Numero de elementos encontrados es de %s/12", numElemEncontrados);
	}
	
	/**
	 * 
	 * @param tEjec : en milisegundos
	 */
	private void tiempoEjecPrograma(long tEjec) {
		System.out.printf("El tiempo transcurrido total del programa ha sido de %s segundos "
				+ "\n y han hecho falta un total de %s iteraciones totales. \n", (double)(tEjec/1000), (iteracionesBusqueda + iteracionesOrdenacion));
	}
	
	/**
	 * Generador de array de enteros desordenado
	 * @param pos
	 * @return
	 */
	private int[] inicializarArray(int pos) {
		int[] a = new int[pos];
		
		for(int i=0;i<pos;i++) {
			a[i] = 1+rand.nextInt(pos);
		}
		return a;
	}
		
	/**
	 * Generador num random
	 * @param pos
	 * @return
	 */
	private int numRandom(int pos) {
		return (1+rand.nextInt(pos));
	}
	
	
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	/**
	 * Metodo que ordena un array de enteros dado.
	 * Se puede usar el método de ordenación que se desee entre los siguientes:
	 * 
	 * BubbleSort
	 * InsertionSort
	 * SelectionSort
	 * 
	 * MergeSort
	 * QuickSort
	 * 
	 * 4 puntos
	 * 
	 * @param arr
	 * @return
	 */
	private int[] ordenarArray(int[] arr) {
		System.out.println("\nMétodo <<ordenarArray>>");
		/*Creamos un bucle para obtener la cantidad de iteraciones
		 * que hará el programa
		 */
		for(int i = 0; i<arr.length-1;i++) {			
			for(int j=0; j<arr.length-1;j++) {
				iteracionesOrdenacion++;
				//Inicializamos un bucle y un valor aux que nos ayudará a intercambiar valores
				if(arr[j]>arr[j+1]) {
					//Intercambiamos valores
					int aux = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=aux;	
			}
		}			
	}	
		numArrOrdenados++;
		//Imprimimos el array en pantalla
		System.out.println(Arrays.toString(arr));
		//No modificar este punto
		return arr;
	}
	
	
	/**
	 * Metodo de busqueda binaria
	 * 
	 * Apunte: Esta busqueda puede buscar en arrays únicamente ordenados
	 * 
	 * 3 puntos
	 * 
	 * @param num : elemento que se quiere encontrar
	 * @param arr : array de enteros
	 */
	private void busquedaBinaria(int num, int[] arr) {
		System.out.println("\nMétodo <<busquedaBinaria>>");
		//Declaramos valores mínimos y máximos
		int lowindex = 0;
		int mayindex = arr.length - 1;
		//Declaramos boolean para detener el proximo bucle
		boolean encontrado = false;
		//Declaramos bucle, recorremos si valor min <= valor max
		while(lowindex<=mayindex && !encontrado) {
			//Realizamos la media para hallar valor medio
			int midindex = (lowindex + mayindex)/2;
			//Condicionamos el elemento para saber dónde está
			if(num == arr[midindex]) {
				numElemEncontrados++;
				encontrado= true;
			}else if (num < arr[midindex]) {
				mayindex = midindex-1;
			}else if (num > arr[midindex]) {
				lowindex = midindex+1;
			}
		}
		//Imprimimos array
		System.out.println(Arrays.toString(arr));
		
	}
	
	/**
	 * Metodo de busqueda lineal
	 * 
	 * Apunte: este tipo de busqueda puede buscar en arrays desordenados y ordenados
	 * 
	 * 2 puntos
	 * 
	 * @param num : elemento que se quiere encontrar
	 * @param arr : array de enteros
	 */
	private void busquedaLineal(int num, int[] arr) {
		System.out.println("\nMétodo <<busquedaLineal>>");	
		//Recorremos el array desde 0 hasta el valor máximo del array
		for(int i=0; i<arr.length;i++) {
			//Condicionamos el array para saber si el valor en cada iteracion es el mismo que el num dado
			if(arr[i] == num) {
				numElemEncontrados++;
				break;
			}
		}
		//Imprimimos en pantalla
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * Metodo que imprime por pantalla si un array dado esta correctamente ordenado de menor a mayor
	 * 
	 * 1 punto
	 * 
	 * @param arr : array de enteros
	 */
	private void esArrayOrdenado(int[] arr) {
		System.out.println("\nMétodo <<esArrayOrdenado>>");
		String ordenado = "";
		//Recorremos el array desde 0 hasta el valor máximo del array - 1
		for(int i=0; i<arr.length-1;i++) {
			//Condicionamos, si el valor iterado del array es menor o igual que su siguiente, true 
			if(arr[i]<=arr[i+1]) {
				ordenado = "Ordenado";
			}else{
				ordenado = "Desordenado";
			}
		}
		//Imprimimos la respuesta en pantalla
		System.out.println(ordenado);

		
		//Imprimir por pantalla: "El array no está ordenado" si no está ordenado.
		//o
		//"El array está correctamente ordenado" en caso de que sí lo esté.

		
	}
}

