package application;
	
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
			//test the output
			VideoGames game1 = new VideoGames("Witcher 3", "Open World, RPG, etc.", "Playstation, Xbox, PC", 1, "May 18, 2015");
			System.out.println(game1.toString());
			
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
}
