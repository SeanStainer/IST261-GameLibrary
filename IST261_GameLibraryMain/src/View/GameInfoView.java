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
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class GameInfoView 
{
	
	public static GridPane GameInfo() 
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
		 * Name(String), System(String), PlayerCount(Integer)
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
		 * Label and Text Field for the Game Player Count
		 * 
		 * */
		Label playerCountLabel = new Label("Max Players: ");
		GridPane.setConstraints(playerCountLabel, 0, 1);
	
		TextField playerCount = new TextField("2");
		GridPane.setConstraints(playerCount, 1, 1);
	
		//add label and text field to layout
		grid.getChildren().addAll(gameNameLabel, gameName, playerCountLabel, playerCount);
			
		
		return grid;
	
	}

	public static VBox systemsInfo() {
		/*
		 * Label and Text Field for the Game System
		 * 
		 * Develop Radio Buttons to choose from systems
		 * Xbox, PC, Playstation, In-Person, Nintendo
		 * 
		 * */
		Label gameSystemLabel = new Label("Systems: ");
		
		//Create CheckBoxes
		CheckBox sysBox1 = new CheckBox("PC");
		CheckBox sysBox2 = new CheckBox("Xbox");
		CheckBox sysBox3 = new CheckBox("Playstation");
		CheckBox sysBox4 = new CheckBox("Nintendo");
		CheckBox sysBox5 = new CheckBox("In-Person");
		
		//create a vbox layout 
		VBox systemCheckVbox = new VBox(10);
		systemCheckVbox.setPadding(new Insets(10, 10, 10, 10));
		systemCheckVbox.getChildren().addAll(gameSystemLabel, sysBox1, sysBox2, sysBox3, sysBox4, sysBox5);
		
		return systemCheckVbox;
	}
	
	public static GridPane developersInfo()
	{
		return null;
		
	}
	
	
}
