package csce247.assignments.command;

/**
 * @author Cameron Brandenburg
 * A type of Command where the player jumps
 */
public class JumpCommand implements Command {
	
	/**
	 * Instance of the player
	 */
	private Player player;
	
	/**
	 * Parameterized constructor for JumpCommand
	 * @param player The player that will execute the command
	 */
	public JumpCommand(Player player) {
		this.player = player;
	}
	
	/**
	 * Executes the command on the player
	 */
	public void execute() {
		player.jump();
	}
}
