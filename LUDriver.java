package LUFinder;
import java.util.*;

public class LUDriver {
	public static void main(String[] args) {
		Player[] regList;
		regList = ArrBuild.Builder();
		Scanner input = new Scanner(System.in);
		System.out.println("Are you looking for a player or team?");
		String teamorplayer = input.nextLine();
		if (teamorplayer.contains("team")) {
			System.out.println("What team are you looking for?");
			String team = input.nextLine();
			Team mono = new Team(team, 0, 0, 0, 0);
			for (int i = 0; i<regList.length-3; i++) {
				if (regList[i].getGscTeam().contains(team)) {
					mono.addPlayer(regList[i]);}
			}
			System.out.println(mono);
				}
		else if (teamorplayer.contains("player")) {
			System.out.println("Do you want to look by FC or name?");
			String fcorname = input.nextLine();
			if (fcorname.contains("fc")) {
				System.out.println("Enter the FC for the player you want to find.");
				String fc = input.nextLine();
				for (int i = 0; i<regList.length-3; i++) {
					if (regList[i].getFc().contains(fc)) {
						System.out.println(regList[i]);}
				}
			}
			else if (fcorname.contains("name")) {
				System.out.println("Enter the name of the player you want to find.");
				String name = input.nextLine();
				for (int i = 0; i<regList.length-3; i++) {
					if (regList[i].getName().contains(name)) {
						System.out.println(regList[i]);}
				}
			}
		}
		input.close();
		}
		}

		
	
