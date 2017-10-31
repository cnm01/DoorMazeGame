public class Room {
	
	//field values
	private String name;
	private Room blueDoorRoom;
	private Room redDoorRoom;
	private boolean containsMonster;
	private boolean isFinalRoom;

	//constructor method allows objects to be created with values specified for the field variables
	public Room(String name, Room blueDoorRoom, Room redDoorRoom,
				  boolean containsMonster, boolean isFinalRoom	 ) {
		
		this.name = name;
		this.blueDoorRoom = blueDoorRoom;
		this.redDoorRoom = redDoorRoom;
		this.containsMonster = containsMonster;
		this.isFinalRoom = isFinalRoom;
	
	}


	//alternative constructor method allows objects to be create with values specified for some of the field variables
	public Room(String name, boolean containsMonster, boolean isFinalRoom) {

		this.name = name;
		this.containsMonster = containsMonster;
		this.isFinalRoom = isFinalRoom;

	}

	//returns value of name field
	public String getName() {
		return name;
	}

	
	
	//returns containsMonster field variable value
	public boolean getContainsMonster() {

		return containsMonster;

	}
}