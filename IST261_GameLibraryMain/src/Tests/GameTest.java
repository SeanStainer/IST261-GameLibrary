package Tests;

import Model.Game;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void testToString()
    {
        //test class with full information
        Game g = new Game("Witcher 3", "Open World, RPG, etc.", "Playstation, Xbox, PC", 1);
        assertEquals("Name: " + "Witcher 3" + "\nGenre: " + "Open World, RPG, etc." +
                "\nSystem: " + "Playstation, Xbox, PC" + "\nPlayer Count: " + "1", g.toString());

        //test empty class
        Game g2 = new Game("","","",0);
        assertEquals("Name: " +  "\nGenre: " +
                "\nSystem: " + "\nPlayer Count: " + "0", g2.toString());
    }
}