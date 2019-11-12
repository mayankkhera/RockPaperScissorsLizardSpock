/*
 * Name: Mayank Khera
 * Student ID: 040912734
 * Course & Section: CSR8132 302
 * Assignment: Lab5
 * Date: Oct 23, 2018
 */

package rps;

/**Child class of the game and implementing all it's abstracts, also joining the whole program together
 * 
 * @author Mayank
 * @version 1.1
 * @since 1.8
 *
**/
public class RockPaperScissors extends Game{//child class RockPaperScissors declared with Game as parent class
	
	/**Constructor taking an integer as a parameter and initiating the number of rounds
	 * 
	 * @param numRounds: int
	 */
	public RockPaperScissors(int numRounds) {
		super(numRounds);//invoking super constructor with an int parameter indicating the number of rounds
	}
	
	/**This method initializes the players by their names, prompts user for an input and initializes it with input, whereas initiates the computer player with it's default name in it's class
	 * @param: no parameters
	 * @return: returns void
	 */
	public void initPlayers() {//initPlayers implemented
		System.out.print("Enter player name: ");//prompts user to enter name
		
		players[0] = new Human(in);//creates a human player with scanned String as parameter
		players[1] = new Computer("HAL1");//creates a computer player with the name HAL1
		
		System.out.println();
	}//initializes players 
	
	/**This method loops through the array of players and allows each player to take turn
	 * @param: no parameters
	 * @return: returns void
	 */
	public void play() {//Play method implemented
		for(int i = 1; i<=numRounds; i++) {
			if(!players[0].takeTurn())//human takes turn and if he decides to quit it break the loop
				break;
			System.out.println();//to make program output look good :)
			players[1].takeTurn();//HAL1 takes turn
			System.out.println();//to make program output look good :)
			evaluateRound();//evaluates the round and declares the winner for the round
		}//for loop, allows computer and user to take turns equal to the number of rounds
	}
	
	/**This method evaluates each round and declares winner increases his number of wins or ties accordingly
	 * @param: no parameters
	 * @return: returns void
	 */
	public void evaluateRound() {//implemented evaluateRound
		HandSign[] moves = new HandSign[] {players[0].getLastMove(), players[1].getLastMove()};
		int winner = HandSign.getWinner(moves);//local variable hold the index of the winner 
		if(winner == -1) {
			Player.tie();
			System.out.println("It's a tie!");
			System.out.println("Ties: "+Player.getTies());
		}//if HandSign returns -1 it's a tie and it calls methods accordingly
		
		else if(winner != -1) {
			System.out.println(moves[winner]+" beats "+moves[Math.abs(winner-1)]+"!"+players[winner].getName()+" wins!");
			players[winner].win();
			System.out.println("Wins: "+players[winner].getWins());
		}//if HandSign is not -1, it's either 0 or 1 which are the index of the winner
		System.out.println();//to make program output look good :)
	}
	
	/**This method displays the result of the game once all the rounds are done, it prints both their name along with their wins and ties between them and declaring the winner right after
	 * @param: no parameters
	 * @return: returns void
	 */
	public void displayResults() {
		Player winner = null;//a player data type is created to declare winner and initialized as null for now
		System.out.println(players[0].toString());//invokes and prints the overridden toString method of the player class 
		System.out.println();//to make program output look good :)
		System.out.println(players[1].toString());//invokes and prints the overridden toString method of the player class
		System.out.println();//to make program output look good :)
		
		//which ever player has more wins than the half of the number of rounds is declared winner
		if (players[0].getWins()>(numRounds/2))
			winner = players[0];
		
		if(players[1].getWins()>(numRounds/2))
			winner = players[1];
		
		System.out.println("Ties: "+Player.getTies());//displays 
		System.out.println();//to make program output look good :)
		
		if(winner == null)//if winner remains null after getting wins it's a tie
			System.out.println("It's a tie game!");
		
		if(winner != null)//if winner doesn't remain null implies a winner is declared and prints results accordingly
			System.out.println("The winner is "+winner.getName());
		
		System.out.println();//to make the program output look good :)
		System.out.println("M to play more rounds(two more rounds)");
		System.out.println("E to exit");
		System.out.print("Choose your option: ");
		String rounds = in.next().substring(0,1).toUpperCase();
		boolean java = false;
		
		do {
			
			switch(rounds) {
			
			case "M":
				System.out.println();
				increasingRound();
				break;
			
			case "E":
				System.out.println("Thanks for playing Rock, Paper, Scissors. Bye!");//to make program output look good :)
				break;
			
			default:
				System.out.println("Invalid input!, try again..");
				java = true;
			}
			
		}while(java);
		
		
	}
	 /**This method is made to increase the number of rounds by the end of the game to give loser the chance to win the game back a.k.a. poor loser
	  * @param: no parameters
	  * @return: returns void
	  */
	public void increasingRound() {//increases number of rounds by two invoked in the displayResults method at user's will and invokes the displayResult method again giving the user choice to invoke itself again
		
		for(int i = 1; i<=2; i++) {
			if(!players[0].takeTurn())//human takes turn and if he decides to quit it break the loop
				break;
			System.out.println();//to make program output look good :)
			players[1].takeTurn();//HAL1 takes turn
			System.out.println();//to make program output look good :)
			evaluateRound();//evaluates the round and declares the winner for the round
		}//for loop, allows computer and user to take turns equal to the number of rounds
		System.out.println();//to make program output look good :)
		displayResults();//displays results and also prompts the user to increase rounds at the end aka poor loser
		
	}

}

//ELEVATOR STATEMENT
//The program starts running from the main method which initiates RockPaperScissors with 3 rounds and which then calls it's super class Game class which initiates the number of players and the only scanner in the program and invokes initPlayer which prompts user to input name and the computer player is initiated with the HAL name by default; after that the main class invokes the play method which allows players to take turns and then invokes displayResults to display the game result and increase the number of rounds if user wants to.
