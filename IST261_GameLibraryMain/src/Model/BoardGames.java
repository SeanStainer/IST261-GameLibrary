package Model;

import java.util.ArrayList;

//class for BoardGames
public class BoardGames extends Games 
{
	//stores release date for game
	private String releaseDate;
	//stores developer information
	private ArrayList<Developers> developerInfo;
	
	//constructor overload
	public BoardGames(String name, String genre, String system, int playerCount, String releaseDate,  ArrayList<Developers> developerInfo)
	{
		super(name, genre, system, playerCount);
		this.releaseDate = releaseDate;
		this.developerInfo = developerInfo;
	}
	
	//getter and setter methods
	public String getReleaseDate()
	{
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) 
	{
		this.releaseDate = releaseDate;
	}
		
	public ArrayList<Developers> getDeveloperInfo() 
	{
		return developerInfo;
	}

	public void setDeveloperInfo(ArrayList<Developers> developerInfo) 
	{
		this.developerInfo = developerInfo;
	}

	//to string method to display all information within class
	public String toString()
	{
		return super.toString() + "\nRelease Date: " + this.getReleaseDate()
								+ "\nDevleoper Info: \n" + developerInfo;
	}


}