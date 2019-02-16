package MusicShop.MiscItems;

import MusicShop.ISell;

public class DrumSticks extends MiscalleneousItem implements ISell {

    public DrumSticks(double buyingPrice, double sellingPrice) {
        super(buyingPrice, sellingPrice);
    }


    public double calculateMarkup(){
        return this.getSellingPrice() - this.getBuyingPrice();
    }

}
