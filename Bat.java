package zookeeper;

public class Bat extends Mammal{
	public Bat() {
		this.energyLevel = 300;
	}
	public void fly() {
		System.out.println("Woosh");
		this.energyLevel -= 50;
	}
	public void eatHuman() {
		System.out.println("Ahhhhhhhhhhhhhhhh");
		this.energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("crackle crackle");
		this.energyLevel -= 100;
	}
}
