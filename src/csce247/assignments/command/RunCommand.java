package csce247.assignments.command;

/**
 * @author Cameron Brandenburg
 * A type of Command where the player runs
 */
public class RunCommand implements Command {

	private Player player;
	
	/**
	 * Parameterized constructor for RunCommand
	 * @param player The player that will execute the command
	 */
	public RunCommand(Player player) {
		this.player = player;
	}
	
	/**
	 * Executes the command on the player
	 */
	public void execute() {
		player.runForward();
	}
}
