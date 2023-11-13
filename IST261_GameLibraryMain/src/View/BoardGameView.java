package View;

import Model.BoardGames;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BoardGameView
{
    public static Stage BoardGameInfo()
    {
        //Create a stage
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Board Game Information");


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
        CheckBox box1 = new CheckBox("Abstract");
        CheckBox box2 = new CheckBox("Area Control");
        CheckBox box3 = new CheckBox("Campaign");
        CheckBox box4 = new CheckBox("Deck building");
        CheckBox box5 = new CheckBox("Dice");
        CheckBox box6 = new CheckBox("Dungeon-Crawler");
        CheckBox box7 = new CheckBox("RPG");
        CheckBox box8 = new CheckBox("War");

        //create a vbox layout w/ padding 10 between children and 30 all around vbox
        VBox genreCheckVbox = new VBox(10);
        genreCheckVbox.setPadding(new Insets(10, 10, 10, 10));
        genreCheckVbox.getChildren().addAll(box1, box2, box3, box4, box5, box6, box7, box8);

        genreVBox.setPadding(new Insets(10, 10, 10, 10));
        genreVBox.getChildren().addAll(gameGenreLabel, genreCheckVbox);

        /*
         * Create an hbox that stores the grid layout from the games category
         * and the genre VBox designed for the Board Games class
         *
         *
         * */

        GridPane BoardGameGrid = GameInfoView.GameInfo();

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

        BoardGameGrid.getChildren().addAll(releaseDateLabel, releaseDate);

        /*
         * Create a VBox that stores the gridPane of user inputs
         * and the developer input information
         *
         * */

        VBox gridPanels = new VBox();
        gridPanels.getChildren().addAll(BoardGameGrid, DevelopersView.DeveloperInfo());


        HBox hbox = new HBox();
        hbox.getChildren().addAll(gridPanels, GameInfoView.systemsInfo(), genreVBox);

        /*
         * Create a TableView that shows
         * all information added into the Board Games class
         *
         * */
        TableView<BoardGames> table = new TableView<>();

        //add columns to table

        //add first column for name of game
        //<reference data class, and have a column of strings> - create name of column anything can be there
        TableColumn<BoardGames, String> gameTitleColumn = new TableColumn<>("Name");
        gameTitleColumn.setMinWidth(150);
        //name is coming from data, referencing a variable name in the data class (must be same name)
        gameTitleColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //add second column for genre
        // <reference class, data type>
        TableColumn<BoardGames, String> genreColumn = new TableColumn<>("Genre");
        genreColumn.setMinWidth(100);
        genreColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));

        //add third column for system you can play on
        // <reference class, data type>
        TableColumn<BoardGames, Integer> systemColumn = new TableColumn<>("System");
        systemColumn.setMinWidth(150);
        systemColumn.setCellValueFactory(new PropertyValueFactory<>("system"));

        //add fourth column for max number of players in the game
        // <reference class, data type>
        TableColumn<BoardGames, Integer> playerCountColumn = new TableColumn<>("# Players");
        playerCountColumn.setMinWidth(50);
        playerCountColumn.setCellValueFactory(new PropertyValueFactory<>("playerCount"));

        //set data inside of table by calling the controller (from MVC)
        table.setItems(null);

        //add columns to table
        table.getColumns().addAll(gameTitleColumn, genreColumn, systemColumn, playerCountColumn);

        /*
         * Creates a VBox that stores the hbox for user input
         * and a button bar for adding the information to the library
         * or clearing the current choices
         *
         * */
        VBox mainScreen = new VBox();
        mainScreen.getChildren().add(hbox);
        mainScreen.getChildren().add(ButtonBar.buttonBar());
        mainScreen.getChildren().add(table);

        //create a scene to display and add the main screen vbox
        Scene scene = new Scene(mainScreen,600,800);
        primaryStage.setScene(scene);
        primaryStage.show();

        return primaryStage;


    }
}
