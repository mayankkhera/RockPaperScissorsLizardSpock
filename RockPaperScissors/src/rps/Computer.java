/*
 * Name: Mayank Khera
 * Student ID: 040912734
 * Course & Section: CSR8132 302
 * Assignment: Lab5
 * Date: Oct 23, 2018
 */

package rps;
import java.util.Random;

/**This is a child class Computer which inherits all the properties of it's parent class Player and implments all it's abstracts
 * 
 * @author Mayank
 * @version 1.1
 * @since 1.8
 *
 **/
public class Computer extends Player {//Computer class inheriting player 
	
	/**Default constructor taking no parameters and invoking the super class with the hard coded String "HAL"
	 * 
	 */
	public Computer(String name) {
		super(name);
	}//constructor invoking the superclass constructor with the name string parameter
	
	/**Implemented abstract method of the super class, which allows this player to take turn and selecting a HandSign randomly
	 * @return: returns boolean indicating if the operation was successful or not 
	 * @param: no parameters
	 */
	public boolean takeTurn() {//abstract method implemented from player in computer
		Random rd;//random instanciated
		rd = new Random();//random initialized
		lastMove = HandSign.values()[rd.nextInt(5)];//lastMove assigned a random integer,which changes it into rock paper or scissors
		System.out.print(getName()+", it's your turn!");//prompts computer for input
		System.out.println(getName()+" played "+lastMove.name());//computer plays it's hand
		return true;//returning true indicating that the method was succesful
	}

}
