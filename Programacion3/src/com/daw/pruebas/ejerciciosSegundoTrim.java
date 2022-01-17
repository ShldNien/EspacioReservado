package segundotrim;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * EJ1. CREAR UN ARRAY DE STRING DE LONGITUD 10 E INICIALIZARLO CON LAS PALABRAS Q QUERAIS
 * RECORRER EL ARRAY DE PRINCIPIO A FIN
 * IMPRIMIR POR PANTALLA -> "LA POSICION i CONTIENE LA PALABRA XXXXXX
 * SI LA LONGITUD DE LA PALABRA ES MAYOR QUE 6 IMPRIMIR POR PANTALLA "LA PALABRA XXXXXX TIENE UNA LONG MAYOR QUE 6"
 * 
 * EJ2. CREAR UNA FUNCION QUE RECIBA UN STRING POR PARAMETROS
 * DICHA FUNCION TIENE QUE COMPROBAR SI LA PALABRA RECIBIDA ES UN PALINDROMO O NO
 * SI SI LO ES, ENTONCES IMPRIMIR POR PANTALLA "ES PALINDROMO"... SI NO..."NO ES PALINDROMO"
 * 
 * EJ3 CREAR UNA FUNCION QUE RECIBA UN ARRAY DE ENTEROS POR PARAMETROS
 * DICHA FUNCION TIENE QUE ORDENAR EL ARRAY DE MENOR A MAYOR
 * QUEREMOS OBTENER UN ARRAY QUE EMPIECE EN MENOR NUMERO Y TERMINE EN SU MAYOR NUMERO Y, ADEMAS, QUEREMOS SABER EL MINIMO 
 * NUMERO DE NUMEROS QUE TENDRIAMOS QUE AÑADIR PARA QUE EL ARRAY FUESE CONSECUTIVO, ES DECIR, QUE SE AUMENTE DE 1 EN 1
 * HASTA LLEGAR A SU NUMERO MAXIMO
 * IMPRIMIR LOS NUMEROS NECESARIOS Y EL ARRAY ORDENADO
 * EJEMPLO: arr = {4,6,9}
 * minimo numero de numeros necesarios = 3 (5, 7 y 8)
 */
public class ejerciciosSegundoTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrLong = {"Abelardo","Juanito","Mantecao",
		"AlanMur","ElLemur","Ola","Piñata","Autobus","Minecraft","Logitech"}; 
		for (int i=0;i<arrLong.length-1;i++) {
			if(arrLong[i].length() >= 0 && arrLong[i].length() <= 6) {
				System.out.println("LA POSICIÓN "+i+" CONTIENE LA PALABRA "+arrLong[i]);
			}else{
				System.out.println("LA PALABRA "+arrLong[i]+" TIENE LONGITUD MAYOR QUE 6");
			}
		}
		System.out.println("_____________________________");
		System.out.println("\n");
		System.out.println("¿SON PALINDROMOS?");

		esPalindromo("OTTO");
		esPalindromo("OSO");
		esPalindromo("FOSO");
		int[] array = {7,6,3};
		OrdenarArr(array);
		System.out.println(Arrays.toString(array));
	}
	private static void esPalindromo(String str) {
			str = str.toLowerCase();
			String rts = new StringBuilder(str).reverse().toString();
			if(str.equals(rts)) {
				System.out.println("ES PALINDROMO");
			}else{
				System.out.println("NO ES PALINDROMO");
			}
	}
	private static void OrdenarArr(int[] arr) {
		int encontrado = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++)
			if(arr[j]>arr[j+1]) {
				int auxi = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]=auxi;
			}
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]+1<arr[i+1]){
				encontrado++;
			}
		}
		System.out.println("Encontrados : "+encontrado+" y los números son: "+Arrays.toString(arr));
	}
}
