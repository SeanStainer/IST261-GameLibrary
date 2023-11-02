package Tests;

import Model.VideoGames;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideoGamesTest {

    VideoGames vg1 = new VideoGames("Witcher 3", "Open World, RPG, etc.", "Playstation, Xbox, PC", 1, "2018-05-18", true, null);

    @Test
    void testToString()
    {
        assertEquals("Name: " + "Witcher 3" + "\nGenre: " + "Open World, RPG, etc." +
                "\nSystem: " + "Playstation, Xbox, PC" + "\nPlayer Count: " + "1" + "\nRelease Date: "
                + "2018-05-18" + "\nGOTY Winner: " + "true"
                + "\nDevleoper Info: \n" + "null", vg1.toString());

        VideoGames v2 = new VideoGames("","","",0,"",false,null);
        assertEquals("Name: " + "\nGenre: " +
                "\nSystem: " + "\nPlayer Count: " + "0" + "\nRelease Date: "
                + "\nGOTY Winner: " + "false"
                + "\nDevleoper Info: \n" + "null", v2.toString());
    }

    @Test
    void releaseDateYear()
    {
        // only takes the year so no need to call the entire class
        assertEquals(2018, vg1.releaseDateYear("2018-05-18"));
        //if empty release date is inserted should return 0
        assertEquals(0, vg1.releaseDateYear(""));

    }

    @Test
    void compareReleaseDates()
    {
        //create another video game to test the releasedates
        VideoGames vg2 = new VideoGames("Portal", "Puzzle", "PC", 1, "2007-10-10", true, null);

        //test comparing in both ways
        //test if vg1 was released before vg2
        assertEquals(false, vg1.compareReleaseDates(vg2));
        //test if vg2 was released before vg1
        assertEquals(true, vg2.compareReleaseDates(vg1));
    }
}


