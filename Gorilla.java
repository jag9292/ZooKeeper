package zookeeper;

public class Gorilla extends Mammal{
	public Gorilla() {
	}
	
	public void throwSomething() {
		System.out.println("Ya threw it!");
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Dats good banana!");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Ya climbed a tree!");
		this.energyLevel -= 10;
	}
}
