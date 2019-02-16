package MusicShop.Instruments;

import MusicShop.IPlay;
import MusicShop.ISell;

public class Saxophone extends Instrument implements IPlay, ISell {

    private String pitch;

    public Saxophone(InstrumentType instrumentType, String colour, String model, String material, double buyingPrice, double sellingPrice, String pitch){
        super(instrumentType, colour, model, material, buyingPrice, sellingPrice);
        this.pitch = pitch;
    }

    public String getPitch() {
        return pitch;
    }

    public String play(){
        return "Careless Whisper";
    }


    public double calculateMarkup(){
        return this.getSellingPrice() - this.getBuyingPrice();
    }

}
