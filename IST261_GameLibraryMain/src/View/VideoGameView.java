package View;

import Controller.GameLibraryController;
import Model.Developers;
import Model.Game;
import javafx.collections.*;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import Model.VideoGames;

public class VideoGameView 
{
	public static TableView<VideoGames> table;
	public static CheckBox box1;
	public static CheckBox box2;
	public static CheckBox box3;
	public static CheckBox box4;
	public static CheckBox box5;
	public static CheckBox box6;
	public static CheckBox box7;
	public static CheckBox box8;
	public static CheckBox box9;
	public static CheckBox box10;
	public static CheckBox box11;
	public static CheckBox box12;
	public static TextField releaseDate;
	public static RadioButton yesButton;
	public static RadioButton noButton;
	public static Stage VideoGameInfo() 
	{
		//Create a stage 
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Video Game Information");


		/*
		 * Create a TableView that shows
		 * all information added into the VideoGames class
		 *
		 * */
		table = new TableView<>();

		//add columns to table

		//add first column for name of game
		//<reference data class, and have a column of strings> - create name of column anything can be there
		TableColumn<VideoGames, String> gameTitleColumn = new TableColumn<>("Name");
		gameTitleColumn.setMinWidth(150);
		//name is coming from data, referencing a variable name in the data class (must be same name)
		gameTitleColumn.setCellValueFactory(new PropertyValueFactory<VideoGames, String>("name"));

		//add second column for genre
		// <reference class, data type>
		TableColumn<VideoGames, String> genreColumn = new TableColumn<>("Genre");
		genreColumn.setMinWidth(100);
		genreColumn.setCellValueFactory(new PropertyValueFactory<VideoGames, String>("genre"));

		//add third column for system you can play on
		// <reference class, data type>
		TableColumn<VideoGames, String> systemColumn = new TableColumn<>("System");
		systemColumn.setMinWidth(150);
		systemColumn.setCellValueFactory(new PropertyValueFactory<VideoGames, String>("system"));

		//add fourth column for max number of players in the game
		// <reference class, data type>
		TableColumn<VideoGames, Integer> playerCountColumn = new TableColumn<>("# Players");
		playerCountColumn.setMinWidth(50);
		playerCountColumn.setCellValueFactory(new PropertyValueFactory<VideoGames, Integer>("playerCount"));

		//add fifth column for release date
		// <reference class, data type>
		TableColumn<VideoGames, String> releaseDateColumn = new TableColumn<>("Release Date");
		releaseDateColumn.setMinWidth(100);
		releaseDateColumn.setCellValueFactory(new PropertyValueFactory<VideoGames, String>("releaseDate"));

		//add sixth column for GOTY
		// <reference class, data type>
		TableColumn<VideoGames, Boolean> GOTYColumn = new TableColumn<>("GOTY");
		GOTYColumn.setMinWidth(100);
		GOTYColumn.setCellValueFactory(new PropertyValueFactory<VideoGames, Boolean>("gameOfTheYear"));

		//add sixth column for GOTY
		// <reference class, data type>
		TableColumn<VideoGames, Developers> developerColumn = new TableColumn<>("Developers");
		developerColumn.setMinWidth(100);
		developerColumn.setCellValueFactory(new PropertyValueFactory<VideoGames, Developers>("developerInfo"));

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
		box1 = new CheckBox("Action");
		box2 = new CheckBox("Adventure");
		box3 = new CheckBox("Fighting");
		box4 = new CheckBox("Open World");
		box5 = new CheckBox("Poker");
		box6 = new CheckBox("Puzzle");
		box7 = new CheckBox("Racing");
		box8 = new CheckBox("RPG");
		box9 = new CheckBox("Shooter");
		box10 = new CheckBox("Sports");
		box11 = new CheckBox("Survival");
		box12 = new CheckBox("Casual");
				
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

		releaseDate = new TextField("YYYY-MM-DD");
		GridPane.setConstraints(releaseDate, 1, 2);
		
		/*
		 * Label and Radio Buttons for Game of the year
		 * 
		 * */
		Label GOTYLabel = new Label("Game of the Year: ");
		GridPane.setConstraints(GOTYLabel, 0, 3);
		
		yesButton = new RadioButton("Yes");
		noButton = new RadioButton("No");
		
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


		table.setItems(null);
		//add columns to table
		table.getColumns().addAll(gameTitleColumn, genreColumn, systemColumn, playerCountColumn, releaseDateColumn, GOTYColumn, developerColumn);


		/*
		 * Creates a VBox that stores the hbox for user input
		 * and a button bar for adding the information to the library
		 * or clearing the current choices
		 * 
		 * */
		VBox mainScreen = new VBox();
		mainScreen.getChildren().add(hbox);
		mainScreen.getChildren().add(ButtonBar.VGbuttonBar());
		mainScreen.getChildren().add(table);
		
		//create a scene to display and add the main screen vbox
		Scene scene = new Scene(mainScreen,600,800);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		return primaryStage;

	}

	private static ObservableList<VideoGames> getData()
	{
		ObservableList<VideoGames> data = FXCollections.observableArrayList();

		data.add(new VideoGames("Witcher 3", "Open World, RPG, etc.", "Playstation, Xbox, PC", 1, "2018-05-18", true, null));
		return data;
	}

	public static VideoGames vgData()
	{
		VideoGames vg = new VideoGames(
						GameInfoView.gameName.getText(),
						genreData(),
						GameInfoView.systemData(),
						Integer.parseInt(GameInfoView.playerCount.getText()),
						releaseDate.getText(),
						GOTYData(),
						null );

		return vg;
	}

	public static Boolean GOTYData()
	{
		if(yesButton.isSelected())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static String genreData()
	{
		String genres = "";

		if(box1.isSelected())
		{
			genres += "Action, ";
		}
		if(box2.isSelected())
		{
			genres += "Adventure, ";
		}
		if(box3.isSelected())
		{
			genres += "Fighting, ";
		}
		if(box4.isSelected())
		{
			genres += "Open World, ";
		}
		if(box5.isSelected())
		{
			genres += "Poker, ";
		}
		if(box6.isSelected())
		{
			genres += "Puzzle, ";
		}
		if(box7.isSelected())
		{
			genres += "Racing, ";
		}
		if(box8.isSelected())
		{
			genres += "RPG, ";
		}
		if(box9.isSelected())
		{
			genres += "Shooter, ";
		}
		if(box10.isSelected())
		{
			genres += "Sports, ";
		}
		if(box11.isSelected())
		{
			genres += "Survival, ";
		}
		if(box12.isSelected())
		{
			genres += "Casual";
		}
		return genres;
	}
	
	
}
