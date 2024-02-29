import java.util.ArrayList;

class GameMenu {

	private ArrayList<String> actions = new ArrayList<>();

	public GameMenu(ArrayList<String> actions){
		this.actions = actions;

	}

	public void displayMenu(){
		System.out.println(actions);
	}

}