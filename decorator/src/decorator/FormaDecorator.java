package decorator;

import forma.Forma;

public class FormaDecorator implements Forma {

	protected Forma forma;
	
	public FormaDecorator(Forma forma) {
		this.forma = forma;
	}
	
	public void draw() {
		forma.draw();
	}
}
