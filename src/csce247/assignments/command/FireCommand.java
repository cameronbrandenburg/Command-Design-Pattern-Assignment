package csce247.assignments.command;

/**
 * @author Cameron Brandenburg
 * A type of Command where the player fires
 */
public class FireCommand implements Command {

	private Player player;
	
	/**
	 * Parameterized constructor for FireCommand
	 * @param player The player that will execute the command
	 */
	public FireCommand(Player player) {
		this.player = player;
	}
	
	/**
	 * Executes the command on the player
	 */
	public void execute() {
		player.fire();
	}
}
