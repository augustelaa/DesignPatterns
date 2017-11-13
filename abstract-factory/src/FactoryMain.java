import cor.Cor;
import factory.AbstractFactory;
import factory.FactoryMaker;
import forma.Forma;

public class FactoryMain {
	public static void main(String[] args) {

		AbstractFactory corFactory = FactoryMaker.getFactory("COR");
		Cor amarelo = corFactory.getCor("AMARELO");
		amarelo.colorir();
		Cor vermelho = corFactory.getCor("VERMELHO");
		vermelho.colorir();
		
		AbstractFactory formaFactory = FactoryMaker.getFactory("FORMA");
		Forma circulo = formaFactory.getForma("CIRCULO");
		circulo.desenhar();
		Forma quadrado = formaFactory.getForma("QUADRADO");
		quadrado.desenhar();
		
		// Tentando instanciar, erroneamente, o Quadrado com o Factory de Cores.
		try {
			Forma quadradoErrado = corFactory.getForma("QUADRADO");
			quadradoErrado.desenhar();
		} catch(NullPointerException e) {
			System.out.println("Erro ao desenhar o quadrado.");
		}
	}
}
