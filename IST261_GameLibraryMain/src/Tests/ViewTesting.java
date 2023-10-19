package Tests;
	
import View.GameInfoView;
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
	
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		try 
		{
			/*
			 * Calls the GameInfoView that presents a Grid Layout
			 * For all the information inside the Games Super Class
			 * 
			 * */
			
			GameInfoView.GameInfo();
			
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
}
