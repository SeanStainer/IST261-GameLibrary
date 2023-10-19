package Model;

public class CardGames extends Games
{
	//boolean value that stores if jokers are used in the game or not
	private boolean joker;
	
	//constructor overload
	public CardGames(String name, String genre, String system, int playerCount, boolean joker)
	{
		super(name, genre, system, playerCount);
		this.joker = joker;
	}
	
	//get and set functions
	public boolean isJoker() {
		return joker;
	}

	public void setJoker(boolean joker) {
		this.joker = joker;
	}

	//to string method to display all information within class
	public String toString()
	{
		return super.toString() + "\nJoker Used: " + joker;
	}
}
