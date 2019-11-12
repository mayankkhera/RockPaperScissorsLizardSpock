/*
 * Name: Mayank Khera
 * Student ID: 040912734
 * Course & Section: CSR8132 302
 * Assignment: Lab5
 * Date: Oct 23, 2018
 */
package rps;
import java.util.Scanner;

/**Game class implementing the interface Playable, it overrides some methods from the object class
 * 
 * @author Mayank
 * @version 1.1
 * @since 1.8
 *
**/
public abstract class Game implements Playable {//class implementing the Playable interface
	
	/**This instance declared represents the number of rounds to be played in the game
	 * 
	 */
	protected int numRounds;//number of rounds
	
	/**This is an array of Player data type
	 * 
	 */
	protected Player[] players;//array on Player data type
	
	/**a Scanner instance named in
	 * 
	 */
	protected Scanner in;
	
	/**Constructor taking an int as a parameter and initializing the number of rounds
	 * It also initializes the array of Players 
	 * @param numRounds: int
	 */
	public Game(int numRounds) {
		this.numRounds = numRounds;
		this.players = new Player[NUM_PLAYERS];//initializing new players with array length of NUM_PLAYER
		this.in = new Scanner(System.in);//scanner initialized & the only scanner used in the entire program which is being passed to inheriting child clases
		initPlayers();//abstract method invoked 
	}//constructor taking int as a parameter and initializing number of rounds
	
	/**This is an overridden method of the object class which closes the Scanner and catches the exceptions if there is any, and does nothing
	 * 
	 */
	public void finalize() {//overridden finalize method
		try {
			in.close();
		}catch(Exception e) {}//try and catch exception given in the instructions
	}
	
	
}//end of class
