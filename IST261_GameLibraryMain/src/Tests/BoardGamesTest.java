package Tests;

import Model.BoardGames;
import Model.VideoGames;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardGamesTest {

    BoardGames b = new BoardGames("Monopoly", "Classic Board Game", "In-Person, Mobile, PC, Xbox, Playstation", 8, "1935-02-06", null);
    @Test
    void testToString()
    {
        assertEquals("Name: " + "Monopoly" + "\nGenre: " + "Classic Board Game" +
                "\nSystem: " + "In-Person, Mobile, PC, Xbox, Playstation" + "\nPlayer Count: " + "8" + "\nRelease Date: " + "1935-02-06"
                + "\nDevleoper Info: \n" + "null", b.toString());

        BoardGames b2 = new BoardGames("","","",0,"",null);
        assertEquals("Name: " + "\nGenre: " +
                "\nSystem: " + "\nPlayer Count: " + "0" + "\nRelease Date: "
                + "\nDevleoper Info: \n" + "null", b2.toString());
    }

    @Test
    void releaseDateYear()
    {
        // only takes the year so no need to call the entire class
        assertEquals(1935, b.releaseDateYear(b.getReleaseDate()));
        //if empty release date is inserted should return 0
        assertEquals(0, b.releaseDateYear(""));

    }

    @Test
    void compareReleaseDates()
    {
        //create another board game to test the releasedates
        BoardGames b2 = new BoardGames("Sorry", "Classic Board Game", "In-Person, Mobile, PC, Xbox, Playstation", 4, "1930-08-04", null);

        //test comparing in both ways
        //test if vg1 was released before vg2
        assertEquals(false, b.compareReleaseDates(b2));
        //test if vg2 was released before vg1
        assertEquals(true, b2.compareReleaseDates(b));
    }
}