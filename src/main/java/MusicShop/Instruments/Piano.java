package MusicShop.Instruments;

import MusicShop.IPlay;
import MusicShop.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private String stringTension;

    public Piano(InstrumentType instrumentType, String colour, String model, String material, double buyingPrice, double sellingPrice, String stringTension){
        super(instrumentType, colour, model, material, buyingPrice, sellingPrice);
        this.stringTension = stringTension;
    }

    public String getStringTension() {
        return stringTension;
    }

    public String play(){
        return "Clair de Lune";
    }

    public double calculateMarkup(){
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
