package InstrumentTest;

import models.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar(6);
    }

    @Test
    public void hasStrings() {
        assertEquals(6, guitar.getStrings(), 0);
    }

    @Test
    public void canPlay(){
        assertEquals("Guitar plays", guitar.play());
    }

}
