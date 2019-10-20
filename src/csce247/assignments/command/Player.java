package csce247.assignments.command;

/**
 * @author Cameron Brandenburg
 * The player that executes all commands
 */
public class Player {
	
	/**
	 * Constructor that prints out when it is called
	 */
	public Player() {
		System.out.println("Our hero is born");
	}
	
	/**
	 * Prints out that the player executed the jump command
	 */
	public void jump() {
		System.out.println("Our hero jumps over a tall building");
	}
	
	/**
	 * Prints out that the player executed the fire command
	 */
	public void fire() {
		System.out.println("Our hero squirts his water gun, far into the sky");
	}
	
	/**
	 * Prints out that the player executed the run command
	 */
	public void runForward() {
		System.out.println("Our hero sprints faster than all the cars");
	}
}
