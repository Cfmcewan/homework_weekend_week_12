import MusicShop.MiscItems.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp() {
        guitarStrings = new GuitarStrings(6.00, 12.00);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(6.00, guitarStrings.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(12.00, guitarStrings.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(6.00, guitarStrings.getBuyingPrice(), 0.01);
    }
}
