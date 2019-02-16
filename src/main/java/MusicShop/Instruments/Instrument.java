package MusicShop.Instruments;

public abstract class Instrument {

    private InstrumentType instrumentType;
    private String colour;
    private String model;
    private String material;
    private double buyingPrice;
    private double sellingPrice;


    public Instrument(InstrumentType instrumentType, String colour, String model, String material, double buyingPrice, double sellingPrice) {
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.model = model;
        this.material = material;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public String getMaterial() {
        return material;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
