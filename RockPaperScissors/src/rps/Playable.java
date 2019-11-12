/*
 * Name: Mayank Khera
 * Student ID: 040912734
 * Course & Section: CSR8132 302
 * Assignment: Lab5
 * Date: Oct 23, 2018
 */

package rps;

/**This is an interface which is later on implemented to play the game
 * @author Mayank
 * @version 1.1
 * @since 1.8
 *
 */
public interface Playable {
	
	static final int NUM_PLAYERS = 2;//static final variable so that it cannot be modified mid-game and is shared by all the calsses
	
	//abstract methods of the interface which are implemented in later classes
	
/**This method is an abstract and will initialize players when invoked after implemented
 *@param no parameters 
 */
	public abstract void initPlayers();//invoked in Game class and implemented in RockPaperScissors class
	
/**This method is an abstract and will be implemented later in the program to allow players to take turn
 * @param no parameters 
 */
	public abstract void play();//implemented in RockPaperScissors class
	
/**This method is an abstract and will be implemented later in the program to evaluate the results after every round and increments wins accordingly
 * @param no parameters	
 */
	public abstract void evaluateRound();//implemented in RockPaperScissors class
	
/**This method is an abstract and will be implemented later in the program to print results at the end of the game and declare the winner
 * @param no parameters
 */
	public abstract void displayResults();//implemented in RockPaperScissors class
	
}//all the methods are abstract and their access level is public.
