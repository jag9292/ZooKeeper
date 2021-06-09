package zookeeper;

public class MammalTest {

	public static void main(String[] args) {
		Gorilla gorilla1 = new Gorilla();
		System.out.println(gorilla1.displayEnergy());
		gorilla1.throwSomething();
		gorilla1.eatBananas();
		gorilla1.climb();
		System.out.println(gorilla1.displayEnergy());
	}

}
