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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;

import static Model.Game.videoGameData;

public class GameLibraryController
{
    public static void closeVGProgram()
    {
        Boolean ans = CloseConfirmation.show("Save & Close", "Are you sure you want to close?");

        //tests if data is stored correctly in array List before serializing data
        //System.out.println(Game.videoGameData.toString());
        Game.serializeVGModel(VideoGameView.tableData);
        //if answer is true close the window
        if(ans == true)
        {
            System.out.println("Exited interface");
            System.exit(0);
        }

    }
    public static void closeBGProgram()
    {
        Boolean ans = CloseConfirmation.show("Save & Close", "Are you sure you want to close?");

        Game.serializeBGModel(BoardGameView.tableData);
        //if answer is true close the window
        if(ans == true)
        {
            System.out.println("Exited interface");
            System.exit(0);
        }

    }

    public static void closeCGProgram()
    {
        Boolean ans = CloseConfirmation.show("Save & Close", "Are you sure you want to close?");

        Game.serializeCGModel(CardGameView.cgTable);
        //if answer is true close the window
        if(ans == true)
        {
            System.out.println("Exited interface");
            System.exit(0);
        }

    }

    public static void addVGItems()
    {
        //add data from UI to the arrayList
        videoGameData.add(VideoGameView.vgData());

        //tests the data stored in the videoGame arrayList
        //System.out.println(Game.videoGameData.toString());

        //create an observable list to add data to table
        VideoGameView.tableData = FXCollections.observableArrayList(videoGameData);

        //Game.serializeVGModel(VideoGameView.tableData);
        //add observable list to table
        VideoGameView.table.getItems().clear();
        VideoGameView.table.getItems().addAll(VideoGameView.tableData);

    }

    public static void addBGItems()
    {
        //add data from UI to the arrayList
        Game.boardGameData.add(BoardGameView.bgData());

        //tests the data stored in the videoGame arrayList
        //System.out.println(Game.boardGameData.toString());

        //create an observable list to add data to table
        BoardGameView.tableData = FXCollections.observableArrayList(Game.boardGameData);

        //add data from video game view UI to the observable list
        BoardGameView.table.getItems().clear();
        //add observable list to table
        BoardGameView.table.getItems().addAll(BoardGameView.tableData);

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

    //method that deletes items from table selected by user
    public static void deleteVGItems()
    {
        ObservableList<VideoGames> selected_fields, all_fields;

        all_fields = VideoGameView.table.getItems();

        //sets selected_fields to the user selected items from the table
        selected_fields = VideoGameView.table.getSelectionModel().getSelectedItems();

        //remove selected items from all items
        selected_fields.forEach(all_fields::remove);

    }

    public static void deleteBGItems()
    {
        ObservableList<BoardGames> selected_fields, all_fields;

        all_fields = BoardGameView.table.getItems();

        //sets selected_fields to the user selected items from the table
        selected_fields = BoardGameView.table.getSelectionModel().getSelectedItems();

        //remove selected items from all items
        selected_fields.forEach(all_fields::remove);

    }

    public static void deleteCGItems()
    {
        ObservableList<CardGames> selected_fields, all_fields;

        all_fields = CardGameView.table.getItems();

        //sets selected_fields to the user selected items from the table
        selected_fields = CardGameView.table.getSelectionModel().getSelectedItems();

        //remove selected items from all items
        selected_fields.forEach(all_fields::remove);

    }
}
