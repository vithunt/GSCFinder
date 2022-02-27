package LUFinder;
import java.io.*;
import java.util.*;

public class ArrBuild {
	public static Player[] Builder() {
		Player[] playerList = new Player[687];
		try {
			Scanner csvReader = new Scanner(new File("./GSC.csv"));

			int numPlayers = 0;
			csvReader.useDelimiter(",");
			csvReader.nextLine();
			String[] playerArr = new String[4];

			while (csvReader.hasNextLine()) {
				
				playerArr = csvReader.nextLine().split(",");
					try {
					playerList[numPlayers] = new Player(playerArr[0], playerArr[1], playerArr[3]);
					numPlayers++;
					} catch (ArrayIndexOutOfBoundsException e2) {
						System.out.println("Array size error:" + e2 + "\nBad Line:\n");
						for (int x = 0; x<playerArr.length; x++) {
							System.out.println(x + ": " + playerArr[x]);
						}}
						
					}
				

			

			csvReader.close();
		
			}catch (FileNotFoundException ex) {
				System.out.println("File not found");
			}
		return playerList;
		}
	
	}

