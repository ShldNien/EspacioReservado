package segundotrim;

public class Coche {
	
	int ruedas, puertas, cv;
	double velocidad;
	String nombre,matricula, anioMatricula;
	boolean esCoche = false;
	
	public void Verificar() {
		if (ruedas == 4 && (puertas==3 || puertas==5) && cv > 50) {
			esCoche = true;
		}
		System.out.println("Este veh�culo es un coche modelo: "+nombre+".\n");
		System.out.println("Ser� capaz de alcanzar la siguiente velocidad : "+velocidad+"km/h\n");
	}
	public void VerMatricula() {
		if (matricula!=null && anioMatricula!=null) {
			System.out.println("Coche: "+nombre+"\n");
			System.out.println("Matr�cula: "+matricula);
			System.out.println("A�o de Matriculaci�n: "+anioMatricula+"\n");
		}
	}
}