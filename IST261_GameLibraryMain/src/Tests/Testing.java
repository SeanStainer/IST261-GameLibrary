package Tests;

import java.util.ArrayList;

import Model.BoardGames;
import Model.CardGames;
import Model.VideoGames;
import Model.Developers;
import Model.Game;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public abstract class Testing extends Application 
{
	
	public static void main(String[] args) 
	{
		/*
		 * Test entering data into each type of game
		 * 
		 * Print all information using the toString method in each class
		 * 
		 * */
		
		//Spacing for Video Game
		System.out.println("***** Video Game *****\n");
		
		/*		Video Game 
		 * 
		 *   Name  | Genre  | System | Player Count | Release Date | GOTY winner | Developers Array List 
		 *  String | String | String |   Integer    |    String    |   Boolean   |   Developers 
		 */
		
		//create developers array list to add
		ArrayList<Developers> vg1DeveloperInfo = new ArrayList<>();
		//test mutliple inputs of developers
		vg1DeveloperInfo.add(new Developers("Programmer", "CD Project", "Red"));
		vg1DeveloperInfo.add(new Developers("Artist", "Mark", "Madej"));
		vg1DeveloperInfo.add(new Developers("Sound Designer", "Marcin", "Przybyłowicz"));
		
		VideoGames vg1 = new VideoGames("Witcher 3", "Open World, RPG, etc.", "Playstation, Xbox, PC", 1, "2018-05-18", true, vg1DeveloperInfo);
		VideoGames vg2 = new VideoGames("Portal", "Puzzle", "PC", 1, "2007-10-10", true, null);
		System.out.println(vg1.toString());
		
		/*
		 * Test the interface that compares the release date year for video games
		 * */
		
		System.out.println("\n ----- Video Game Release Date ----- \n");
		
		if(vg1.compareReleaseDates(vg2) == true)
		{
			System.out.println(vg1.getName() + " was released before " + vg2.getName());
		}
		else
		{
			System.out.println(vg2.getName() + " was released before " + vg1.getName());
		}
		
		
		
		/*		Board Game 
		 * 
		 *  Name  | Genre  | System | Player Count | Release Date | Developers Array List 
		 * String | String | String |   Integer    |    String    |    Developers (null)
		 */
		//Spacing for Board Game
		System.out.println("\n***** Board Game *****\n");
		
		//create developers array list to add
		ArrayList<Developers> bg1DeveloperInfo = new ArrayList<>();
		ArrayList<Developers> bg2DeveloperInfo = new ArrayList<>();
		//test single input of developers array
		bg1DeveloperInfo.add(new Developers("Creator", "Lizzie", "Magie"));
		bg2DeveloperInfo.add(new Developers("Creator", "William", "Storey"));
								
		BoardGames bg1 = new BoardGames("Monopoly", "Classic Board Game", "In-Person, Mobile, PC, Xbox, Playstation", 8, "1935-02-06", bg1DeveloperInfo);
		BoardGames bg2 = new BoardGames("Sorry", "Classic Board Game", "In-Person, Mobile, PC, Xbox, Playstation", 4, "1930-08-04", bg2DeveloperInfo);
		System.out.println(bg1.toString());
		
		/*
		 * Test the interface that compares the release date year for board games
		 * */
		
		System.out.println("\n ----- Board Game Release Date ----- \n");
		
		if(bg1.compareReleaseDates(bg2) == true)
		{
			System.out.println(bg1.getName() + " was released before " + bg2.getName());
		}
		else
		{
			System.out.println(bg2.getName() + " was released before " + bg1.getName());
		}
		
		
		//Spacing for Card Game
		System.out.println("\n***** Card Game *****\n");
		
		/*		Card Game 
		 * 
		 *  Name  | Genre  | System | Player Count | 
		 * String | String | String |   Integer    |
		 */
		CardGames cg1 = new CardGames("Texas Holdem", "Poker Style", "In-Person, PC, Xbox, Playstation", 10, false);
		System.out.println(cg1.toString());
		
		
	}
	
	
}
