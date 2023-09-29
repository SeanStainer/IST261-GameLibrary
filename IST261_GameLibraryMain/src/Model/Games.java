package Model;

public class Games
{
	//stores name of game
	protected String name;
	//store games genre
	protected String genre;
	//stores what systems the game can be played on
	protected String system;
	//how many players can play the game
	protected int playerCount;
	
	//constructor overload
	public Games(String name, String genre, String system, int playerCount)
	{
		//initialize variables based on parameters passed
		this.name = name;
		this.genre = genre;
		this.system = system;
		this.playerCount = playerCount;
	}
	
	//getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public int getPlayerCount() {
		return playerCount;
	}

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}
	
	//to string method to display all information within class
	public String toString()
	{
		return "Name: " + this.getName() + "\nGenre: " + this.getGenre() +
			   "\nSystem: " + this.getSystem() + "\nPlayer Count: " + this.getPlayerCount();
	}

}
