import MusicShop.Instruments.Guitar;
import MusicShop.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(InstrumentType.GUITAR, "Brown", "Gibson", "Wood", 1000.00, 1950.00, 4);
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(4, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("While my guitar gently weeps", guitar.play());
    }

    @Test
    public void canGetModel(){
        assertEquals("Gibson", guitar.getModel());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(1000.00, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(950.00, guitar.calculateMarkup(), 0.01);
    }

}