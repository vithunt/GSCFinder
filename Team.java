package LUFinder;

public class Team {
	String name;
	int wins, losses, prevDiv, prevPts, numPlayers;
	Player[] players = new Player[25];
	public Team(String name, int wins, int losses, int prevDiv, int prevPts) {
		this.name = name;
		this.wins = wins;
		this.losses = losses;
		this.prevDiv = prevDiv;
		this.prevPts = prevPts;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public int getPrevDiv() {
		return prevDiv;
	}
	public void setPrevDiv(int prevDiv) {
		this.prevDiv = prevDiv;
	}
	public int getPrevPts() {
		return prevPts;
	}
	public void setPrevPts(int prevPts) {
		this.prevPts = prevPts;
	}
	public int getNumPlayers() {
		return numPlayers;
	}
	public void setNumPlayers(int numPlayers) {
		this.numPlayers = numPlayers;
	}
	public void addPlayer(Player player) {
		this.players[numPlayers] = player;
		numPlayers++;
	}
	public String toString() {
		String players1 = "";
		for (int j = 0; j<numPlayers; j++) {
			players1 = players1 + players[j].toString();
		}
		return "Team Name: " + getName() + "\nPrevious Division: " + getPrevDiv() + "\nPlayers: \n" + players1;
	}
}
