import java.util.Scanner;					//imports scanner class
	
public class DoorMazeGame {

	//main method
	public static void main(String[] args) {

		//creates objects of Room class with specified field values
		Room monsterRoom = new Room("Monster Room", true, false);
		Room room6 = new Room("The Last Cave", false, true);
		Room room5 = new Room("The Fifth Cave", monsterRoom, room6, false, false);
		Room room4 = new Room("The Fourth Cave", room5, monsterRoom, false, false);
		Room room3 = new Room("The Third Cave", monsterRoom, room4, false, false);
		Room room2 = new Room("The Second Cave", room3, monsterRoom, false, false);
		Room room1 = new Room("The First Cave", room2, monsterRoom, false, false);
		
		//creates an object of Player class with two lives starting in room1
		Player player1 = new Player(2, room1);



		///////////////////////////////////////////////////////////////////////////////////////////


		//prints string specified in brackets
		System.out.println("\nWelcome to DoorMazeGame!");

		//prints rules
		String intro = "\nChoose the door that doesnt contain the monster or get attacked! \n"
					 + "Rules:\n"
					 + "Choose either the Red Door or the Blue Door to escape the caves.\n"
					 + "Type 'red' to choose the Red Door or 'blue' to choose Blue Door. \n"
					 + "If the cave you choose contains a monster then the monster will be \n"
					 + "released into your cave and attack. You will then lose one life";

		//prints message telling user to input their name
		System.out.println(intro + "\nEnter player name then press the enter key:");

		//creates an object of scanner class
		Scanner scanner1 = new Scanner(System.in);

		//sets player name as next line inputted by user
		player1.setName(scanner1.nextLine());

		//prints string saying player creates
		System.out.println("Player created!");

		//prints player stats
		System.out.println("\nPlayer Stats:\n"
							+ "Name: " + player1.getName()
							+ "\nLives: " + player1.getLives()
							+ "\nCurrent room: " + player1.getRoom().getName());


		//prints string message signalling start of game
		System.out.println("\nTime to escape!");

	

		///////////////////////////////////////////////////////////////////////////////////////
		//start of game


		//prints multi line string asking player to choose a door with instructions
		System.out.println("\nWhich door do you choose?:\n"
							+ "Type 'red' to choose the Red Door or 'blue' to choose Blue Door");
		
		//creates a string variable with empty value
		String choice = "";
		

		/*does the instructions in the bracket then evaluates the while statement
		  if the while statement evaluates to true then it is looped back to the 
		  top of the do set of instructions. if the while statement evaluates to 
		  false then the instructions after the while statement are carried out*/

		do {
		
		//assigns value of string variable to the next line of user input
		choice = scanner1.nextLine();

			//if user input is "blue" then the instrutions in the following braces are carried out
			if (choice.equals("blue") ) {

				//moves the player to room2 then prints the result of the method
				System.out.println(player1.moveToRoom(room2));

			//if user input is "red" then the instructions in the braces are carried out
			} else if (choice.equals("red")) {

				//moves player to monster room and prints the result of the method doing it
				System.out.println(player1.moveToRoom(monsterRoom));

				//prints the players stats
				System.out.println("\nPlayer Stats:\n"
							+ "Name: " + player1.getName()
							+ "\nLives: " + player1.getLives()
							+ "\nCurrent room: " + player1.getRoom().getName());

			
				//if player runs out of lives the game is ended
				if (player1.getLives() == 0) {
					
					//prints string message
					System.out.println("\nYou have run out of lives!");
				
					//prints string message
    				System.out.println("\nGAME OVER!");

    				//exits main method to end the program and end the game
    				return;
				
				}

				//prints multi line string message with hint 
				System.out.println("\nWhich door do you choose?\n"
							+ "Hint: choose the other door\n"
							+ "Type 'red' to choose the Red Door or 'blue' to choose Blue Door");

			//if user inputs invalid response then instructions are carried out
			} else {

				//prints message 
				System.out.println("\nInvalid instruction\nType 'red' to choose the Red Door or 'blue' to choose Blue Door");
				
			}

		//condition for above instructions to be carried out whie statement evaluates to true
		} while ( !choice.equals("blue") ) ;

	
		//player has moved into next room, prints room moving into
		System.out.println("\nYou moved into " + room2.getName());


		//prints player stats
		System.out.println("\nPlayer Stats:\n"
							+ "Name: " + player1.getName()
							+ "\nLives: " + player1.getLives()
							+ "\nCurrent room: " + player1.getRoom().getName());


		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		//2ND CAVE


		//BELOW ARE BASED ON FIRST ROOM- SEE ABOVE FOR COMMENTS


		System.out.println("\nWhich door do you choose?:\n"
							+ "Type 'red' to choose the Red Door or 'blue' to choose Blue Door");
		
		choice = "";
		
		do {
		
		choice = scanner1.nextLine();

			if (choice.equals("blue") ) {

				

				System.out.println(player1.moveToRoom(room3));

			} else if (choice.equals("red")) {

				

				System.out.println(player1.moveToRoom(monsterRoom));

				

				System.out.println("\nPlayer Stats:\n"
							+ "Name: " + player1.getName()
							+ "\nLives: " + player1.getLives()
							+ "\nCurrent room: " + player1.getRoom().getName());

				

				if (player1.getLives() == 0) {
					
					System.out.println("\nYou have run out of lives!");
				
					

    				System.out.println("\nGAME OVER!");

    				return;
				
			}

				
				System.out.println("\nWhich door do you choose?\n"
							+ "Hint: choose the other door\n"
							+ "Type 'red' to choose the Red Door or 'blue' to choose Blue Door");

		
			} else {

				System.out.println("\nInvalid instruction\nType 'red' to choose the Red Door or 'blue' to choose Blue Door");

			}

		} while ( !choice.equals("blue") ) ;

	
		

		System.out.println("\nYou moved into " + room3.getName());

		
		
		System.out.println("\nPlayer Stats:\n"
							+ "Name: " + player1.getName()
							+ "\nLives: " + player1.getLives()
							+ "\nCurrent room: " + player1.getRoom().getName());


		/////////////////////////////////////////////////////////////////////////////////////////

		//3RD CAVE

			System.out.println("\nWhich door do you choose?:\n"
							+ "Type 'red' to choose the Red Door or 'blue' to choose Blue Door");
		
		choice = "";
		
		do {
		
		choice = scanner1.nextLine();

			if (choice.equals("red") ) {

				
				System.out.println(player1.moveToRoom(room4));

			} else if (choice.equals("blue")) {

				

				System.out.println(player1.moveToRoom(monsterRoom));

				

				System.out.println("\nPlayer Stats:\n"
							+ "Name: " + player1.getName()
							+ "\nLives: " + player1.getLives()
							+ "\nCurrent room: " + player1.getRoom().getName());

				

				if (player1.getLives() == 0) {
					
					System.out.println("\nYou have run out of lives!");
				
					

    				System.out.println("\nGAME OVER!");

    				return;
				
			}

				
				System.out.println("\nWhich door do you choose?\n"
							+ "Hint: choose the other door\n"
							+ "Type 'red' to choose the Red Door or 'blue' to choose Blue Door");

		
			} else {

				System.out.println("\nInvalid instruction\nType 'red' to choose the Red Door or 'blue' to choose Blue Door");

			}

		} while ( !choice.equals("red") ) ;

	
		

		System.out.println("\nYou moved into " + room4.getName());

		
		
		System.out.println("\nPlayer Stats:\n"
							+ "Name: " + player1.getName()
							+ "\nLives: " + player1.getLives()
							+ "\nCurrent room: " + player1.getRoom().getName());


		///////////////////////////////////////////////////////////////////////////////////

		//4TH CAVE

		System.out.println("\nWhich door do you choose?:\n"
							+ "Type 'red' to choose the Red Door or 'blue' to choose Blue Door");
		
		choice = "";
		
		do {
		
		choice = scanner1.nextLine();

			if (choice.equals("blue") ) {

				

				System.out.println(player1.moveToRoom(room5));

			} else if (choice.equals("red")) {


				System.out.println(player1.moveToRoom(monsterRoom));

				

				System.out.println("\nPlayer Stats:\n"
							+ "Name: " + player1.getName()
							+ "\nLives: " + player1.getLives()
							+ "\nCurrent room: " + player1.getRoom().getName());

				

				if (player1.getLives() == 0) {
					
					System.out.println("\nYou have run out of lives!");
				
					

    				System.out.println("\nGAME OVER!");

    				return;
				
			}

				
				System.out.println("\nWhich door do you choose?\n"
							+ "Hint: choose the other door\n"
							+ "Type 'red' to choose the Red Door or 'blue' to choose Blue Door");

		
			} else {

				System.out.println("\nInvalid instruction\nType 'red' to choose the Red Door or 'blue' to choose Blue Door");

			}

		} while ( !choice.equals("blue") ) ;

	
		

		System.out.println("\nYou moved into " + room5.getName());

		
		
		System.out.println("\nPlayer Stats:\n"
							+ "Name: " + player1.getName()
							+ "\nLives: " + player1.getLives()
							+ "\nCurrent room: " + player1.getRoom().getName());


		//////////////////////////////////////////////////////////////////////////////////////
		//5TH CAVE


	
		System.out.println("\nWhich door do you choose?:\n"
							+ "Type 'red' to choose the Red Door or 'blue' to choose Blue Door");
		
		choice = "";
		
		do {
		
		choice = scanner1.nextLine();

			if (choice.equals("red") ) {

				
				System.out.println(player1.moveToRoom(room6));

			} else if (choice.equals("blue")) {

				

				System.out.println(player1.moveToRoom(monsterRoom));

				

				System.out.println("\nPlayer Stats:\n"
							+ "Name: " + player1.getName()
							+ "\nLives: " + player1.getLives()
							+ "\nCurrent room: " + player1.getRoom().getName());

				

				if (player1.getLives() == 0) {
					
					System.out.println("\nYou have run out of lives!");
				
					

    				System.out.println("\nGAME OVER!");

    				return;
				
			}

				
				System.out.println("\nWhich door do you choose?\n"
							+ "Hint: choose the other door\n"
							+ "Type 'red' to choose the Red Door or 'blue' to choose Blue Door");

		
			} else {

				System.out.println("\nInvalid instruction\nType 'red' to choose the Red Door or 'blue' to choose Blue Door");

			}

		} while ( !choice.equals("red") ) ;

	
		

		System.out.println("\nYou moved into " + room6.getName());

		
		
		System.out.println("\nPlayer Stats:\n"
							+ "Name: " + player1.getName()
							+ "\nLives: " + player1.getLives()
							+ "\nCurrent room: " + player1.getRoom().getName());



		///////////////////////////////////////////////////////////////////////////////////////

		//THE FINAL CAVE

		
		//prints message
		System.out.println("\nYou reached the final cave!\n");

		
		//prints message
		System.out.println("The exit is in sight!!!");

		
		//prints message
		System.out.println("\nYou escaped!!!");

		
		//prints message
		System.out.println("\nCongratulations, you won the game!");

	}
}