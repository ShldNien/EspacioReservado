package segundotrim;

/*
 * PARTE A. 1 punto.
 *
 * a. El ejercicio de poner el c�digo ASCII del valor del String
 *
 * b. PONER LOS PANTALLAZOS DEL RESULTADO
 * 1. Crear una clase coche
 * 2. Crear los atributos que creais convenientes (que contenga String... int..
 * arrays... ArrayLists... lo que quer�is)
 * 3. Crear una o dos funcionalidades.
 * 4. En otra clase... crear e instanciar 2 o 3 objetos de tipo Coche
 * 5. Dar valores a los atributos de los diferentes objetos
 * 6. Llamar a las funcionalidades de vuestros objetos
 *
 *
 *
 * PARTE B. 3 puntos.
 * 
 * �En qu� consiste el agrupamiento por paquetes en la POO?
 * Indica las tres ventajas y explica brevemente cada una de ellas.
 *
 * �Podr�as explicar el significado de los conceptos de Abstracci�n, Herencia y Polimorfismo?
 * Si crees que hay alguna relaci�n entre ellos, explica brevemente cu�l es. (poned un ejemplo)
 *
 * �Qu� es una clase en Java? �De qu� partes consta?
 *
 * y...�qu� es un objeto? �QU� diferencia hay entre declarar un objeto e instanciarlo?
 *
 *
 * PARTE C. 6 puntos
 * 1+2+3 = 1 punto
 * 1. Crear una clase Pokemon
 * a. Tiene atributos nombre, lore, tipo, fuerza y vida
 * 2. Crerar una clase Ataque
 * 		a. Tiene atributos nombre, tipo y cantidad de da�o
 * 3. Cada clase tendr� un constructor que reciba 3 o 4 variables por par�metros
 * y que las setea.
 *
 * 4+5 = 2 puntos
 * 4. Crear una funcionalidad en la clase Pokemon que consista en recibir un ataque.
 * 		a. Esta funcionalidad tiene que recibir por par�metros un ataque.
 * 		b. Seg�n el tipo del ataque, se le restar� a la vida del pok�mon la mitad del da�o, el doble del da�o, o el da�o base.
 * 		c. Esa comprobaci�n de si es muy efectivo, poco efectivo, o normal, se debe hacer en una funci�n aparte.
 * 5. Crear una funcionalidad en la clase Pokemon que consista en comprobar si el ataque contra ese pokemon es muy efectivo, poco efectivo, o normal.
 * 		a. Esta funcionalidad recibe por par�metros el tipo del pokemon y el tipo del ataque
 * 		b. Comprueba la efectividad de ese ataque contra ese pokemon
 * 		c. Devuelve "algo" para adaptar el da�o del ataque al pokemon dado
 * 
 * 6 = 2 puntos
 * 6. Crear una clase principal, con un main, que simule un combate pokemon entre pokemons previamente creados
 * 		a. En el combate se tiene que poder decidir qu� pokemon se enfrenta a qu� pokemon
 * 		b. Se realizan ataques entre los pokemons, por turnos, hasta que se debiliten todos los pokemons de un bando y se proclame un ganador
 * 
 * 7 = 1 punto
 * 7. (para el 10) Complicaci�n del ejercicio.
 * 		a. Los tipos (tanto de los pokemon como de los ataques) deben ser una clase Enum.
 * 		b. La clase Tipo tiene que tener un m�todo que devuelva un tipo contra qu� es debil y contra qu� es fuerte
 * 		c. Una clase entrenador que contenga un array de Pokemons de 6 posiciones como m�ximo
 * 		d. Un pokemon no puede tener m�s de 4 ataques
 * 		e. El combate puede ser de 1 entrenador contra otro entrenador. El cual puede tener hasta 6 pokemons.
 * 
 * 
 *
 */

public class Ejercicio {
	public static void main(String[] args) {
		
		Tipo Electrico = new Tipo("Electrico");
		Tipo Fuego = new Tipo("Fuego");
		Tipo Agua = new Tipo("Agua");
		Tipo Normal = new Tipo("Normal");
	
		Ataque Surf = new Ataque("Surf", Agua.tipo, 10);
		Ataque Ascuas = new Ataque("Ascuas", Fuego.tipo, 10);
		Ataque BolaTrueno = new Ataque("Bola Trueno", Electrico.tipo, 15);
		Ataque Placaje = new Ataque("Placaje", Normal.tipo, 5);
		
		
		Pokemon pikaxu = new Pokemon("Pikachu", Electrico, 20, 10);
		pikaxu.cuatroAtaques(BolaTrueno, Ascuas, Placaje, Surf);


		Pokemon charmande = new Pokemon("Charmander", Fuego, 22, 8);
		charmande.cuatroAtaques(BolaTrueno, Ascuas, Placaje, Surf);

		
		Pokemon squirtle = new Pokemon("Squirtle", Agua, 18, 12);
		squirtle.cuatroAtaques(BolaTrueno, Ascuas, Placaje, Surf);
		
		Combate test1 = new Combate();
		test1.pelea(pikaxu, charmande);

		/*
		int cont = -1;
		
		while (cont!=0) {
			System.out.println("Elige un Pok�mon: \n");
			System.out.println("1.Pikachu");
			System.out.println("2.Charmander");
			System.out.println("3.Squirtle");
			Scanner sc = new Scanner(System.in);
			int entradaPok = sc.nextInt();
			switch(entradaPok) {
			case 1:
				System.out.println("Has elegido a "+pikaxu.nombre);
				break;
			case 2:
				System.out.println("Has elegido a "+charmande.nombre);
				break;
			case 3:
				System.out.println("Has elegido a "+squirtle.nombre);
				break;
			default:
				System.out.println("No has elegido ning�n Pok�mon");
				break;
			}
			System.out.println("Luchar�s contra,"+charmande.nombre+" �Listo?");
			
		}*/

	}
	
}