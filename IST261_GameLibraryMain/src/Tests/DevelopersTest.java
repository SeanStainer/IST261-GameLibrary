package Tests;

import Model.Developers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevelopersTest {

    @Test
    void fullName()
    {
        Developers d = new Developers("Programmer", "John", "Smith");
        assertEquals("Smith, John", d.fullName());
        Developers d2 = new Developers("Programmer", "", "");
        assertEquals(", ", d2.fullName());

    }

    @Test
    void testToString()
    {
        Developers d = new Developers("Programmer", "John", "Smith");
        assertEquals("\n\tJob Title: Programmer\n\tName: Smith, John\n", d.toString());
        Developers d2 = new Developers("", "", "");
        assertEquals("\n\tJob Title: \n\tName: , \n", d2.toString());
    }
}