package Model;

import java.util.ArrayList;

public class VideoGames extends Games
{
	//stores release date for game
	private String releaseDate;
	//stores a boolean value if they won game of the year on release year
	private boolean gameOfTheYear;
	//stores developer information
	private ArrayList<Developers> developerInfo;
	
	
	
	//constructor overload
	public VideoGames(String name, String genre, String system, int playerCount, String releaseDate, boolean gameOfTheYear, ArrayList<Developers> developerInfo)
	{
		super(name, genre, system, playerCount);
		this.releaseDate = releaseDate;
		this.gameOfTheYear = gameOfTheYear;
		this.developerInfo = developerInfo;
	}

	//getter and setter methods
	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public ArrayList<Developers> getDeveloperInfo() {
		return developerInfo;
	}

	public void setDeveloperInfo(ArrayList<Developers> developerInfo) {
		this.developerInfo = developerInfo;
	}
	
	public boolean getGameOfTheYear() {
		return gameOfTheYear;
	}

	public void setGameOfTheYear(boolean gameOfTheYear) {
		this.gameOfTheYear = gameOfTheYear;
	}

	//to string method to display all information within class
	public String toString()
	{
		return super.toString() + "\nRelease Date: " + this.getReleaseDate() + "\nGOTY Winner: " + this.getGameOfTheYear() 
								+ "\nDevleoper Info: \n" + developerInfo;
	}


	

}