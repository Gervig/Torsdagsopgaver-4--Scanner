import java.util.ArrayList;

class Client {
	public static void main(String[] args) {

		ArrayList<String> actions = new ArrayList<>();
		actions.add("Start game");
		actions.add("Resume game");
		actions.add("Pause game");
		actions.add("End game");

	// System.out.print(actions.get(2)); // expected output: "Pause game"

		GameMenu myGame = new GameMenu(actions);

		myGame.displayMenu();

}
}