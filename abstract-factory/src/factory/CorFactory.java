package factory;

import cor.Amarelo;
import cor.Cor;
import cor.Vermelho;
import forma.Forma;

public class CorFactory extends AbstractFactory {

	@Override
	public Cor getCor(String cor) {
		if (cor.equalsIgnoreCase("VERMELHO")) {
			return new Vermelho();
		} else if (cor.equalsIgnoreCase("AMARELO")) {
			return new Amarelo();
		}
		return null;
	}

	@Override
	public Forma getForma(String forma) {
		return null;
	}

}
