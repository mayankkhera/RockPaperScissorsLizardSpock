/*
 * Name: Mayank Khera
 * Student ID: 040912734
 * Course & Section: CSR8132 302
 * Assignment: Lab5
 * Date: Oct 23, 2018
 */

package rps;

/**This the main class of the program invoking the methods important for program to run
 * 
 * @author Mayank
 * @version 1.1
 * @since 1.8
 *
**/
public class PlayGame {//main class of the program
	
	/**Main method of the class instantiating RockPaperScissors with 3 rounds and invoking play and displayResults methods of the class
	 * @return: returns void
	 * @param args Command line arguments-NOT USED
	 */
	public static void main(String[] args) {
		
		Playable mk = new RockPaperScissors(3);//instanciates a playable interface as a RockPaperScissors
		
		mk.play();//invokes play method which allows user to take turn
		mk.displayResults();//displays result after the all the rounds finish
	}//end of main method

}//end of class
