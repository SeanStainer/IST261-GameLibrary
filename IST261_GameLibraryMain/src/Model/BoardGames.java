package Model;

import java.util.ArrayList;

//class for BoardGames
public class BoardGames extends Games implements comparable
{
	//stores release date for game
	private String releaseDate;
	//stores developer information
	private ArrayList<Developers> developerInfo;
	//stores just the year from release date
	String year = "";
	
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

	
	public int releaseDateYear(String releaseDate) 
	{
		
		for(int i = 0; i < releaseDate.length(); i++)
		{
			if(releaseDate.charAt(i) != '-')
			{
				year += releaseDate.charAt(i);
			}
		}
		
		return Integer.parseInt(year);
	}
	
	public boolean compareReleaseDates(Object game) {
		
		BoardGames obj = (BoardGames) game;
		
		if(this.releaseDateYear(this.releaseDate) > obj.releaseDateYear(obj.releaseDate))
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	

}