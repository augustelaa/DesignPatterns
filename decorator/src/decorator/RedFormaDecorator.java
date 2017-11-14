package decorator;

import forma.Forma;

public class RedFormaDecorator extends FormaDecorator {

	public RedFormaDecorator(Forma forma) {
		super(forma);
	}
	
	@Override
	public void draw() {
		forma.draw();	       
		setRed(forma);
	}
	
	private void setRed(Forma forma) {
		System.out.println("Pintando de Vermelho.");
	}
}
