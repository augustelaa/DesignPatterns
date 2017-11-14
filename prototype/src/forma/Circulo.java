package forma;

public class Circulo extends Forma {
	
	public Circulo() {
		type = "Circulo";
	}

	@Override
	public void draw() {
		System.out.println("Desenhando um Circulo.");
	}

}
