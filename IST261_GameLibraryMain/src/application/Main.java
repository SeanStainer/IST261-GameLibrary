package application;

import Model.BoardGames;
import Model.CardGames;
import Model.VideoGames;
import Model.Developers;
import Model.Game;
import View.HomeView;
import View.VideoGameView;
import javafx.application.Application;
import javafx.stage.Stage;



public class Main extends Application
{
	
	public static void main(String[] args) 
	{
		launch(args);
	}

	public void start(Stage primaryStage) 
	{
		try
		{
			/*
			 * Calls the HomeMenuView that presents a main screen
			 * that contains a menu to choose which layout you want
			 * to add information into
			 * 
			 * */

			HomeView.HomeMenuView();
			
		} 
		catch(Exception e) 
		{
			System.out.println("error");
		}
	}
	
}
