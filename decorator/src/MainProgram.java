import decorator.RedFormaDecorator;
import forma.Circulo;
import forma.Forma;
import forma.Quadrado;

public class MainProgram {

	public static void main(String[] args) {
		Forma quadrado = new Quadrado();
		quadrado.draw();
		
		Forma quadradoVermelho = new RedFormaDecorator(new Quadrado());
		quadradoVermelho.draw();
		
		Forma circuloVermelho = new RedFormaDecorator(new Circulo());
		circuloVermelho.draw();
	}

}
