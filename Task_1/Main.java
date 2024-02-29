class Main {
	public static void main(String[] args) {
		Team kageTeam = new Team("Kagegruppen");
		kageTeam.setRank(12);
		System.out.println(kageTeam);

		Team[] newTeams = new Team[5];
        String[] teamNames = {"Team1", "Team2", "Team3", "Team4", "Team5"};

		for (int i = 0; i < newTeams.length; i++){
			newTeams[i] = new Team(teamNames[i]);
			System.out.println(newTeams[i].toString());
		}
	}
}