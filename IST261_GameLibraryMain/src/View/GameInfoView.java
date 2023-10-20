package View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class GameInfoView 
{
	
	public static void GameInfo() 
	{
		//Create a stage 
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Games Information");
	
		
		/*
		 * Create a Grid Layout to display all information
		 * within the Games super class
		 * 
		 * 
		 * Vairables in Game Class:
		 * Name(String), Genre(String), System(String), PlayerCount(Integer)
		 * 
		 * */
		GridPane grid = new GridPane();
	
		//sets spacing AROUND the entire grid
		grid.setPadding(new Insets(10, 10, 10, 10));
	
		//sets spacing BETWEEN rows and columns 
		grid.setVgap(20);
		grid.setHgap(10);
	
		/*
		 * Label and Text Field for the Game Name
		 * 
		 * Set Constraints(column, row) - sets position of item
		 * 
		 * */
		Label gameNameLabel = new Label("Name of Game: ");
		GridPane.setConstraints(gameNameLabel, 0, 0);

		TextField gameName = new TextField("Portal");
		GridPane.setConstraints(gameName, 1, 0);
	
		/*
		 * Label and Text Field for the Game Genre
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
		 * Label and Text Field for the Game Player Count
		 * 
		 * */
		Label playerCountLabel = new Label("Max Players: ");
		GridPane.setConstraints(playerCountLabel, 0, 1);
	
		TextField playerCount = new TextField("2");
		GridPane.setConstraints(playerCount, 1, 1);
		
		
		/*
		 * Label and Text Field for the Game System
		 * 
		 * Develop Radio Buttons to choose from systems
		 * Xbox, PC, Playstation, In-Person, Nintendo
		 * 
		 * */
		Label gameSystemLabel = new Label("Systems: ");
		GridPane.setConstraints(gameSystemLabel, 1, 2);
		
		//Create CheckBoxes
		CheckBox sysBox1 = new CheckBox("PC");
		CheckBox sysBox2 = new CheckBox("Xbox");
		CheckBox sysBox3 = new CheckBox("Playstation");
		CheckBox sysBox4 = new CheckBox("Nintendo");
		CheckBox sysBox5 = new CheckBox("In-Person");
		
		//create a vbox layout 
		VBox systemCheckVbox = new VBox(10);
		systemCheckVbox.setPadding(new Insets(10, 10, 10, 10));
		systemCheckVbox.getChildren().addAll(sysBox1, sysBox2, sysBox3, sysBox4, sysBox5);
		GridPane.setConstraints(systemCheckVbox, 1, 3);
	
		//add label and text field to layout
		grid.getChildren().addAll(gameNameLabel, gameName, gameSystemLabel, systemCheckVbox, playerCountLabel, playerCount);
		
		
		HBox hbox = new HBox();
		hbox.getChildren().addAll(grid, genreVBox);
	
		//BorderPane root = new BorderPane();
		Scene scene = new Scene(hbox,600,600);
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
	
	
}
