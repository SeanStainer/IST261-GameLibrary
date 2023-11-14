package View;

import Model.CardGames;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CardGameView
{
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
        CheckBox box1 = new CheckBox("Collectible");
        CheckBox box2 = new CheckBox("Classic");
        CheckBox box3 = new CheckBox("Poker");
        CheckBox box4 = new CheckBox("Party");

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

        RadioButton yesButton = new RadioButton("Yes");
        RadioButton noButton = new RadioButton("No");

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
        gridPanels.getChildren().addAll(cardGameGrid, DevelopersView.DeveloperInfo());


        HBox hbox = new HBox();
        hbox.getChildren().addAll(gridPanels, GameInfoView.systemsInfo(), genreVBox);

        /*
         * Create a TableView that shows
         * all information added into the VideoGames class
         *
         * */
        TableView<CardGames> table = new TableView<>();

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
        mainScreen.getChildren().add(ButtonBar.CGbuttonBar());
        mainScreen.getChildren().add(table);

        //create a scene to display and add the main screen vbox
        Scene scene = new Scene(mainScreen,600,800);
        primaryStage.setScene(scene);
        primaryStage.show();

        return primaryStage;


    }

}
