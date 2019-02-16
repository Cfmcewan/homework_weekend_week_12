import MusicShop.MiscItems.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumSticks drumSticks;

    @Before
    public void setUp() {
        drumSticks = new DrumSticks(10.00, 16.00);

    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(6.00, drumSticks.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(16.00, drumSticks.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(10.00, drumSticks.getBuyingPrice(), 0.01);
    }
}
