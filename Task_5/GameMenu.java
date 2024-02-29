import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{

	private ArrayList<String> actions = new ArrayList<>();

	public GameMenu(ArrayList<String> actions){
		this.actions = actions;

	}

	public void displayMenu(){
		for (int i = 0; i < actions.size(); i++){
			System.out.println((i+1)+". "+actions.get(i));
		}
	}

	public String getAction(){
		System.out.println("Type a number to choose an action");
		displayMenu();

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        return choice;

	}

}