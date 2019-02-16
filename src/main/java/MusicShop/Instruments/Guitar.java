package MusicShop.Instruments;

import MusicShop.IPlay;
import MusicShop.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numberOfStrings;

    public Guitar(InstrumentType instrumentType, String colour, String model, String material, double buyingPrice, double sellingPrice, int numberOfStrings){
        super(instrumentType, colour, model, material, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public String play(){
        return "While my guitar gently weeps";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public double calculateMarkup(){
        return this.getSellingPrice() - this.getBuyingPrice();

    }
}
