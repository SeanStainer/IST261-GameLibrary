package View;

import Model.BoardGames;
import Model.Developers;
import Model.Game;
import Model.VideoGames;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class BoardGameView
{
    public static TableView<BoardGames> table;
    public static ObservableList<BoardGames> tableData;
    public static TextField releaseDate;
    public static CheckBox box1;
    public static CheckBox box2;
    public static CheckBox box3;
    public static CheckBox box4;
    public static CheckBox box5;
    public static CheckBox box6;
    public static CheckBox box7;
    public static CheckBox box8;
    public static Stage BoardGameInfo(){
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
        box1 = new CheckBox("Abstract");
        box2 = new CheckBox("Area Control");
        box3 = new CheckBox("Campaign");
        box4 = new CheckBox("Deck building");
        box5 = new CheckBox("Dice");
        box6 = new CheckBox("Dungeon-Crawler");
        box7 = new CheckBox("RPG");
        box8 = new CheckBox("War");

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

        releaseDate = new TextField("YYYY-MM-DD");
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
        table = new TableView<>();

        //add columns to table

        //add first column for name of game
        //<reference data class, and have a column of strings> - create name of column anything can be there
        TableColumn<BoardGames, String> gameTitleColumn = new TableColumn<>("Name");
        gameTitleColumn.setMinWidth(75);
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
        systemColumn.setMinWidth(100);
        systemColumn.setCellValueFactory(new PropertyValueFactory<>("system"));

        //add fourth column for max number of players in the game
        // <reference class, data type>
        TableColumn<BoardGames, Integer> playerCountColumn = new TableColumn<>("# Players");
        playerCountColumn.setMinWidth(25);
        playerCountColumn.setCellValueFactory(new PropertyValueFactory<>("playerCount"));

        //add fifth column for release date
        // <reference class, data type>
        TableColumn<BoardGames, String> releaseDateColumn = new TableColumn<>("Release Date");
        releaseDateColumn.setMinWidth(100);
        releaseDateColumn.setCellValueFactory(new PropertyValueFactory<BoardGames, String>("releaseDate"));

        //add sixth column for developers
        // <reference class, data type>
        TableColumn<BoardGames, Developers> developerColumn = new TableColumn<>("Developers");
        developerColumn.setMinWidth(200);
        developerColumn.setCellValueFactory(new PropertyValueFactory<BoardGames, Developers>("developerInfo"));

        //set an observable list of arrayList data that is saved to start the data in the table
        if(fileCheck())
        {
            Game.restoreBGData();
        }
        else {
            Game.boardGameData = new ArrayList<>();
        }
        //System.out.println(Game.videoGameData.toString());
        //set an observable list of arrayList data that is saved to start the data in the table
        tableData = FXCollections.observableArrayList(Game.boardGameData);
        table.setItems(tableData);

        //add columns to table
        table.getColumns().addAll(gameTitleColumn, genreColumn, systemColumn, playerCountColumn, releaseDateColumn, developerColumn);

        /*
         * Creates a VBox that stores the hbox for user input
         * and a button bar for adding the information to the library
         * or clearing the current choices
         *
         * */
        VBox mainScreen = new VBox();
        mainScreen.getChildren().add(hbox);
        mainScreen.getChildren().add(ButtonBar.BGbuttonBar());
        mainScreen.getChildren().add(table);

        //create a scene to display and add the main screen vbox
        Scene scene = new Scene(mainScreen,650,700);
        primaryStage.setScene(scene);
        primaryStage.show();

        return primaryStage;


    }

    public static boolean fileCheck()
    {
        FileInputStream fis = null;
        ObjectInputStream in = null;

        try {
            fis = new FileInputStream(Game.bgDataFileName);

            if(fis.available() != 0){
                System.out.println("file available");
                return true;
            }
            else{
                System.out.println("file not available");
                return false;
            }

        }
        catch(Exception ex)
        {
            return false;
        }
    }


    public static String bgGenreData()
    {
        //string to store genres
        String genres = "";
        //boolean to store if an item is selected
        boolean itemsSelected = false;

        if(box1.isSelected()) {
            genres += "Abstract, ";
            itemsSelected = true;
        }
        if(box2.isSelected()) {
            genres += "Area Control, ";
            itemsSelected = true;
        }
        if(box3.isSelected()) {
            genres += "Campaign, ";
            itemsSelected = true;
        }
        if(box4.isSelected()) {
            genres += "Deck building, ";
            itemsSelected = true;
        }
        if(box5.isSelected()) {
            genres += "Dice, ";
            itemsSelected = true;
        }
        if(box6.isSelected()) {
            genres += "Dungeon-Crawler, ";
            itemsSelected = true;
        }
        if(box7.isSelected()) {
            genres += "RPG, ";
            itemsSelected = true;
        }
        if(box8.isSelected()) {
            genres += "War, ";
            itemsSelected = true;
        }

        //if no items are selected return N/A else get rid of ", "
        if(itemsSelected)
        {
            //remove the ', ' from the end of the string
            genres = genres.substring(0, genres.length() - 2);
        }
        else
        {
            genres = "N/A";
        }

        return genres;
    }
    public static BoardGames bgData()
    {
        Developers d = new Developers(DevelopersView.jobTitle.getText(), DevelopersView.firstName.getText(), DevelopersView.lastName.getText());
        ArrayList<Developers> dInfo = new ArrayList<>();
        dInfo.add(d);

        BoardGames bg = new BoardGames(
                GameInfoView.gameName.getText(),
                bgGenreData(),
                GameInfoView.systemData(),
                Integer.parseInt(GameInfoView.playerCount.getText()),
                releaseDate.getText(),
                dInfo );

        return bg;
    }


}
