package Controller;

import Model.Game;
import Model.VideoGames;
import View.CloseConfirmation;
import View.VideoGameView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class GameLibraryController
{
    public static void closeProgram()
    {
        Boolean ans = CloseConfirmation.show("Welcome", "Are you sure you want to close?");

        //if answer is true close the window
        if(ans == true)
        {
            System.exit(0);
            System.out.println("Exited interface");
        }

    }

    public static void addVGItems()
    {
        Game.videoGameData.add(VideoGameView.vgData());

        System.out.println(Game.videoGameData.toString());

        //create an observable list to add data to table
        ObservableList<VideoGames> tableData = FXCollections.observableArrayList();
        //add data from video game view UI to the observable list
        tableData.add(VideoGameView.vgData());

        //add observable list to table
        VideoGameView.table.getItems().addAll(tableData);

    }


}
