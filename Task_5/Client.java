import java.util.ArrayList;
import java.util.Scanner;

class Client {
	public static void main(String[] args) {

		ArrayList<String> actions = new ArrayList<>();
		actions.add("Start game");
		actions.add("Resume game");
		actions.add("Pause game");
		actions.add("End game");

	// System.out.print(actions.get(2)); // expected output: "Pause game"

		GameMenu myGame = new GameMenu(actions);

		String userChoice = myGame.getAction();

		int userChoiceInt = Integer.parseInt(userChoice);
		doAction(userChoiceInt);

		System.out.println(doAction(userChoiceInt));

	}
	public static String doAction(int userChoiceInt){

		switch (userChoiceInt) {
		case 1:
			return "Starting the game now";
		case 2:
			return "Fetching the previously saved game data";
		case 3:
			return "Game paused";
		case 4:
			return "End game";
		default:
			return "Invalid choice";
		}
	}
}