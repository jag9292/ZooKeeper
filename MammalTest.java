package zookeeper;

public class MammalTest {

	public static void main(String[] args) {
		Gorilla gorilla1 = new Gorilla();
		System.out.println("Gorilla");
		System.out.println(gorilla1.displayEnergy());
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		gorilla1.climb();
		System.out.println(gorilla1.displayEnergy());
		
		Bat bat1 = new Bat();
		System.out.println("Bat");
		System.out.println(bat1.displayEnergy());
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		bat1.eatHuman();
		bat1.eatHuman();
		bat1.fly();
		bat1.fly();
		System.out.println(bat1.displayEnergy());
	}

}
