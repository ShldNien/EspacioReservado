package segundotrim;

public class PruebaCoche {

	public static void main(String[] args) {
		
		Coche Panda = new Coche();
		Panda.nombre = "Panda";
		Panda.ruedas = 4;
		Panda.puertas = 5;
		Panda.cv = 90;
		Panda.ruedas = 4;
		Panda.velocidad = 90;
		Panda.matricula = "3819 VMB";
		Panda.anioMatricula = "18/08/1999";
		Coche Clio = new Coche();
		Clio.nombre = "Clio";
		Clio.ruedas = 4;
		Clio.puertas = 5;
		Clio.cv = 75;
		Clio.ruedas = 4;
		Clio.velocidad = 80;
		Clio.matricula = "1319 FKA";
		Clio.anioMatricula = "11/03/1997";
		Coche AudiTT = new Coche();
		AudiTT.nombre = "AudiTT";
		AudiTT.ruedas = 4;
		AudiTT.puertas = 5;
		AudiTT.cv = 230;
		AudiTT.ruedas = 4;
		AudiTT.velocidad = 220;
		AudiTT.matricula = "1907 POO";
		AudiTT.anioMatricula = "18/09/1994";
		
		Panda.Verificar();
		Clio.Verificar();
		AudiTT.Verificar();
		
		Panda.VerMatricula();
		Clio.VerMatricula();
		AudiTT.VerMatricula();
		
	}
}