package Tests;

import java.util.ArrayList;

import Model.BoardGames;
import Model.CardGames;
import Model.VideoGames;
import Model.Developers;
import Model.Games;
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
		
		VideoGames vg1 = new VideoGames("Witcher 3", "Open World, RPG, etc.", "Playstation, Xbox, PC", 1, "May 18, 2015", true, vg1DeveloperInfo);
		System.out.println(vg1.toString());
		
		//Spacing for Board Game
		System.out.println("\n***** Board Game *****\n");
		
		
		/*		Board Game 
		 * 
		 *  Name  | Genre  | System | Player Count | Release Date | Developers Array List 
		 * String | String | String |   Integer    |    String    |    Developers (null)
		 */
		
		//create developers array list to add
		ArrayList<Developers> bg1DeveloperInfo = new ArrayList<>();
		//test single input of developers array
		bg1DeveloperInfo.add(new Developers("Creator", "Lizzie", "Magie"));
								
		BoardGames bg1 = new BoardGames("Monopoly", "Classic Board Game", "In-Person, Mobile, PC, Xbox, Playstation", 8, "February 6th, 1935", bg1DeveloperInfo);
		System.out.println(bg1.toString());
		
		
		//Spacing
		System.out.println("\n***** Card Game *****\n");
		
		/*		Card Game 
		 * 
		 *  Name  | Genre  | System | Player Count | 
		 * String | String | String |   Integer    |
		 */
		CardGames cg1 = new CardGames("Texas Holdem", "Poker Style", "In-Person, PC, Xbox, Playstation", 10);
		System.out.println(cg1.toString());
		
	}
	
	
}
