package Tests;
	
import View.GameInfoView;
import View.HomeView;
import View.VideoGameView;
import View.ButtonBar;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class ViewTesting extends Application 
{
	
	public static void main(String[] args) 
	{
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception 
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
			 * Calls the HomeMenuView that presents a home screen
			 * and a menu that allows you to choose between adding
			 * VideoGameInfo, CardGameInfo, and BoardGameInfo
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
