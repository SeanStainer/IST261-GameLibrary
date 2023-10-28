package application;

import Model.BoardGames;
import Model.CardGames;
import Model.VideoGames;
import Model.Developers;
import View.HomeView;
import javafx.application.Application;
import javafx.stage.Stage;



public class Main extends Application 
{
	
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) 
	{
		try 
		{
			/*
			 * Calls the VideoGameView that presents a Layout
			 * For all the information inside the Video Games Class
			 * 
			 * */
			
			//VideoGameView.VideoGameInfo();
			
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
			e.printStackTrace();
		}
	}
	
}
