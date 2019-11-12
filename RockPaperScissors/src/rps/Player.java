/*
 * Name: Mayank Khera
 * Student ID: 040912734
 * Course & Section: CSR8132 302
 * Assignment: Lab5
 * Date: Oct 23, 2018
 */

package rps;

/**This abstract class creates an idea of what a player does, and what all properties an attributes it has
 * 
 * @author Mayank
 * @version 1.1
 * @since 1.8
 *
**/
public abstract class Player {
	
	/**This variable holds name for a player, it is final because we do not allow a player to modify name mid-way the program
	 * 
	 */
	protected final String name;//every player has this property and cannot be modified once initialized
	
	/**HandSign property declared, named lastMove
	 * 
	 */
	protected HandSign lastMove;
	
	/**This variable holds the number of wins each player, each player has it's own number of wins
	 * 
	 */
	protected int wins;//number of wins inherited by every single child class
	
	/**This variable holds the number of ties between the players and all players share the number of ties so it has been declared static
	 * 
	 */
	public static int ties = 0;//static because all the players share the number of ties
	
	/**Constructor that takes a String as a parameter and initializes player's name with that String
	 * also initializes number of wins as zero
	 * @param name: String
	 */
	public Player (String name) {
		this.name = name;
		this.wins = 0;
	}//constructor taking a string as a parameter and initializing wins and name
	
	/**Getter method for name of the player
	 * @param: no parameters
	 * @return: name of the player
	 */
	public String getName() {
		return name;
	}//getter for player's name
	
	/**Getter method for the handSign property of the player
	 * @param: no parameters
	 * @return: lastMove of the player
	 */
	public HandSign getLastMove() {
		return lastMove;
	}//getter for HandSign property
	
	/**Getter method for number of wins for a player
	 * @param: no parameters
	 * @return: an int which is the number of wins of a player
	 */
	public int getWins() {
		return wins;
	}//getter for number of wins
	
	/**Getter method for Ties between the players, because the number of ties between the players are shared, the method declared is static
	 * @param: no parameters
	 * @return: returns an int which are the number of ties between the player
	 */
	public static int getTies() {//this method is static because num of ties are shared within all players
		return ties;
	}//getter for number of ties
	
	/**This method increments the number of wins of a player by one
	 * @param: no parameters
	 * @return: returns void
	 */
	public void win() {
		wins = wins + 1;
	}//increases number of wins by one once invoked
	
	/**This method increments the number of ties between the players by one, because ties are a shared property the method declared is static
	 * @param: no parameters
	 * @return: returns void
	 */
	public static void tie() {//ties are shared by every player, so they are going to be incremented together, hence a static method
		ties = ties + 1;
	}//increments number of ties once invoked
	
	/**This is an overridden method of the object class
	 * @param: no parameters
	 * @return: returns a String including player's name and wins
	 */
	public String toString() {
		return ("Player: "+name+"\nWins: "+wins);
	}//return number of wins and player name once invoked
	
	/**This is an abstract method returning a boolean, allows players to take turns and is different for a computer and a human, implemented differently in child classes
	 * @param: no parameters
	 * @return: returns a boolean indicating if the operation was successful or not
	 */
	public abstract boolean takeTurn();//abstract method implemented differently in inheriting child classes
	
}
