package MusicShop.MiscItems;

import MusicShop.ISell;

public class GuitarStrings extends MiscalleneousItem implements ISell {

    public GuitarStrings(double buyingPrice, double sellingPrice) {
        super(buyingPrice, sellingPrice);
    }

    public double calculateMarkup(){
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
