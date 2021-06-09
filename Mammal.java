package zookeeper;

public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public String displayEnergy() {
		String display = String.format("Energy Level : %d", this.energyLevel);
		return display;
	}


	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}
}
