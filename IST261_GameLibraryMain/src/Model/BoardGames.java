package Model;

//class for BoardGames
public class BoardGames extends Games 
{
	private String releaseDate;
	
	//constructor overload
	public BoardGames(String name, String genre, String system, int playerCount, String releaseDate)
	{
		super(name, genre, system, playerCount);
		this.releaseDate = releaseDate;
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

}