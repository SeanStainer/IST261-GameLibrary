package Controller;

import Model.BoardGames;
import Model.CardGames;
import Model.Game;
import Model.VideoGames;
import View.BoardGameView;
import View.CardGameView;
import View.CloseConfirmation;
import View.VideoGameView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class GameLibraryController
{
    public static void closeProgram()
    {
        Boolean ans = CloseConfirmation.show("Save & Close", "Are you sure you want to close?");

        //if answer is true close the window
        if(ans == true)
        {
            System.exit(0);
            System.out.println("Exited interface");
        }

    }

    public static void addVGItems()
    {
        //add data from UI to the arrayList
        Game.videoGameData.add(VideoGameView.vgData());

        //tests the data stored in the videoGame arrayList
        //System.out.println(Game.videoGameData.toString());

        //create an observable list to add data to table
        ObservableList<VideoGames> tableData = FXCollections.observableArrayList();
        //add data from video game view UI to the observable list
        tableData.add(VideoGameView.vgData());

        //add observable list to table
        VideoGameView.table.getItems().addAll(tableData);

    }

    public static void addBGItems()
    {
        //add data from UI to the arrayList
        Game.boardGameData.add(BoardGameView.bgData());

        //tests the data stored in the videoGame arrayList
        //System.out.println(Game.boardGameData.toString());

        //create an observable list to add data to table
        ObservableList<BoardGames> tableData = FXCollections.observableArrayList();
        //add data from video game view UI to the observable list
        tableData.add(BoardGameView.bgData());

        //add observable list to table
        BoardGameView.table.getItems().addAll(tableData);

    }

    public static void addCGItems()
    {
        //add data from UI to the arrayList
        Game.cardGameData.add(CardGameView.cgData());

        //tests the data stored in the videoGame arrayList
        //System.out.println(Game.cardGameData.toString());

        //create an observable list to add data to table
        ObservableList<CardGames> tableData = FXCollections.observableArrayList();
        //add data from video game view UI to the observable list
        tableData.add(CardGameView.cgData());

        //add observable list to table
        CardGameView.table.getItems().addAll(tableData);

    }


}
