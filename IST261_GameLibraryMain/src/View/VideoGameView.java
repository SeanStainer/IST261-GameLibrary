package View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import View.ButtonBar;

public class VideoGameView 
{
	
	public static Stage VideoGameInfo() 
	{
		//Create a stage 
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Video Game Information");
	
	
		/*
		 * Label and Text Field for the Video Game Genre
		 * 
		 * Develop Radio Buttons to choose from various genres
		 * Open World, RPG, Puzzle, FPS, TPS, Adventure, etc...
		 * 
		 * */
		
		VBox genreVBox = new VBox();
		
		Label gameGenreLabel = new Label("Genre: ");
		
		//Create CheckBoxes
		CheckBox box1 = new CheckBox("Action");
		CheckBox box2 = new CheckBox("Adventure");
		CheckBox box3 = new CheckBox("Fighting");
		CheckBox box4 = new CheckBox("Open World");
		CheckBox box5 = new CheckBox("Poker");
		CheckBox box6 = new CheckBox("Puzzle");
		CheckBox box7 = new CheckBox("Racing");
		CheckBox box8 = new CheckBox("RPG");
		CheckBox box9 = new CheckBox("Shooter");
		CheckBox box10 = new CheckBox("Sports");
		CheckBox box11 = new CheckBox("Survival");
		CheckBox box12 = new CheckBox("Casual");
				
		//create a vbox layout w/ padding 10 between children and 30 all around vbox
		VBox genreCheckVbox = new VBox(10);
		genreCheckVbox.setPadding(new Insets(10, 10, 10, 10));
		genreCheckVbox.getChildren().addAll(box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11,box12);

		genreVBox.setPadding(new Insets(10, 10, 10, 10));
		genreVBox.getChildren().addAll(gameGenreLabel, genreCheckVbox);
		
		/*
		 * Create an hbox that stores the grid layout from the games category
		 * and the genre VBox desifned for teh video Games class
		 * 
		 * 
		 * */
		
		GridPane videoGameGrid = GameInfoView.GameInfo();
		
		/*
		 * Label and Text Field for the Release Date
		 * 
		 * Set Constraints(column, row) - sets position of item
		 * 
		 * */
		Label releaseDateLabel = new Label("Release Date: ");
		GridPane.setConstraints(releaseDateLabel, 0, 2);

		TextField releaseDate = new TextField("YYYY-MM-DD");
		GridPane.setConstraints(releaseDate, 1, 2);
		
		/*
		 * Label and Radio Buttons for Game of the year
		 * 
		 * */
		Label GOTYLabel = new Label("Game of the Year: ");
		GridPane.setConstraints(GOTYLabel, 0, 3);
		
		RadioButton yesButton = new RadioButton("Yes");
		RadioButton noButton = new RadioButton("No");
		
		HBox yesOrNo = new HBox();
		yesOrNo.setSpacing(5);
		yesOrNo.getChildren().addAll(yesButton, noButton);
		GridPane.setConstraints(yesOrNo, 1, 3);
		
		videoGameGrid.getChildren().addAll(releaseDateLabel, releaseDate, GOTYLabel, yesOrNo);
		
		/*
		 * Create a VBox that stores the gridPane of user inputs 
		 * and the developer input information
		 * 
		 * */
		
		VBox gridPanels = new VBox();
		gridPanels.getChildren().addAll(videoGameGrid, DevelopersView.DeveloperInfo());
		
		
		HBox hbox = new HBox();
		hbox.getChildren().addAll(gridPanels, GameInfoView.systemsInfo(), genreVBox);
		
		/*
		 * Creates a VBox that stores the hbox for user input
		 * and a button bar for adding the information to the library
		 * or clearing the current choices
		 * 
		 * */
		
		VBox mainScreen = new VBox();
		mainScreen.getChildren().add(hbox);
		mainScreen.getChildren().add(ButtonBar.buttonBar());
		
		//create a scene to display and add the main screen vbox
		Scene scene = new Scene(mainScreen,600,600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		return primaryStage;
		
	
	}
	
	
}
