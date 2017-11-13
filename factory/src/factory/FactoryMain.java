package factory;

public class FactoryMain {
	
	public static void main(String[] args) {
		FormaFactory formaFactory = new FormaFactory();
		Forma circulo = formaFactory.getForma("CIRCULO");
		circulo.desenhar();
		Forma quadrado = formaFactory.getForma("QUADRADO");
		quadrado.desenhar();
	}
}
