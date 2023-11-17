package View;

import Controller.GameLibraryController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class HomeView 
{

	public static void HomeMenuView()
	{
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Game Library");

		/*
		 * Create a menu that will display 3 options
		 * VideoGames, CardGames, and BoardGames
		 *
		 * */
		/*
		Menu gameMenu = new Menu("Add Game");
		//create menu items to add into the menu
		MenuItem videoGameItem = new MenuItem("Video Game");
		//add button listener to go to video game information view
		videoGameItem.setOnAction(e -> VideoGameView.VideoGameInfo());
		//create menu item for card games
		MenuItem cardGameItem = new MenuItem("Card Game");
		//add button listener to go to card game information view
		cardGameItem.setOnAction(e -> CardGameView.CardGameInfo());
		//create menu item for board games
		MenuItem boardGameItem = new MenuItem("Board Game");
		//add button listener to go to board game information view
		boardGameItem.setOnAction(e -> BoardGameView.BoardGameInfo());

			
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
		*/

		/*
		* Create Buttons for each of the data to add and view
		*
		* */

		//video game button and action
		Button VGButton = new Button("Video Games");
		VGButton.setOnAction(e -> VideoGameView.VideoGameInfo());

		//board game button and action
		Button BGButton = new Button("Board Games");
		BGButton.setOnAction(e -> BoardGameView.BoardGameInfo());

		//card game button and action
		Button CGButton = new Button("Card Games");
		CGButton.setOnAction(e -> CardGameView.CardGameInfo());

		//create an HBox to store the buttons in
		HBox NavigationButtons = new HBox();
		NavigationButtons.setSpacing(10);
		NavigationButtons.getChildren().addAll(VGButton, BGButton, CGButton);
		NavigationButtons.setAlignment(Pos.CENTER);


		/*
		 * Create a label for the main home screen
		 *
		 * */
		Label welcomeMessage = new Label("Game Library");
		welcomeMessage.setPadding(new Insets(10,10,10,10));
		welcomeMessage.setFont(new Font("Arial", 50));

		//create a Vbox to store the label and navigation buttons
		VBox vbox = new VBox();
		vbox.getChildren().addAll(welcomeMessage, NavigationButtons);
		vbox.setAlignment(Pos.CENTER);

			

		Scene scene = new Scene(vbox,500,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}

