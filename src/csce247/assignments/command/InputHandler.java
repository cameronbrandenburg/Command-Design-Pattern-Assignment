package csce247.assignments.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cameron Brandenburg
 * Handles user inputs and executes the commands corresponding to a hashmap value
 */
public class InputHandler {
	
	/**
	 * A hashmap that maps a String to a Command
	 */
	private HashMap<String, Command> map;
	
	/**
	 * Maps all the appropriate strings to their corresponding commands
	 * @param player The Player that will execute the commands
	 */
	public InputHandler(Player player) {
		map = new HashMap<String, Command>();
		map.put("jump", new JumpCommand(player));
		map.put("fire", new FireCommand(player));
		map.put("run", new RunCommand(player));
		map.put("quit", new QuitCommand());
	}
	
	/**
	 * Calls the corresponding command when the button is pressed (string is typed in console)
	 * @param command The button pressed (string typed in console)
	 */
	public void buttonPressed(String command) {
		map.get(command).execute();
	}
}
