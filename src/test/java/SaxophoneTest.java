import MusicShop.Instruments.InstrumentType;
import MusicShop.Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() {
        saxophone = new Saxophone(InstrumentType.SAXOPHONE, "gold", "Mendini", "Brass", 500.00, 1000.00, "Eb");
    }

    @Test
    public void hasPitch() {
        assertEquals("Eb", saxophone.getPitch());
    }

    @Test
    public void canPlay() {
        assertEquals("Careless Whisper", saxophone.play());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.SAXOPHONE, saxophone.getInstrumentType());
    }

    @Test
    public void canGetColour(){
        assertEquals("gold", saxophone.getColour());
    }


    @Test
    public void canCalculateMarkup(){
        assertEquals(500.00, saxophone.calculateMarkup(), 0.01);
    }
}
