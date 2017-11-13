package factory;

public abstract class FactoryMaker {
	public static AbstractFactory getFactory(String factory) {
		if (factory.equalsIgnoreCase("COR")) {
			return new CorFactory();
		} else if (factory.equalsIgnoreCase("FORMA")) {
			return new FormaFactory();
		}
		return null;
	}
}
