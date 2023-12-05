package View;

import Model.CardGames;
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
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class CardGameView
{
    public static TableView<CardGames> table;
    public static ObservableList<CardGames> cgTable;
    public static RadioButton yesButton;
    public static RadioButton noButton;
    public static CheckBox box1;
    public static CheckBox box2;
    public static CheckBox box3;
    public static CheckBox box4;
    public static Stage CardGameInfo()
    {
        //Create a stage
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Card Game Information");


        /*
         * Label and Text Field for the Card Game Genre
         *
         * Develop Radio Buttons to choose from various genres
         * Collecitble card games, classic card games,
         * Poker card games, party card games
         *
         * */

        VBox genreVBox = new VBox();

        Label gameGenreLabel = new Label("Genre: ");

        //Create CheckBoxes
        box1 = new CheckBox("Collectible");
        box2 = new CheckBox("Classic");
        box3 = new CheckBox("Poker");
        box4 = new CheckBox("Party");

        //create a vbox layout w/ padding 10 between children and 30 all around vbox
        VBox genreCheckVbox = new VBox(10);
        genreCheckVbox.setPadding(new Insets(10, 10, 10, 10));
        genreCheckVbox.getChildren().addAll(box1, box2, box3, box4);

        genreVBox.setPadding(new Insets(10, 10, 10, 10));
        genreVBox.getChildren().addAll(gameGenreLabel, genreCheckVbox);

        /*
         * Create an hbox that stores the grid layout from the games category
         * and the genre VBox designed for the Card Games class
         *
         *
         * */

        GridPane cardGameGrid = GameInfoView.GameInfo();

        /*
         * Label and Radio Buttons for if the card game utilizes the joker card
         *
         * */
        Label jokerLabel = new Label("Game uses Joker: ");
        GridPane.setConstraints(jokerLabel, 0, 2);

        yesButton = new RadioButton("Yes");
        noButton = new RadioButton("No");

        HBox yesOrNo = new HBox();
        yesOrNo.setSpacing(5);
        yesOrNo.getChildren().addAll(yesButton, noButton);
        GridPane.setConstraints(yesOrNo, 1, 2);

        cardGameGrid.getChildren().addAll(jokerLabel, yesOrNo);

        /*
         * Create a VBox that stores the gridPane of user inputs
         * and the developer input information
         *
         * */

        VBox gridPanels = new VBox();
        gridPanels.getChildren().add(cardGameGrid);


        HBox hbox = new HBox();
        hbox.getChildren().addAll(gridPanels, GameInfoView.systemsInfo(), genreVBox);

        /*
         * Create a TableView that shows
         * all information added into the VideoGames class
         *
         * */
        table = new TableView<>();

        //add columns to table

        //add first column for name of game
        //<reference data class, and have a column of strings> - create name of column anything can be there
        TableColumn<CardGames, String> gameTitleColumn = new TableColumn<>("Name");
        gameTitleColumn.setMinWidth(150);
        //name is coming from data, referencing a variable name in the data class (must be same name)
        gameTitleColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //add second column for genre
        // <reference class, data type>
        TableColumn<CardGames, String> genreColumn = new TableColumn<>("Genre");
        genreColumn.setMinWidth(100);
        genreColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));

        //add third column for system you can play on
        // <reference class, data type>
        TableColumn<CardGames, Integer> systemColumn = new TableColumn<>("System");
        systemColumn.setMinWidth(150);
        systemColumn.setCellValueFactory(new PropertyValueFactory<>("system"));

        //add fourth column for max number of players in the game
        // <reference class, data type>
        TableColumn<CardGames, Integer> playerCountColumn = new TableColumn<>("# Players");
        playerCountColumn.setMinWidth(50);
        playerCountColumn.setCellValueFactory(new PropertyValueFactory<>("playerCount"));

        //add a fifth column for if the game uses a joker or not
        // <reference class, data type>
        TableColumn<CardGames, Boolean> jokerColumn = new TableColumn<>("Joker");
        jokerColumn.setMinWidth(50);
        jokerColumn.setCellValueFactory(new PropertyValueFactory<CardGames, Boolean>("joker"));

        //set an observable list of arrayList data that is saved to start the data in the table
        if(fileCheck())
        {
            Game.restoreCGData();
        }
        else {
            Game.cardGameData = new ArrayList<>();
        }
        //set an observable list of arrayList data that is saved to start the data in the table
        cgTable = FXCollections.observableArrayList(Game.cardGameData);
        table.setItems(cgTable);

        //add columns to table
        table.getColumns().addAll(gameTitleColumn, genreColumn, systemColumn, playerCountColumn, jokerColumn);

        /*
         * Creates a VBox that stores the hbox for user input
         * and a button bar for adding the information to the library
         * or clearing the current choices
         *
         * */
        VBox mainScreen = new VBox();
        mainScreen.getChildren().add(hbox);
        mainScreen.getChildren().add(ButtonBar.CGbuttonBar());
        mainScreen.getChildren().add(table);

        //create a scene to display and add the main screen vbox
        Scene scene = new Scene(mainScreen,525,600);
        primaryStage.setScene(scene);
        primaryStage.show();

        return primaryStage;


    }
    public static boolean fileCheck()
    {
        FileInputStream fis = null;
        ObjectInputStream in = null;

        try {
            fis = new FileInputStream(Game.cgDataFileName);

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
    public static Boolean jokerData()
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
    public static CardGames cgData()
    {
        CardGames cg = new CardGames(
                GameInfoView.gameName.getText(),
                genreData(),
                GameInfoView.systemData(),
                Integer.parseInt(GameInfoView.playerCount.getText()),
                jokerData());

        return cg;
    }
    public static String genreData()
    {
        //string to store genres
        String genres = "";
        //boolean to store if an item is selected
        boolean itemsSelected = false;

        if(box1.isSelected()) {
            genres += "Collectible, ";
            itemsSelected = true;
        }
        if(box2.isSelected()) {
            genres += "Classic, ";
            itemsSelected = true;
        }
        if(box3.isSelected()) {
            genres += "Poker, ";
            itemsSelected = true;
        }
        if(box4.isSelected()) {
            genres += "Party, ";
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
}
