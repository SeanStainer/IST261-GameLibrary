package View;

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

public class GameLibraryView extends Application 
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
			
			primaryStage.setTitle("Game Library");
			
			/*
			 * Games class
			 * 	    Video Games
			 * 			GenreClass
			 * 				- Action
			 * 				- Adventure
			 * 				- Puzzle
			 * 				- Etc.
			 * 			MetacriticScore
			 * 			DownloadSize
			 * 			ReleaseDate
			 * 			UserReviews
			 * 				HoursPlayed
			 * 				PositivesOfGame
			 * 				NegativesOfGame
			 * 				
			 * 	    Board Games
			 * 		Card Games
			 * 		
			 * 
			 * */
			
			//create a gridpane layout
			GridPane grid = new GridPane();
			
			//sets spacing AROUND the entire grid
			grid.setPadding(new Insets(10, 10, 10, 10));
			
			//sets vertical spacing BETWEEN rows and columns 
			grid.setVgap(20);
			//sets horizontal spacing BETWEEN rows and columns 
			grid.setHgap(10);
			
			
			//BorderPane root = new BorderPane();
			Scene scene = new Scene(grid,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
}
