package objects;

import java.util.concurrent.ThreadLocalRandom;

public class Cafe {
	
	private static Cafe cafe = new Cafe();
	private int id = ThreadLocalRandom.current().nextInt(1, 100);
	
	private Cafe() {}
	
	public static Cafe getInstance() {
		return cafe;
	}
	
	public void fazerCafe() {
		System.out.println("Fazendo um café...");
	}
	
	public int getId() {
		return id;
	}
}
