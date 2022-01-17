package segundotrim;

public class Combate {
	
	public void pelea(Pokemon pok1, Pokemon pok2) {
		
		int turno = 1;
		while (pok1.vida > 0 && pok2.vida > 0) {
			
			System.out.println("Turno Nº"+turno+" de "+pok1.nombre+" con vida: "+pok1.vida);
			
			System.out.println(pok2.nombre+" va a atacar con: "+pok2.ataques.get(0).nombre);
			pok1.recibirAtaque(pok2.ataques.get(0));
					
			System.out.println("El ataque ha sido Efectivo y la vida de "+pok1.nombre+" es: "+pok1.vida);			
				
			System.out.println("Turno Nº"+turno+" de "+pok2.nombre+" con vida: "+pok2.vida);
						
			System.out.println(pok1.nombre+" va a atacar con: "+pok1.ataques.get(0).nombre);
			pok2.recibirAtaque(pok1.ataques.get(0));
					
			System.out.println("El ataque ha sido Efectivo y la vida de "+pok2.nombre+" es: "+pok2.vida);
			turno++;
		}
	}
}
