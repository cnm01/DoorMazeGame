public class Player {
	
	//field variables
	private String name;
	private int lives;
	private Room currentRoom;

	//constructor method allows obects to be created with vlues specified for the field variables
	public Player(int lives, Room currentRoom) {
		
		this. lives = lives;
		this. currentRoom = currentRoom;

	}


	//returns name field variable value
	public String getName() {
		return name;
	}

	//return lives field variable value
	public int getLives() {
		return lives;
	}

	//returns which room the player is currently in
	public Room getRoom() {
		return currentRoom;
	}

	//set method allows the value for the name field variable to be changed
	public void setName(String name) {
		this.name = name;
	}


	/*changes the value of the currentRoom field variable to the room specified in the brackets
	if the room specified is a monster room then the player loses one life and a message is returned
	if the room specified is safe then the player advances to that room and the currentRoom variable is updated
	and a message is returned*/
	public String moveToRoom(Room room) {

		String correctRoom = "\nRoom is safe!";
		String monsterRoom = "\nRoom contained a monster! \nMonster Attacked! \nYou have lost a life";

		if (room.getContainsMonster() == true) {
			lives = lives - 1;
			return monsterRoom;
		} else {
			this.currentRoom = room;
			return correctRoom;
		}
		
	}

}