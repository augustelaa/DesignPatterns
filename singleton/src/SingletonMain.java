import objects.Cafe;

public class SingletonMain {
	public static void main(String[] args) {
		//Cafe cafe = new Cafe();
		
		Cafe cafe = Cafe.getInstance();
		cafe.fazerCafe();
		System.out.println(cafe.getId());
		
		// Continuamos com a mesma instancia.
		Cafe cafePreto = Cafe.getInstance();
		cafePreto.fazerCafe();
		System.out.println(cafePreto.getId());
	}
}
