package Model;

public class GameLibraryModel 
{
	//super class
	public static class Developers
	{
		//stores information on the developers of the game
		private String graphicsDesigner;
		private String publisher;
		private String programmer;
		private String artist;
		private String soundDesigner;
		
		//default constructor
		public Developers()
		{
			//initialize each variable
			this.graphicsDesigner = "";
			this.publisher = "";
			this.programmer = "";
			this.artist = "";
			this.soundDesigner = "";
		}
		
		//constructor overload
		public Developers(String graphicsDesigner, String publisher, String programmer, String artist, String soundDesigner)
		{
			//initialize variables based on parameters passed
			this.graphicsDesigner = graphicsDesigner;
			this.publisher = publisher;
			this.programmer = programmer;
			this.artist = artist;
			this.soundDesigner = soundDesigner;
		}

		//getter and setter methods
		public String getGraphicsDesigner() {
			return graphicsDesigner;
		}

		public void setGraphicsDesigner(String graphicsDesigner) {
			this.graphicsDesigner = graphicsDesigner;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public String getProgrammer() {
			return programmer;
		}

		public void setProgrammer(String programmer) {
			this.programmer = programmer;
		}

		public String getArtist() {
			return artist;
		}

		public void setArtist(String artist) {
			this.artist = artist;
		}

		public String getSoundDesigner() {
			return soundDesigner;
		}

		public void setSoundDesigner(String soundDesigner) {
			this.soundDesigner = soundDesigner;
		}
		
		
	}
	
	public static class Games
	{
		//stores name of game
		private String name;
		//store games genre
		private String genre;
		//stores what systems the game can be played on
		private String system;
		//how many players can play the game
		private int playerCount;
		
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
	
	//class for BoardGames
	public static class BoardGames extends Games 
	{
		private String releaseDate;
		
		//constructor overload
		public BoardGames(String name, String genre, String system, int playerCount, String releaseDate)
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

	}
	
	//class for Video Games
	public static class VideoGames extends Games
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
	
	//class for Card Games
	public static class CardGames extends Games
	{
		//constructor overload
		public CardGames(String name, String genre, String system, int playerCount)
		{
			super(name, genre, system, playerCount);
		}
	}
}
