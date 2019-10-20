package csce247.assignments.command;

/**
 * @author Cameron Brandenburg
 * A type of command that is used to quit the program
 */
public class QuitCommand implements Command {
	
	/**
	 * Constructor for QuitCommand()
	 */
	public void QuitCommand() {}
	
	/**
	 * Executes the command on the player
	 */
	// never actually called as the driver ends the program before
	// this method is called
	public void execute() {}
}
