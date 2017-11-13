package factory;

import cor.Cor;
import forma.Circulo;
import forma.Forma;
import forma.Quadrado;

public class FormaFactory extends AbstractFactory {

	@Override
	public Cor getCor(String cor) {
		return null;
	}

	@Override
	public Forma getForma(String forma) {
		if (forma.equalsIgnoreCase("CIRCULO")) {
			return new Circulo();
		} else if (forma.equalsIgnoreCase("QUADRADO")) {
			return new Quadrado();
		}
		return null;
	}

}
