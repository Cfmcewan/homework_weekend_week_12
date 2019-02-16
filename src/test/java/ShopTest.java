import MusicShop.Instruments.Guitar;
import MusicShop.Instruments.InstrumentType;
import MusicShop.MiscItems.GuitarStrings;
import MusicShop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    GuitarStrings guitarStrings;


    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(InstrumentType.GUITAR, "Brown", "Gibson", "Wood", 1000.00, 1950.00, 4);
        guitarStrings = new GuitarStrings(6.00, 12.00);
        shop = new Shop("Music Shop", 100.00);
    }

    @Test
    public void hasName() {
        assertEquals("Music Shop", shop.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(100.00, shop.getTill(), 0.01);
    }

    @Test
    public void canSetTill(){
        shop.setTill(10.00);
        assertEquals(110.00, shop.getTill(), 0.01);
    }



    @Test
    public void canGetStockCountStartsEmpty() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddStock(){
        shop.addStock(guitar);
        shop.addStock(guitarStrings);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(guitar);
        shop.addStock(guitarStrings);
        shop.removeStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canCaluclateTotalStockProfit(){
        shop.addStock(guitar);
        shop.addStock(guitarStrings);
        assertEquals(956.00, shop.totalProfitOfStock(), 0.01);
    }

    @Test
    public void canCheckItemInStock(){
        shop.addStock(guitar);
        shop.addStock(guitarStrings);
        assertEquals(true, shop.checkIfItemInStock(guitar));

    }

    @Test
    public void canSellItem(){
        shop.addStock(guitar);
        shop.sellItem(guitar);
        assertEquals(1050.00, shop.getTill(), 0.01);
        assertEquals(0, shop.getStockCount());
    }
}
