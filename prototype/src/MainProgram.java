import cache.FormaCache;
import forma.Circulo;
import forma.Quadrado;

public class MainProgram {

	public static void main(String[] args) {
		FormaCache.loadCache();
		Quadrado quadrado = (Quadrado) FormaCache.getForma("1");
		quadrado.draw();
		
		Circulo circulo = (Circulo) FormaCache.getForma("2");
		circulo.draw();
	}
}
