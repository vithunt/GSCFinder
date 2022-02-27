# GSCFinder
### Search the Grand Star Cup [registry](https://docs.google.com/spreadsheets/d/1BlFi6L9c_J_6ILP_oJx_0K7mQ-iQSFksClyAKFspyxE/edit#gid=275123766) by Team, Player name, or Player Friend Code.
## Dependancies
This program is built on Java 11. Right not I'm unsure if Java 16/17 is fully backwards compatible with this project, but as long as you have Java 11 or higher installed you should be fine.

You also need the registry downloaded, and placed in the same folder as the .jar file with the name ```GSC.csv```.
Right now the raw CSV is unsupported, so for now make a copy of the registry and delete columns A, E, H, I, and J.
Afterwards, open the CSV in a raw text editor such as Notepad or [Notepad++](https://notepad-plus-plus.org/downloads/), and delete any ```"``` characters you might find.

I will try to include updated versions of the registry every release, but it will likely become outdated.
## License
This project is licensed under the GNU GPL 3.0 license. See details about it [here](https://choosealicense.com/licenses/gpl-3.0/).
## TO-DO
* Urgent
  - Add comments to source
* Players
  - Support multiple friend codes
  - Support notes column
  - Add preliminary support for player IDs (if they're ever used)
  - Add declaration if the player is a rep
  - (Maybe) Add declaration if the player is a bagger
* Teams 
  - Add team stats -- for now Teams will only have a player list
  - Add dynamic team sizes -- for now Teams are limited to 25 players
* Driver
  - Add support for searching with secondary friend codes
  - Print the teams in a specific division, and optionally their player list
  - Add output when a player or team isn't found
  - Make the entire program loopable
* General
  - Add support for the unedited registry CSV
  - Add support for launching without a ```.bat``` file
  - (Probably Not) Add GUI
