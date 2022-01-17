package segundotrim;

import java.util.HashMap;
import java.util.Map.Entry;

public class Tipo {

	String tipo;
	
	double normal = 1.0, agua = 1.0, volador = 1.0, tierra = 1.0, lucha = 1.0, fuego = 1.0, electrico = 1.0,
			planta = 1.0, bicho = 1.0, veneno = 1.0, fantasma = 1.0, roca = 1.0, psiquico = 1.0, acero = 1.0,
			hielo = 1.0, dragon = 1.0, hada = 1.0, siniestro = 1.0;

	String[] elementos = { "Normal", "Agua", "Volador", "Tierra", "Lucha", "Fuego", "Electrico", "Planta",
			"Bicho", "Veneno", "Fantasma", "Roca", "Psiquico", "Acero", "Hielo", "Dragon", "Hada", "Siniestro" };

	HashMap<String, Double> debilidades = new HashMap<String, Double>();

	public Tipo(String tipo) {

		this.tipo = tipo;
		
		switch (tipo) {
		case "Normal":
			lucha *= 2.0;
			fantasma *= 0.0;
			break;
		case "Agua":
			electrico *= 2.0;
			planta *= 2.0;
			fuego *= 0.5;
			hielo *= 0.5;
			acero *= 0.5;
			agua *= 0.5;
			tierra *= 0.0;
			break;
		case "Volador":
			electrico *= 2.0;
			hielo *= 2.0;
			roca *= 2.0;
			bicho *= 0.5;
			lucha *= 0.5;
			planta *= 0.5;
			break;
		case "Tierra":
			hielo *= 2.0;
			planta *= 2.0;
			agua *= 2.0;
			veneno *= 0.5;
			roca *= 0.5;
			electrico *= 0.0;
			break;
		case "Lucha":
			volador *= 2.0;
			psiquico *= 2.0;
			bicho *= 0.5;
			roca *= 0.5;
			break;
		case "Fuego":
			tierra *= 2.0;
			roca *= 2.0;
			agua *= 2.0;
			bicho *= 0.5;
			hada *= 0.5;
			fuego *= 0.5;
			planta *= 0.5;
			hielo *= 0.5;
			acero *= 0.5;
			break;
		case "Electrico":
			tierra *= 2.0;
			electrico *= 0.5;
			volador *= 0.5;
			acero *= 0.5;
			break;
		case "Planta":
			bicho *= 2.0;
			hielo *= 2.0;
			fuego *= 2.0;
			volador *= 2.0;
			veneno *= 2.0;
			electrico *= 0.5;
			planta *= 0.5;
			tierra *= 0.5;
			agua *= 0.5;
			break;
		case "Bicho":
			fuego *= 2.0;
			volador *= 2.0;
			roca *= 2.0;
			lucha *= 0.5;
			planta *= 0.5;
			tierra *= 0.5;
			break;
		case "Veneno":
			tierra *= 2.0;
			psiquico *= 2.0;
			bicho *= 0.5;
			hada *= 0.5;
			lucha *= 0.5;
			planta *= 0.5;
			veneno *= 0.5;
			break;
		case "Siniestro":
			bicho *= 2.0;
			hada *= 2.0;
			lucha *= 2.0;
			siniestro *= 0.5;
			fantasma *= 0.5;
			psiquico *= 0.0;
			break;
		case "Fantasma":
			siniestro *= 2.0;
			fantasma *= 2.0;
			bicho *= 0.5;
			veneno *= 0.5;
			lucha *= 0.0;
			normal *= 0.0;
			break;
		case "Psiquico":
			bicho *= 2.0;
			siniestro *= 2.0;
			fantasma *= 2.0;
			lucha *= 0.5;
			psiquico *= 0.5;
			break;
		case "Roca":
			lucha *= 2.0;
			planta *= 2.0;
			tierra *= 2.0;
			acero *= 2.0;
			agua *= 2.0;
			fuego *= 0.5;
			volador *= 0.5;
			normal *= 0.5;
			veneno *= 0.5;
			break;
		case "Acero":
			lucha *= 2.0;
			fuego *= 2.0;
			tierra *= 2.0;
			bicho *= 0.5;
			dragon *= 0.5;
			hada *= 0.5;
			volador *= 0.5;
			planta *= 0.5;
			hielo *= 0.5;
			normal *= 0.5;
			psiquico *= 0.5;
			roca *= 0.5;
			acero *= 0.5;
			veneno *= 0.0;
			break;
		case "Hielo":
			lucha *= 2.0;
			fuego *= 2.0;
			roca *= 2.0;
			acero *= 2.0;
			hielo *= 0.5;
			break;
		case "Dragon":
			dragon *= 2.0;
			hada *= 2.0;
			hielo *= 2.0;
			electrico *= 0.5;
			fuego *= 0.5;
			planta *= 0.5;
			agua *= 0.5;
			break;
		case "Hada":
			veneno *= 2.0;
			acero *= 2.0;
			bicho *= 0.5;
			siniestro *= 0.5;
			lucha *= 0.5;
			dragon *= 0.0;
			break;
		default:
			System.out.println("ROTO");
			break;
		}
		
		setMultipl();

	}

	public void setMultipl() {
		debilidades.put("Normal", normal);
		debilidades.put("Agua", agua);
		debilidades.put("Volador", volador);
		debilidades.put("Lucha", lucha);
		debilidades.put("Fuego", fuego);
		debilidades.put("Electrico", electrico);
		debilidades.put("Planta", planta);
		debilidades.put("Bicho", bicho);
		debilidades.put("Veneno", veneno);
		debilidades.put("Fantasma", fantasma);
		debilidades.put("Roca", roca);
		debilidades.put("Psiquico", psiquico);
		debilidades.put("Acero", acero);
		debilidades.put("Hielo", hielo);
		debilidades.put("Dragon", dragon);
		debilidades.put("Hada", hada);
		debilidades.put("Siniestro", siniestro);
		debilidades.put("Tierra", tierra);
		
		/*for (Entry<String, Double> elem : debilidades.entrySet()) {
			System.out.println("El tipo es:" + elem.getKey() + " y su multiplicador actual: " + elem.getValue());
		}*/
	}

	public void ResetMultipl() {
		for (Entry<String, Double> elem : debilidades.entrySet()) {
			elem.setValue(1.0);
		}
	}
}
/*
 * public void ResetMultipl() { for (Entry<String,Integer> elem:
 * multiLista.entrySet()) { elem.getKey(); elem.getValue(); } }
 */

/*
 * public void MostrarEfectivo() { for (int i=0;i<elementos.length-1;i++) {
 * if(multiLista[i] == 0.0) { System.out.println("Inmune"); }else
 * if(multiLista[i] == 0.5) { System.out.println("Poco Efectivo"); }else
 * if(multiLista[i] == 2.0) { System.out.println("Super Efectivo"); } } }
 */
