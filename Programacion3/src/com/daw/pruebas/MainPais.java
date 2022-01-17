package segundotrim;

public class MainPais {

	public static void main(String[] args) {

		Pais espana = new Pais("España",20000000);
		Pais alemania = new Pais("Alemania",30000000);
		Pais grecia = new Pais("Grecia",15000000);
		
		System.out.println("NumPaises : "+Pais.numPaises);
		
		System.out.println(espana.presentar());
		System.out.println(alemania.presentar());
		System.out.println(grecia.presentar());
	}

}
