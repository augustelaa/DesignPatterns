package factory;

import cor.Cor;
import forma.Forma;

public abstract class AbstractFactory {
	public abstract Cor getCor(String cor);
	public abstract Forma getForma(String forma);
}
