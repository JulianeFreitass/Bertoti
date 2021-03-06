package Singleton;

public class SingletonDemo {

	public static void main(String args[]) {
	
		Singleton x = Singleton.getInstance();

		Singleton y = Singleton.getInstance();

		Singleton z = Singleton.getInstance();

		System.out.println("Hashcode de a é " + x.hashCode());
		System.out.println("Hashcode de b é " + y.hashCode());
		System.out.println("Hashcode de c é " + z.hashCode());

		if (x == y && y == z) {

			System.out.println("\nTres objetos apontam para o mesmo local");
		}

		else {
			System.out.println("\nOs tres objetos nao apontam para o mesmo local");
		}
	}

}
