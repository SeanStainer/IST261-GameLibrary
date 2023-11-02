package Tests;

import Model.CardGames;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardGamesTest {

    @Test
    void testToString()
    {
        CardGames c = new CardGames("Texas Holdem", "Poker Style", "In-Person, PC, Xbox, Playstation", 10, false);
        assertEquals("Name: " + "Texas Holdem" + "\nGenre: " + "Poker Style" +
                "\nSystem: " + "In-Person, PC, Xbox, Playstation" + "\nPlayer Count: " + "10" + "\nJoker Used: " + "false", c.toString());

        CardGames c2 = new CardGames("","","",0,false);
        assertEquals("Name: " + "" + "\nGenre: " + "" +
                "\nSystem: " + "" + "\nPlayer Count: " + "0" + "\nJoker Used: " + "false", c2.toString());
    }
}