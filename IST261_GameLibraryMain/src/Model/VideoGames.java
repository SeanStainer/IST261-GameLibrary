package Model;

public class VideoGames extends Games
{
	private String releaseDate;
	
	//constructor overload
	public VideoGames(String name, String genre, String system, int playerCount, String releaseDate)
	{
		super(name, genre, system, playerCount);
		this.releaseDate = releaseDate;
	}

	//getter and setter methods
	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	//to string method to display all information within class
	public String toString()
	{
		return super.toString() + "\nRelease Date: " + this.getReleaseDate();
	}

}