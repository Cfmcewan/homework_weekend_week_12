import MusicShop.Instruments.InstrumentType;
import MusicShop.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(InstrumentType.PIANO, "Black", "Steinway", "Wood", 30000.00, 60000.00, "750N");
    }

    @Test
    public void hasStringTension() {
        assertEquals("750N", piano.getStringTension());
    }

    @Test
    public void canPlay() {
        assertEquals("Clair de Lune", piano.play());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(60000.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(30000.00, piano.calculateMarkup(), 0.01);
    }



}

