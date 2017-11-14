package cache;

import java.util.HashMap;

import forma.Circulo;
import forma.Forma;
import forma.Quadrado;

public class FormaCache {
	
	private static HashMap<String, Forma> formas = new HashMap<String, Forma>();
	
	public static Forma getForma(String id) {
		Forma forma = formas.get(id);
		return (Forma) forma.clone();
	}
	
	public static void loadCache() {
		Quadrado quadrado = new Quadrado();
		quadrado.setId("1");
		formas.put(quadrado.getId(), quadrado);
		
		Circulo circulo = new Circulo();
		circulo.setId("2");
		formas.put(circulo.getId(), circulo);
	}

}
