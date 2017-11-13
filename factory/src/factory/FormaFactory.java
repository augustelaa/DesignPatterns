package factory;

public class FormaFactory {
	public Forma getForma(String forma) {
		if (forma.equalsIgnoreCase("Circulo")) {
			return new Circulo();
		} else if (forma.equalsIgnoreCase("Quadrado")) {
			return new Quadrado();
		}
		return null;
	}
}
