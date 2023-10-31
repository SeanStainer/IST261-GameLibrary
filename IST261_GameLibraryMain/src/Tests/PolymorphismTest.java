package Tests;

import Model.VideoGames;
import Model.BoardGames;
import Model.CardGames;
import Model.VideoGames;
import Model.Developers;
import Model.Game;
import javafx.application.Application;

public abstract class PolymorphismTest extends Application
{
    public static void main(String[] args) {

        //Spacing
        System.out.println("VideoGames comparable interface: ");

        /*
         * Create 2 classes that compare the dates for Video Games
         * */
        VideoGames vg1 = new VideoGames("Witcher 3", "Open World, RPG, etc.", "Playstation, Xbox, PC", 1, "2018-05-18", true, null);
        VideoGames vg2 = new VideoGames("Portal", "Puzzle", "PC", 1, "2007-10-10", true, null);

        /*
         * Test output based on the comparable interface
         * */
        if (vg1.compareReleaseDates(vg2)) {
            System.out.println(vg1.getName() + " was released before " + vg2.getName());
        } else {
            System.out.println(vg2.getName() + " was released before " + vg1.getName());
        }

        //Spacing
        System.out.println("\nBoardGames comparable interface: ");

        /*
         * Create 2 classes that compare the dates for Board Games
         * */
        BoardGames bg1 = new BoardGames("Monopoly", "Classic Board Game", "In-Person, Mobile, PC, Xbox, Playstation", 8, "1935-02-06", null);
        BoardGames bg2 = new BoardGames("Sorry", "Classic Board Game", "In-Person, Mobile, PC, Xbox, Playstation", 4, "1930-08-04", null);

        if(bg1.compareReleaseDates(bg2))
        {
            System.out.println(bg1.getName() + " was released before " + bg2.getName());
        }
        else
        {
            System.out.println(bg2.getName() + " was released before " + bg1.getName());
        }
    }
}
