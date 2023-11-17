package Model;

import javafx.collections.ObservableList;

import java.io.*;
import java.util.ArrayList;

public class Game implements Serializable
{
	//stores name of game
	protected String name;
	//store games genre
	protected String genre;
	//stores what systems the game can be played on
	protected String system;
	//how many players can play the game
	protected int playerCount;

	//Create array lists to store data for each class
	public static ArrayList<VideoGames> videoGameData = new ArrayList<VideoGames>();

	public static ArrayList<BoardGames> boardGameData = new ArrayList<BoardGames>();
	public static ArrayList<CardGames> cardGameData = new ArrayList<CardGames>();

	//create strings for the filenames to store previously entered data
	private static final String vgDataFileName = "videoGames.ser";
	private static final String bgDataFileName = "boardGames.ser";
	private static final String cgDataFileName = "cardGames.ser";
	//constructor overload
	public Game(String name, String genre, String system, int playerCount)
	{
		//initialize variables based on parameters passed
		this.name = name;
		this.genre = genre;
		this.system = system;
		this.playerCount = playerCount;
	}

	public static void serializeVGModel(ObservableList<VideoGames> videoGamesObservable)
	{
		//save the entire array list of Video Games
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(vgDataFileName);
			out = new ObjectOutputStream(fos);
			out.writeObject(new ArrayList<VideoGames>(videoGamesObservable));
			out.close();
		}
		catch (IOException ex)
		{
            ex.printStackTrace();
        }
    }

	public static void serializeBGModel(ObservableList<BoardGames> boardGamesObservable)
	{
		//save the entire array list of Video Games
		FileOutputStream bfos = null;
		ObjectOutputStream bout = null;
		try {
			bfos = new FileOutputStream(bgDataFileName);
			bout = new ObjectOutputStream(bfos);
			bout.writeObject(new ArrayList<BoardGames>(boardGamesObservable));
			bout.close();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}

	public static void serializeCGModel(ObservableList<CardGames> cardGamesObservable)
	{
		//save the entire array list of Video Games
		FileOutputStream cfos = null;
		ObjectOutputStream cout = null;
		try {
			cfos = new FileOutputStream(cgDataFileName);
			cout = new ObjectOutputStream(cfos);
			cout.writeObject(new ArrayList<CardGames>(cardGamesObservable));
			cout.close();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}

	public static void restoreBGData()
	{
		FileInputStream bfis = null;
		ObjectInputStream bin = null;

		try {
			bfis = new FileInputStream(bgDataFileName);
			bin = new ObjectInputStream(bfis);
			boardGameData = (ArrayList<BoardGames>)bin.readObject();
			bin.close();
			if(boardGameData.isEmpty()){
				System.out.println("There are no Board games in the game list");
			}

			//test if data successfully stores into the array list
			//System.out.println(Game.videoGameData.toString());
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}


	}

	public static void restoreVGData()
	{
		FileInputStream fis = null;
		ObjectInputStream in = null;

		try {
			fis = new FileInputStream(vgDataFileName);
			in = new ObjectInputStream(fis);
			videoGameData = (ArrayList<VideoGames>)in.readObject();
			in.close();
			if(videoGameData.isEmpty()){
				System.out.println("There are no Video games in the games list");
			}

			//test if data successfully stores into the array list
			//System.out.println(Game.videoGameData.toString());
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}


	}

	public static void restoreCGData()
	{
		FileInputStream cfis = null;
		ObjectInputStream cin = null;

		try {
			cfis = new FileInputStream(cgDataFileName);
			cin = new ObjectInputStream(cfis);
			cardGameData = (ArrayList<CardGames>)cin.readObject();
			cin.close();
			if(cardGameData.isEmpty()){
				System.out.println("There are no Board games in the game list");
			}

			//test if data successfully stores into the array list
			//System.out.println(Game.videoGameData.toString());
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}


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
