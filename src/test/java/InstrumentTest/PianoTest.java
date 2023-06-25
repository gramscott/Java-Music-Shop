package InstrumentTest;

import models.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano(88);
    }

    @Test
    public void hasKeys(){
        assertEquals(88, piano.getKeys(), 0);
    }

    @Test
    public void canPlay(){
        assertEquals("Piano plays", piano.play());
    }


}
