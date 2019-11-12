/*
 * Name: Mayank Khera
 * Student ID: 040912734
 * Course & Section: CSR8132 302
 * Assignment: Lab5
 * Date: Oct 23, 2018
 */

package rps;
import java.util.Scanner;

/**This is a child class Human inherted from the abstract class player and implementing it's abstract properties
 * 
 * @author Mayank
 * @version 1.1
 * @since 1.8
 *
**/
public class Human extends Player{//child class Human declared with Player as the parent class

	/**This an instance declared for a Scanner 
	 * 
	 */
	protected Scanner in;//there is only one scanner in the whole program which is in game class and is being passed into classes
	
	/**This constructor takes a scanner in as a parameter and invokes the super constructor with the scanned value
	 * 
	 * @param in: Scanner
	 */
	public Human (Scanner in) {
		super(in.next());//super constructor invoked with a scanned String as a parameter
		this.in = in;//initializing scanner
		
	}//constructor take scanner as a parameter and invokes super constructor with the scanned String
	
	/**Abstract method from the super class implemented and allows this player to take turn and choose his HandSign property
	 * @param: no parameters
	 * @return: returns a boolean indicating if the action was successful or not, because the human player has the choice to quit the game
	 */
	public boolean takeTurn() {//because human is a child class of Player it has to implement all it's abstract methods or else it won't compile.
		boolean boo = false;//local variable declared to control do-while loop
		do {
			System.out.print(getName()+" it's your turn!(Enter RO Rock, PA for Paper, SC for Scissors, LI for Lizard, SP for Spock or QU to quit) ");//prompts user to take turn
			String java = in.next().substring(0,2).toUpperCase();//first letter of the string entered is converted to uppercase and stored into this local variable
			boo = true;//boolean switched to true to prevent loop from running again
			switch(java) {//switch statement to do whatever needs to be done according to the input 
			case "QU"://case q is to quit the game
				return false;//returns false indicating that the take turn method wasn't successful
				
			case "RO":
			case "PA":
			case "SC":
			case "LI":
			case "SP":
				lastMove = HandSign.getHandSign(java);
				System.out.println(getName()+" played "+lastMove.name());
				break;
			default://incase the user inputs anything other than the expected string
				System.out.println("Invalid Input, please try again..");
				System.out.println();//to make program output look good :)
				boo = false;//boolean is turned to false and the loop is set to run again until the user enters an expected input
			}//end of do nothing loop
		}while(!boo);
		
		return true;//returning true to indicate that the operation was successful
	}
	
}