package LUFinder;

public class Player {
	String name, fc, gscTeam;
	public Player(String name, String fc, String gscTeam) {
		this.name = name;
		this.fc = fc;
		this.gscTeam = gscTeam;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFc() {
		return fc;
	}
	public void setFc(String fc) {
		this.fc = fc;
	}
	public String getGscTeam() {
		return gscTeam;
	}
	public void setGscTeam(String gscTeam) {
		this.gscTeam = gscTeam;
	}
	public String toString() {
		return "Player name: " + getName() + "\nFC: " + getFc() + "\nTeam: " + getGscTeam() + "\n\n";
	}
}
