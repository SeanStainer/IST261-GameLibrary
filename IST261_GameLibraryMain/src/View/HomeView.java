package View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class HomeView 
{

	public static void HomeMenuView()
	{
			Stage primaryStage = new Stage();
			primaryStage.setTitle("Video Game Library");
			
			/*
			 * Create a menu that will display 3 options 
			 * VideoGames, CardGames, and BoardGames
			 * 
			 * */
			
			Menu gameMenu = new Menu("Add Game");
			//create menu items to add into the menu
			MenuItem videoGameItem = new MenuItem("Video Game");
			videoGameItem.setOnAction(e -> VideoGameView.VideoGameInfo());
			MenuItem cardGameItem = new MenuItem("Card Game");
			MenuItem boardGameItem = new MenuItem("Board Game");

			
			//add menuItem to the menu tab
			gameMenu.getItems().add(videoGameItem);
			//add spacing line in menu
			gameMenu.getItems().add(new SeparatorMenuItem());
			//another way of adding an option for the fileMenu tab
			gameMenu.getItems().add(cardGameItem);
			//add spacing line in menu
			gameMenu.getItems().add(new SeparatorMenuItem());
			//exit button
			gameMenu.getItems().add(boardGameItem);
			
			
			MenuBar menuBar = new MenuBar();
			//getMenus is the same as getChildren but only for MenuBar class
			menuBar.getMenus().add(gameMenu);
			
			
			/*
			 * Create a label for the main home screen
			 * 
			 * */
			Label welcomeMessage = new Label("Video Game Library");
			welcomeMessage.setPadding(new Insets(10,10,10,10));
			welcomeMessage.setFont(new Font("Arial", 50));
			
			VBox vbox = new VBox(10);
			vbox.getChildren().addAll(menuBar, welcomeMessage);
			welcomeMessage.setAlignment(Pos.CENTER);
			

			Scene scene = new Scene(vbox,500,400);
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	
}

