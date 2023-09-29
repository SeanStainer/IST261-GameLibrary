package Model;

//super class
public class Developers
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
	public String getGraphicsDesigner() 
	{
		return graphicsDesigner;
	}
	
	public void setGraphicsDesigner(String graphicsDesigner) 
	{
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
	