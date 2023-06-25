package InstrumentTest;

import models.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp(){
        trumpet = new Trumpet(3);
    }

    @Test
    public void hasValves(){
        assertEquals(3, trumpet.getValves(), 0);
    }

    @Test
    public void canPlay(){
        assertEquals("Trumpet plays", trumpet.play());
    }

}
