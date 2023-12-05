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
import Model.Game;

public class GameInfoView 
{
	public static TextField gameName;
	public static TextField playerCount;
	public static CheckBox sysBox1;
	public static CheckBox sysBox2;
	public static CheckBox sysBox3;
	public static CheckBox sysBox4;
	public static CheckBox sysBox5;
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

		gameName = new TextField("Portal");
		GridPane.setConstraints(gameName, 1, 0);
		
		/*
		 * Label and Text Field for the Game Player Count
		 * 
		 * */
		Label playerCountLabel = new Label("Max Players: ");
		GridPane.setConstraints(playerCountLabel, 0, 1);
	
		playerCount = new TextField("2");
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
		sysBox1 = new CheckBox("PC");
		sysBox2 = new CheckBox("Xbox");
		sysBox3 = new CheckBox("Playstation");
		sysBox4 = new CheckBox("Nintendo");
		sysBox5 = new CheckBox("In-Person");
		
		//create a vbox layout 
		VBox systemCheckVbox = new VBox(10);
		systemCheckVbox.setPadding(new Insets(10, 10, 10, 10));
		systemCheckVbox.getChildren().addAll(gameSystemLabel, sysBox1, sysBox2, sysBox3, sysBox4, sysBox5);
		
		return systemCheckVbox;
	}
	
	public static String systemData() {
		//string that stores all systems used
		String systems = "";
		//boolean that stores if a system is selected or not for input validation
		boolean itemsSelected = false;

		if (sysBox1.isSelected()) {
			systems += "PC, ";
			itemsSelected = true;
		}
		if (sysBox2.isSelected()) {
			systems += "Xbox, ";
			itemsSelected = true;
		}
		if (sysBox3.isSelected()) {
			systems += "Playstation, ";
			itemsSelected = true;
		}
		if (sysBox4.isSelected()) {
			systems += "Nintendo, ";
			itemsSelected = true;
		}
		if (sysBox5.isSelected()) {
			systems += "In-Person, ";
			itemsSelected = true;
		}

		//if no items are selected return N/A else get rid of ", "
		if (itemsSelected) {
			//remove the ', ' from the end of the string
			systems = systems.substring(0, systems.length() - 2);
		} else {
			systems = "N/A";
		}

		return systems;
	}
	
}
