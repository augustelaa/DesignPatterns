package forma;

public class Quadrado extends Forma {
	
	public Quadrado() {
		type = "Quadrado";
	}

	@Override
	public void draw() {
		System.out.println("Desenhando um Quadrado");
	}

}
